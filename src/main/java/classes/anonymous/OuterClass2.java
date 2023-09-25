package classes.anonymous;

/**
 * Static Inner class ex not used much in practical
 * 
 * Static inner class also called Nested class
 *
 * We will have OuterClass2.class, A.class, A$B.class
 * 
 * 
 * Static class cannot access non static outer class members
 * Static class can have non static members
 *
 */
public class OuterClass2 {

	public static void main(String[] args) {
		A.B obj = new A.B();
		obj.nonStaticMethod();
		
		A.B.staticMethod();

	}
}

// outer class
class A {

	static int rollno = 10;
	int id = 11;
	
	// nested inner class
	static class B {

		int a = 100;

        void nonStaticMethod() {
			System.out.println("I am non static method: " + rollno);
			System.out.println(a);
			//System.out.println(id);  compiler error
		}

		static void staticMethod() {
			System.out.println("I am static method: " + rollno);
		}

	}

}
