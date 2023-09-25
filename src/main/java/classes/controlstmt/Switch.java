package classes.controlstmt;

import java.util.Scanner;

public class Switch {

//	public static void SwitchUsingInt() {
//
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter any no 1 to 5, and press q to exit");
//		int i = -1;
//
//		// while loop keep checking next int and stop if non int comes
//		while (s.hasNextInt()) {
//			i = s.nextInt();
//		}
//
//		switch (i) {
//		case 1:
//			System.out.println("One");
//			break;
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		case 4:
//			System.out.println("Four");
//			break;
//		case 5:
//			System.out.println("Five");
//			break;
//		default:
//			System.out.println("Invalid input");
//		}
//
//	}

	public static void SwitchUsingString() {
		String str = "two";
		switch (str) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("no match");
		}
	}

	public static void main(String[] args) {

		//SwitchUsingInt();
		SwitchUsingString();
	}
}
