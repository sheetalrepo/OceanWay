package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * MergeSort is a divide and conquer algorithm. 
 * 1. It first divides a large list into two smaller sub-lists based on pivot(generally middle value) 
 *    Two smaller list get created by simply cutting big array into two from center.
 * 2. Again smaller list cut into two piece 
 * 3. once all element get cut into single element then we join/merge them back in sorted order 
 * 
 *
 * Complexity:
 * Avg: O(n log(n))
 * Worst: O(n log(n))   | worst case is better than quick
 * 
 * Adv:
 * 1. Very fast
 * 2. Take less space because of recursion 	
 *
 * Disadv:
 * Take a bit more space than Quick Sort
 * Bucket Sort, Radix Sort and Counting Sort are better than Merge sort
 * 
 *
 */
public class E_MergeSort 
{


    public static void mergesort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        mergesort(a, low, mid); 
        mergesort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
    
    
    public static void main(String[] args) 
    {
    	System.out.println("Merge Sort: ");
    	int[] arr = { 9, 2, 4, 7, 3, 8, 10 };
    	System.out.println(Arrays.toString(arr));
    	
    	int len = arr.length;
    	mergesort(arr, 0, len);
    	System.out.println(Arrays.toString(arr));  
    }    
}
