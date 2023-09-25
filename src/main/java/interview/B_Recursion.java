package interview;

/*
 * recursion call itself again and again,
 *  'if stmt' is very imp so that at one point method start returning something
 * otherwise method enters into infinite loop
 */
public class B_Recursion {

	public int fact(int n) {
		
		if (n == 1)
			return 1;
		
		return fact(n - 1) * n;
	}

	public static void main(String[] args) {
		B_Recursion obj = new B_Recursion();
		System.out.println("Factorial is: "+obj.fact(4));
	}
}

/*
n = 4
n = 3
n = 2
n = 1
------
------
------
Factorial is: 24




*/