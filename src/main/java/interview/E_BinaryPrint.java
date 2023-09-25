package interview;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Binary numbers for given number
 */
public class E_BinaryPrint {

	public static void binary() {
		System.out.println("Enter few numbers space separated:");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] arr = line.split(" ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int input = Integer.parseInt(arr[i]);
			System.out.println(Integer.toBinaryString(input));
		}
	}

	public static void printTheBinaryNumbers(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(Integer.toBinaryString(i) + " ");
		}
		System.out.println();
	}

	public static void binaryUsingQueue() {
		System.out.println("Input Count? and Test Data?");
		Scanner sc = new Scanner(System.in);
		int numberOfTc = sc.nextInt();
		Queue<Integer> tcData = new PriorityQueue<Integer>();
		for (int i = 1; i <= numberOfTc; i++) {
			int data = sc.nextInt();
			tcData.add(data);
		}
		for (Integer i : tcData) {
			printTheBinaryNumbers(i);
		}
	}

	public static void main(String[] args) {
		//binaryUsingQueue();
		binary();

	}

}
