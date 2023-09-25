package classes.oops;

/*
 * Overloading is static or compile time polymorphism
 * compiler know which overloading method to run
 * return type does not matter, only argument should be different
 */
public class OopsStaticPolymorphism {
	public void print(String s) {
		System.out.println("First Method with only String: " + s);
	}

	public int print(int i) {
		System.out.println("Second Method with only int: " + i);
		return 10;
	}

	public void print(String s, int i) {
		System.out.println("Third Method with both: " + s + " & " + i);
	}

	public void ambi(int a, long b) {
		
	}

	public void ambi(long a, int b) {

	}

	public static void main(String[] args) {
		OopsStaticPolymorphism obj = new OopsStaticPolymorphism();
		obj.print("John");
		obj.print(10);
		obj.print("John", 10);

//		obj.ambi(20, 20);
//		obj.ambi(20, 20);
	}
}
