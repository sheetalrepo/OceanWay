package b_collections.a_basics;

import java.util.Arrays;
/**

 Binary search is an efficient algorithm used to find an element in a sorted array by repeatedly dividing the search range in half.

 How It Works
 Start in the middle of the array.
 If the middle element is the target → Return index.
 If the target is smaller, search the left half.
 If the target is larger, search the right half.
 Repeat until found or search range becomes empty.

 Efficiency
 ✅ Time Complexity: O(log n) → Much faster than linear search (O(n)). 
 ✅ Works only on sorted arrays → Always sort before using. 
 ✅ Used in built-in method: Arrays.binarySearch(array, value).

 */
public class ArraysBinarySearch {

	public static void sortArray() {
		String[] names = {"Charlie", "Alice", "Bob", "Eve", "David"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		System.out.println("======================================");
	}


	//Binary search only work on sorted array
	public static void binarySearch1() {
		String[] names = {"Charlie", "Alice", "Bob", "Eve", "David"};
		System.out.println(Arrays.binarySearch(names, "Alice"));     // -1
		System.out.println("======================================");
	}

	public static void binarySearch2() {
		String[] names = {"Charlie", "Alice", "Bob", "Eve", "David"};
		Arrays.sort(names); //IMP
		System.out.println(Arrays.binarySearch(names, "Bob"));     // 1  print index
		System.out.println(Arrays.binarySearch(names, "Abc"));     // -1 print -1 incase not found 
		System.out.println("======================================");
	}

	public static void searchCharInString(String s1, char ch) {
		char[] arr = s1.toCharArray();
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, ch);

		System.out.println("index of "+ch+" is "+index+ " in "+ ch);
		System.out.println("======================================");
	}
	
	public static void main(String[] args) {
		sortArray();
		binarySearch1();
		binarySearch2();
		searchCharInString("addfse", 'f');
	}
}
