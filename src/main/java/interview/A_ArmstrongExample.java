package interview;

import java.util.Scanner;

/**
 * 153 = 1^3 + 5^3 + 3^3 |  1634 = 1^4 + 6^4 + 3^4 + 4^4
 */
class A_ArmstrongExample {

	public void armstrongCheck() {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		int length = str.length();

		int sum = 0;
		int temp = num;

		while (num > 0) {
			int reminder = num % 10;
			num = num / 10;
			sum = (int) (sum + Math.pow(reminder, length));
		}

		if (temp == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong No");
		}
	}

	public static void main(String[] args) {
		A_ArmstrongExample obj = new A_ArmstrongExample();
		obj.armstrongCheck();
	}
}
