package classes.primitives;

import java.math.BigDecimal;

/**
 * NOT WORKING
 * 
 * Rule: For Money related calculations never use Double or Float, always go for
 * BigDecimal, int and long
 * 
 * @author Sheetal_Singh
 */
public class Money {

	public static void subtractionIssue1() {
		System.out.println(1.03 - 0.42);
		System.out.println(1 - 0.99);
		System.out.println(1 - 0.90);
	}

	public static void subtractionIssue2() {
		System.out.println(new BigDecimal(1.03).subtract(new BigDecimal(0.42)));
		System.out.println(new BigDecimal(1.00).subtract(new BigDecimal(0.99)));
		System.out.println(new BigDecimal(1.00).subtract(new BigDecimal(0.90)));
	}

	/**
	 * Question: How many candy can be bought with Rs 1. Given one candy costs 10
	 * Paise
	 */
	public static void OneCandyLessProblem1() {
		double walletBalance = 1.00;
		double candyPrice = 0.10;
		int candyCount = 0;

		while (walletBalance >= candyPrice) {
			walletBalance = walletBalance - candyPrice;
			candyCount++;
		}

		System.out.println("Candy Count:" + candyCount);
		System.out.println("Wallet Balance:" + walletBalance); // Wallet still have some money
	}

	/**
	 * Try yourself
	 */
	public static void OneCandyLessProblem2() {

		BigDecimal walletBalance = new BigDecimal(1.00);
		BigDecimal candyPrice = new BigDecimal(0.10);
		int candyCount = 0;

		while (walletBalance.compareTo(candyPrice) >= 0) {
			walletBalance = walletBalance.subtract(candyPrice);
			candyCount++;
		}

		System.out.println("Candy Count:" + candyCount);
		System.out.println("Wallet Balance:" + walletBalance); // Wallet still have some money
		// Effective Java Item 48 Page 218

	}

	public static void main(String[] args) {
		subtractionIssue1();
		subtractionIssue2();
		OneCandyLessProblem1();
		OneCandyLessProblem2();
	}

}
