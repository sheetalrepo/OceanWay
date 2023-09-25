package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class HashMapCompare2 {

	
	public void compareHashMap(Map<String, String> hashMap1,
			Map<String, String> hashMap2) {
		String result = "";
		try {
			if (hashMap1.keySet().equals(hashMap2.keySet())) {
				System.out.println("Keys are extactly matching in two hashmap, Now value need to check");
				
				//Get combined <Key, Boolean> Map
				final Map<String, Boolean> comparisonResult = compareValues(hashMap1, hashMap2);

				//
				for (final Entry<String, Boolean> entry : comparisonResult.entrySet()) {
					System.out.println("Key:" + entry.getKey() + ", Value: "+ entry.getValue());
					result = result + entry.getValue();
					System.out.println("-->"+result);
				}
				if (result.contains("false")){
					System.out.println("Exception 1.....");
				}
			} else{
				System.out.println("Keys are not extactly matching in two hashmap");
			}
		} catch (NullPointerException n) {
			System.out.println("Expected/Actual as is null");
		}
	}

	public static <K extends Comparable<? super K>, V> Map<K, Boolean> compareValues(final Map<K, V> map1, final Map<K, V> map2) {
		final Collection<K> allKeys = new HashSet<>();
		allKeys.addAll(map1.keySet());
		allKeys.addAll(map2.keySet());
		
		final Map<K, Boolean> result = new TreeMap<>();
		for (final K key : allKeys) {
			result.put(key, map1.containsKey(key) == map2.containsKey(key) && Boolean.valueOf(testValues(map1.get(key), map2.get(key))));
		}
		return result;
	}

	private static boolean testValues(final Object val1, final Object val2) {
		return val1 == val2 || (val1 != null && val1.equals(val2));
	}

	
	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "Apple");
		map1.put("C", "Cat");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("A", "Apple");
		map2.put("C", "Cat");
		
		HashMapCompare2 obj = new HashMapCompare2();
		obj.compareHashMap(map1, map2);

	}

}
