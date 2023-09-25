package classes.anonymous;

/*
 * inner or nested classes are only known to its enclosing outer class
 * outer class cannot access inner class member directly, inner class object is required
 * inner class can use outer class member directly w/o using object
 * inner class can extends any class present in src code
 */
class OuterClass {
	int out = 20;
	public void outMethod() {
		// System.out.println("Inner class var= "+ in); // compiler error, can't access inner class member
		InnerClass inObj = new InnerClass();
		inObj.inMethod();
	}

	class InnerClass{
		int in = 10;
		void inMethod() {
			System.out.println("Outer class var= " + out); //Outer class var= 20
		}
	}
}



public class InnerClassExamples {
	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.outMethod();
		
//		InnerClass in=new InnerClass();  InnerClass is only know to OuterClass not outside world
	}
}
