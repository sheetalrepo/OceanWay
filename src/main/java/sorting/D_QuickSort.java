package sorting;

import java.util.Arrays;

/**
 * Quicksort is a divide and conquer algorithm. 
 * 1. It first divides a large list into two smaller sub-lists based on pivot(generally middle value) 
 *    Two smaller list created such that one contains smaller value than pivot and another contains higher value.
 * 2. Again new pivot selected in two arrays and same logic applied 
 * 
 *
 * Complexity:
 * Avg: O(n log(n))
 * Worst: O(n^2)
 * 
 * Adv:
 * 1. Very fast
 * 2. Take less space because of recursion 	
 *
 * Disadv:
 * ->Merge Sort, Heap Sort are better options
 * ->Bucket Sort, Radix Sort and Counting Sort are better but only for small set
 * ->Imp (interview): Worst case occur if array is already sorted in asc or desc or same element in arr and
 *   pivot is selected as min or max element 
 *   refer:https://www.geeksforgeeks.org/when-does-the-worst-case-of-quicksort-occur/
 *   
 */
public class D_QuickSort {
	
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Quick Sort: ");
		int[] arr = { 9, 2, 4, 7, 3, 8, 10 };
		System.out.println(Arrays.toString(arr));
 
		int low = 0;
		int high = arr.length - 1;
 
		quickSort(arr, low, high);
		System.out.println(Arrays.toString(arr));
	}
}
