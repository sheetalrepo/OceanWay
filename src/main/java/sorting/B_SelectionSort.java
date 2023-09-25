package sorting;

import java.util.Arrays;

/**
 * Selection Sort is the most basic and simple sorting algo
 * 
 * Here we find minimum element in array and swap it with left most element
 * 
 * Worst and Average Case Complexity : O(n^2) 
 * 
 * 
 * Adv:
 * simple to implement
 * good in condition where memory is low
 * 
 * Disadv:
 * Inefficient, not practical for large set
 * 
 */
public class B_SelectionSort {
	public static int[] selectionSort(int[] arr) {
		int n = arr.length; 
		  
        
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min]) 
                    min = j; 
  
            // Swap the found minimum element with the first element 
            int temp = arr[min]; 
            arr[min] = arr[i]; 
            arr[i] = temp; 
        } 
        
        return arr ;
	}
	
	
	public static void main(String a[]) {
		System.out.println("Selection Sort: ");
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = selectionSort(arr1);
		System.out.println(Arrays.toString(arr2));
	}
}
