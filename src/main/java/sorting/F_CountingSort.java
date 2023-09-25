package sorting;

import java.util.Arrays;

/**
 * CountingSort is a integer based Algo just like Radix and Bucket Sort refer:
 * http://www.java67.com/2017/06/counting-sort-in-java-example.html
 * 
 * Complexity: Avg: O(log(n+k)) Worst: O(log(n+k))
 * 
 * Adv: 
 * Fastest also as of now
 *
 * Disadv:
 * No
 * 
 *
 */
public class F_CountingSort {

	public static void countingSort(int[] input, int k) {
		// create buckets
		int counter[] = new int[k + 1];
		// fill buckets
		for (int i : input) {
			counter[i]++;
		}
		// sort array
		int ndx = 0;

		for (int i = 0; i < counter.length; i++) {
			while (0 < counter[i]) {
				input[ndx++] = i;
				counter[i]--;
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Counting Sort:");
		int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
		System.out.println(Arrays.toString(input));
		
		int k = 60; //max number value in array
		countingSort(input, k);
		System.out.println(Arrays.toString(input));
	}


}
