package brokenpractices;

import java.math.BigDecimal;

/**
 * Rule: For Money related calculations never use Double or Float, always go for
 * BigDecimal, int and long
 * 
 * @author Sheetal_Singh
 */
public class A_MoneySolution {

	public static void subtractionSolution() {
		System.out.println("Difference Solution:");
		BigDecimal num1 = BigDecimal.valueOf(1);
		BigDecimal num2 = BigDecimal.valueOf(0.90);
		System.out.println("Correct Answer: " + num1.subtract(num2));
	}

	
	
	
	
	public static void CandySolution() {
		System.out.println("\n\nCandy Solution:");
		BigDecimal walletBalance = BigDecimal.valueOf(1.00);
		BigDecimal candyPrice = BigDecimal.valueOf(0.10);
		int candyCount = 0;

		while (walletBalance.compareTo(candyPrice) >= 0) {
			walletBalance = walletBalance.subtract(candyPrice);
			candyCount++;
		}

		System.out.println("Candy Count:" + candyCount);
		System.out.println("Wallet Balance:" + walletBalance);

	}

	public static void main(String[] args) {
		subtractionSolution();
		CandySolution();
	}

}
