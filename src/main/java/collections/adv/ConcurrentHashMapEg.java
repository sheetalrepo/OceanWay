package collections.adv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 * ConcurrentHashMap
 * 1. Used in case of multi-threading env i.e. high concurrencies
 * 2. Not synchronize whole Map as in case of Sync HashMap
 * 3. No locking at object level rather at hashmap bucket level
 * 
 * SynchronizedHashMap
 * 1. Synchronization at Object level.
 * 2. Every read/write operation needs to acquire lock.
 * 3. Locking the entire collection is a performance overhead
 * 4. This essentially gives access to only one thread to the entire map & blocks all the other threads.
 * 
 * ref: http://crunchify.com/hashmap-vs-concurrenthashmap-vs-synchronizedmap-how-a-hashmap-can-be-synchronized-in-java/
 */
public class ConcurrentHashMapEg {
	 
	public final static int THREAD_POOL_SIZE = 5;
 
	public static Map<String, Integer> hashTable = null;
	public static Map<String, Integer> syncHashMap = null;
	public static Map<String, Integer> concHashMap = null;
 
	public static void main(String[] args) throws InterruptedException {
 
		// Test with Hashtable Object
		hashTable = new Hashtable<String, Integer>();
		performTest(hashTable);
 
		// Test with synchronizedMap Object
		Map<String, Integer> syncHashMap = new HashMap<String,Integer>();
		syncHashMap = Collections.synchronizedMap(syncHashMap);  //This way we can make HaspMap similar to Hashtable
		performTest(syncHashMap);
 
		// Test with ConcurrentHashMap Object
		concHashMap = new ConcurrentHashMap<String, Integer>();
		performTest(concHashMap);
 
	}
 
	public static void performTest(final Map<String, Integer> crunchifyThreads) throws InterruptedException {
 
		System.out.println("Test started for: " + crunchifyThreads.getClass());
		long averageTime = 0;
		for (int i = 0; i < 5; i++) {
 
			long startTime = System.nanoTime();
			ExecutorService crunchifyExServer = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
 
			for (int j = 0; j < THREAD_POOL_SIZE; j++) {
				crunchifyExServer.execute(new Runnable() {
					@SuppressWarnings("unused")
					@Override
					public void run() {
 
						for (int i = 0; i < 500000; i++) {
							Integer crunchifyRandomNumber = (int) Math.ceil(Math.random() * 550000);
 
							// Retrieve value. We are not using it anywhere
							Integer crunchifyValue = crunchifyThreads.get(String.valueOf(crunchifyRandomNumber));
 
							// Put value
							crunchifyThreads.put(String.valueOf(crunchifyRandomNumber), crunchifyRandomNumber);
						}
					}
				});
			}
 
			// Make sure executor stops
			crunchifyExServer.shutdown();
 
			// Blocks until all tasks have completed execution after a shutdown request
			crunchifyExServer.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
 
			long entTime = System.nanoTime();
			long totalTime = (entTime - startTime) / 1000000L;
			averageTime += totalTime;
			System.out.println("2500K entried added/retrieved in " + totalTime + " ms");
		}
		System.out.println("For " + crunchifyThreads.getClass() + " the average time is " + averageTime / 5 + " ms\n");
	}
}
