package interview;

import java.util.Scanner;

public class ExtractIntFromString {

	public void extractInt() {
		Scanner sc = new Scanner("Hello 123").useDelimiter("[^0-9]+");
		int n = sc.nextInt();
		System.out.println(n);
	}

	// replace all with blank space except [0-9]
	public void extractInt2() {
		String str = "Hello 8989 66 add 23";
		String intValue = str.replaceAll("[^0-9]", "");
		System.out.println(intValue);

	}

	public static void main(String[] args) {

		ExtractIntFromString obj = new ExtractIntFromString();
		obj.extractInt();
		obj.extractInt2();
	}

}
