package collections;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}

		print(arr); // 0 1 2 3 4 5 6 7 8 9
		Arrays.fill(arr, 2, 6, 50);
		print(arr); // 0 1 50 50 50 50 6 7 8 9
		Arrays.sort(arr);
		print(arr); // 0 1 6 7 8 9 50 50 50 50
		int index = Arrays.binarySearch(arr, 9);
		System.out.println(index); // 5
	}
}
