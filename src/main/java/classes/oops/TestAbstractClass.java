package classes.oops;



/**
 * - Abstract class can have main method but we cannot create obj of Abstract class
 * - Abstract class can have constructor
 * - Abstract class can implement an Interface, no issue in that
 * - Abstract class may not have a single abstract method 
 * - But if a class has a single abstract method then class has to be abstract
 * - one .java file cannot contains two public class,
 * - main should present in a public class only else code will not execute but no compiler error too
 *
 */
abstract class AbstractClass implements TestInterface {
	public AbstractClass() {
		System.out.println("Abstract Constructor");
	}
	abstract int getRateOfInterest();
	@Override
	public void abc(){} //method defined, now child don't have to define it
}

class SBI extends AbstractClass {
	@Override
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends AbstractClass {
	@Override
	int getRateOfInterest() {
		return 8;
	}
}

public class TestAbstractClass {
	public static void main(String args[]) {
		//AbstractClass b = new AbstractClass();
		AbstractClass b1 = new SBI();
		AbstractClass b2 = new PNB();
		
		System.out.println("Rate of Interest is: " + b1.getRateOfInterest() + "%");
		System.out.println("Rate of Interest is: " + b2.getRateOfInterest() + "%");
		
	}
}