package sorting;

import java.util.Arrays;

/**
 * Refer: 
 * https://www.geeksforgeeks.org/time-complexities-of-all-sorting-algorithms/
 * http://bigocheatsheet.com/
 * 
 * Bubble Sort is the most basic and simple sorting algo
 * 
 * Here we compare first element with next and if first element is bigger then we swap two numbers
 * 
 * Worst and Average Case Complexity : O(n^2) where n is number of item to be sorted; as we have two for loop one inside another hence O(n) * O(n)
 * Best case Complexity : O(n) i.e. array is already sorted; here we need only one for loop
 * 
 * Adv:
 * simple to implement
 * 
 * Disadv:
 * Inefficient, not practical for large set
 * worst that insertion and selection sort
 * 
 */
public class A_BubbleSort {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;

		//outer for loop runs for 1 to 7 i.e. 7 times(length)
		//pls note i has no role to play with j calculation
		for (int i = 1; i <= n; i++) {   
			for (int j = 1; j < n; j++) {    // 1 < 7 i.e. 6 times only
				if (arr[j - 1] > arr[j]) {         //arr[0] > arr[1]
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Bubble Sort: ");
		int [] arr = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
