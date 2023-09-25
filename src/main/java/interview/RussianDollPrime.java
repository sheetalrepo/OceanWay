package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Russian doll prime no: Its a prime number and if we keep removing right most
 * digit then the remaining number should also be prime
 * 
 * Failed cases: 0, 1, 2, 4, 17, 
 * Working cases: 29, 37, 77, 373, 239
 * 
 * Valid Russian doll prime no: 29, 37, 239
 */
public class RussianDollPrime {

	public static void main(String[] args) throws IOException {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter data to be validated against Dolly prime : ");
		String str = buff.readLine();
		int i = Integer.parseInt(str);

		int x = i;
		int k;
		int n = x;

		for (k = String.valueOf(x).length() - 1; k > 0; k--) {
			System.out.println(n);
			if (isPrime(n)) {
				String m = String.valueOf(n).substring(0, k);
				System.out.println(">>" + m + "   >>" + k);
				n = Integer.parseInt(m);
				continue;

			} else {
				break;
			}
		}

		if (k == 0) {
			System.out.println("Number is Russianl Doll Number " + x);
		} else {
			System.out.println("Number is not Russianl Doll Number " + x);
		}

	}

	private static boolean isPrime(int input) {
		boolean check = true;
		for (int i = 2; i < input / 2; i++) {
			if ((input % i) == 0) {

				check = false;

			}
		}

		return check;
	}

}