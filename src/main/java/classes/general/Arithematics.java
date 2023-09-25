package classes.general;

import java.math.BigInteger;

public class Arithematics {
	/*
	 * Multiply, add, subtract, divide two numbers without using operators
	 */
	public void usingBigInteger() {
		// addition
		BigInteger bi1 = new BigInteger("10");
		BigInteger bi2 = new BigInteger("20");
		System.out.println(bi2.add(bi1));

		// other operations
		// String a = String.valueOf(30); - both convert int to string
		// String b = Integer.toString(30);

		int number1 = 200;
		int number2 = 100;
		System.out.println(new BigInteger(String.valueOf(number1))
				.divide(new BigInteger(String.valueOf(number2)))); // 2
		System.out.println(new BigInteger(String.valueOf(number1))
				.multiply(new BigInteger(String.valueOf(number2)))); // 20000

		System.out.println(new BigInteger(String.valueOf(number1))
				.add(new BigInteger(String.valueOf(number2)))); // 300
		System.out.println(new BigInteger(String.valueOf(number1))
				.subtract(new BigInteger(String.valueOf(number2)))); // 100

	}

	// How to multiply and divide a number with 2 w/o using * and / operators
	public void multDivBy2() {
		int number = 100;
		System.out.println(number >> 1); // 50
		System.out.println(number << 1); // 200
	}

	public static void main(String args[]) {

		Arithematics obj = new Arithematics();
		obj.usingBigInteger();
		// obj.multDivBy2();
	}
}
