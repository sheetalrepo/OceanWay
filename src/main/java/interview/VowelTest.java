package interview;

import java.util.Scanner;

public class VowelTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// char c = str.charAt(0);
		char c = str.toLowerCase().charAt(0);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Vowel");
		} else {
			System.out.println("Not a vowel");
		}
	}
}
