package interview;

import java.util.Map;
import java.util.TreeMap;

public class SortArrayByLastIndex {

	public static void main(String[] args) {
		int[] arr = { 123, 900, 531, 92 };
		// output : 900, 531, 92, 123

		Map<Integer, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			int input = arr[i];
			int lastIndex = input % 10;
			map.put(lastIndex, input);
		}
		
		System.out.println(map);
	}

}
