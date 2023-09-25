package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * find repeated int in an array
 */
public class B_CountRepeatedIntegers {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 5, 5, 6, 6, 5, 4, 4, 2 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			Integer val = map.get(arr[i]);
			if (val == null) {
				map.put(arr[i], 1);				
			} else {
				map.put(arr[i], val + 1);
			}
		}

		System.out.println("Map: "+map);

		// To find max key value pair
		int max_value = 0;
		int max_key = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max_value) {
				max_key = entry.getKey();
				max_value = entry.getValue();
			}
		}

		System.out.println("Key with max occurance is :   " + max_key + " : " + max_value);
	}

}
