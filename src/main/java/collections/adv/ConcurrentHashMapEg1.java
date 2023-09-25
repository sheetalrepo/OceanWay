package collections.adv;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


/**
 * ConcurrentHashMap doesn't allow null key or value - get Runtime Null Pointer Exception
 *
 */
public class ConcurrentHashMapEg1 {

	public static void main(String [] args){
		Map<String,String> hm=new HashMap<>();
		hm.put("1", "One");
		hm.put("2", null);
		hm.put("3", null);
		hm.put(null, "Four");
		
		Set<String> set1 = hm.keySet();
		for(String key : set1){
			System.out.println(key + ": "+hm.get(key));
		}
		
		
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
		chm.put("A", "apple");
		chm.put("B", "boy");
		//chm.put("C", null);
		//chm.put(null, "dog");
		
		Set<String> set2 = chm.keySet();
		for(String key : set2){
			System.out.println(key + ": "+chm.get(key));
		}
		
	}
}
