package interview;

import java.util.Scanner;

public class A_PalendromeTest {

	/**
	 * This work for strings including ints (read them as string)
	 * 
	 * palindrome examples : aba, madam, level, kayak etc
	 */
	public void stringTest(String str) {
		String rev = "";
		int len = str.length() - 1;

		for (int i = len; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev))
			System.out.println(str + " is palendrome");
		else
			System.out.println(str + " is not a palendrome");
	}

	
	
	/**
	 * Only for integers
	 */
	public void intTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		
		int n = sc.nextInt();  // 1234321
		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

	public static void main(String[] args) {
		A_PalendromeTest obj = new A_PalendromeTest();
		obj.stringTest("madam");
		//obj.intTest();
	}
}
