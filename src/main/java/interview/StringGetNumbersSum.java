package interview;

import java.util.Scanner;

public class StringGetNumbersSum {

	public void getSumOfAlldigits() {
		Scanner sc = new Scanner("x1 r2kk3 4 x50y 7g");
		sc.useDelimiter("[^0-9]*"); // note we use *

		// System.out.println(sc.nextLine());
		int sum = 0;
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			sum = sum + n;
		}
		System.out.println(sum); // 22

	}

	public void getSumOfAllNumbers() {
		Scanner sc = new Scanner("x1 r2kk3 4 x50y 7g");
		sc.useDelimiter("[^0-9]+"); // note we use +

		// System.out.println(sc.nextLine());
		int sum = 0;
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			sum = sum + n;
		}
		System.out.println(sum); // 67

	}

	public void getSumOfAlldigitsWithoutFormula() {
		Scanner sc = new Scanner("x1 r2kk3 4 x50y 7g");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();

		int sum = 0;
		for (char ch : arr) {
			try {
				int a = Integer.parseInt(String.valueOf(ch));
				sum = sum + a;
			} catch (NumberFormatException n) {
				// exception will come when char encounter
			}
		}
		System.out.println(sum); // 22
	}

	public static void main(String[] args) {
		StringGetNumbersSum obj = new StringGetNumbersSum();
		// obj.getSumOfAlldigits();
		// obj.getSumOfAllNumbers();
		obj.getSumOfAlldigitsWithoutFormula();
	}

}
