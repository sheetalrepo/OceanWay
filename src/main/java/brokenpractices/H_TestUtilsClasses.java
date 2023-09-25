package brokenpractices;

public class H_TestUtilsClasses {

	public static void problem() {
		H_UtilClassProblem obj1 = new H_UtilClassProblem();

		String concat = obj1.concatenate("Hello", " World ");
		String result = obj1.printMe("Broken Practices by Developers");

		System.out.println("Case1: ");
		System.out.println(concat);
		System.out.println(result);
	}

	public static void solution() {
		String concat = H_UtilClassSolution.concatenate("Hello", " World ");
		String result = H_UtilClassSolution.printMe("Broken Practices by Developers");

		System.out.println("\n\nCase2: ");
		System.out.println(concat);
		System.out.println(result);
	}

	public static void main(String[] args) {
		problem();
//		solution();
	}

}
