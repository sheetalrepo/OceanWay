package brokenpractices;

/**
 * Try to split method into two in case we are passing boolean
 * 
 * @author Sheetal_Singh
 */
public class D_BooleanAsParameterSolution {

	public static double calculatePriceWithDiscout(double cost, double margin) {
		return (cost + margin) * 0.90;
	}

	public static double calculatePriceWithoutDiscout(double cost, double margin) {
		return cost + margin;
	}

	public static void main(String[] args) {
		double sellingPrice1 = calculatePriceWithDiscout(80, 20);
		System.out.println("SP = " + sellingPrice1);

		double sellingPrice2 = calculatePriceWithoutDiscout(80, 20);
		System.out.println("SP = " + sellingPrice2);
	}
}
