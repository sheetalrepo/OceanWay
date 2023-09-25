package classes.interfaces;

/*
 * - interface can either be public or default
 * - interface methods has to be abstract
 * - interface variables has to be static final and has to be initialized
 * - interface object cannot be created as object creation require constructor call and interface dont have constructor
 * - interface reference can be created along with any other class 
 * - interface reference object cannot call implementing class methods - (imp:) this increases security 
 *   as no one can use implementing class methods
 
 */

interface Runnable {
	int TON = 100; // static + final

	void run(); // abstract
	// void abc(){} //compiler error
}

class InterfaceExample1 implements Runnable {

	// implementing method has to be public
	@Override
	public void run() {
		// TON = 200; - final variable cannot be reassigned
		System.out.println("I am run: " + TON);
	}

	public void sports() {
		System.out.println("I am class sports:" + TON);
	}

	public static void main(String[] args) {
		InterfaceExample1 objClass = new InterfaceExample1();
		objClass.run(); // I am run: 100
		objClass.sports(); // I am class sports:100

		// Polymorphism
		Runnable objInterface = new InterfaceExample1();
		objInterface.run(); // I am run: 100
		// objIntrfc.sports(); // compiler error - for security

		// Runnable o=new Runnable(); // compiler error, as interface don't have
		// constructors
	}
}
