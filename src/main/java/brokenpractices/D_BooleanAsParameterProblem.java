package brokenpractices;

public class D_BooleanAsParameterProblem {

	public static double calculatePrice(double c, double margin, boolean flag) {
		double cost = c;
		double price = cost + margin;

		// give 10 percent discount if true
		if (flag) {
			price = price * 0.90;
		} else {
			// no change
		}
		return price;
	}

	public static void main(String[] args) {
		double sellingPrice1 = calculatePrice(80, 20, true); // give discount of 10 percent
		System.out.println("SP = " + sellingPrice1);

		double sellingPrice2 = calculatePrice(80, 20, false); // don't give any discount
		System.out.println("SP = " + sellingPrice2);
	}
}
