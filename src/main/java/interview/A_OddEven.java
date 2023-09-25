package interview;

/*
 * How to find a no is even or odd w/o using % operator
 */
public class A_OddEven {

	public void findevenodd1(int input) {
		if (input % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

	/**
	 * Find odd even w/o using reminder operator
	 */
	public void findevenodd2(int input) {
		while (input >= 2) {
			input = input - 2;
		}

		if (input == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

	public static void main(String[] args) {
		A_OddEven obj = new A_OddEven();
		obj.findevenodd1(10);
		obj.findevenodd2(10);
	}

}
