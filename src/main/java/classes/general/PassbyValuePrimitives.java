package classes.general;

/*
 * Any primitive passing are always passed by value i.e. we pass a copy of variables
 * any change/modification will not affect original copy of variables
 * https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
 */
public class PassbyValuePrimitives {
	
	static int a,b;
	
	public void change(int a, int b) {
		a = a + 100;
		b = b + 100;
		System.out.println("Inside method values: " + a + ", " + b);   // 110 120
	}

	public static void main(String[] args) {
		PassbyValuePrimitives obj = new PassbyValuePrimitives();
		a = 10; b = 20;
		System.out.println("Intial values: " + a + ", " + b); // Initial values: 10, 20

		obj.change(a, b); // copy passed
		System.out.println("After values: " + a + ", " + b); // After values: 10, 20
	}
}
