package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Q: Write a java program to find the duplicate words and their number of
 * occurrences in a string?
 * 
 * 
 */

public class A_DuplicateWordInAString {

	// Complexity: N^2
	public void method1(String str) {
		String[] arr = str.split(" ");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println("Dublicate word is: " + arr[i] + ", count is: " + count);
				break;
			}
			count = 0;
		}

	}

	// Complexity 2N
	public void method2(String s) {

		String[] arr = s.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : arr) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		//Set<String> set = map.keySet();
		for(String key: map.keySet()){
			if(map.get(key) > 1){
				System.out.println(key+" "+map.get(key));
			}
		}
	}

	public static void main(String[] args) {
		A_DuplicateWordInAString obj = new A_DuplicateWordInAString();
		obj.method1("Super Super Man Bat Man Spider Man");
		//obj.method2("Super Man Bat Man Spider Man");
	}
}
