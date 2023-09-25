package brokenpractices;

public class A_MoneyProblem {

	public static void subtractionProblem() {
		System.out.println("Difference Problem: ");
		System.out.println(1 - 0.90); 
		System.out.println(1 - 0.99); 
		System.out.println(1.03 - 0.42);

	}

	/**
	 * Question: How many candy can be bought with $1 
	 * Given one candy costs 10 Cents
	 * 
	 */
	public static void CandyProblem() {
		System.out.println("\n\nCandy Problem:");
		double walletBalance = 1.00;
		double candyPrice = 0.10;
		int candyCount = 0;

		while (walletBalance >= candyPrice) {
			walletBalance = walletBalance - candyPrice;
			candyCount++;
		}

		System.out.println("Candy Count:" + candyCount);
		System.out.println("Wallet Balance:" + walletBalance); 
	}

	public static void main(String[] args) {
		//subtractionProblem();
		CandyProblem();
	}

}
