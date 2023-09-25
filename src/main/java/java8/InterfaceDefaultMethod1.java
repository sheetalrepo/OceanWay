package java8;

/**
 * Why default method introduced in Java 8:
 * Problem: If we introduced a new func in interface then all implementing class need
 *          be updated. 
 * Solution:So better define it in interface and no change will be required
 *          in implementing classes.
 * 
 * 1. Interfaces can have method definition in Java 8 (New feature)
 *    but to give body we need to put 'default' in front of method
 * 2. Defined method can be 'static' in Java 8 (New feature)
 *    Added so that method can be called with interface name directly 
 * 3. Old abstract method can be default or public
 * 
 * 
 * #Pre Java 8
 * 1. Abstract class can have at least one abs method + any no. of default methods
 * 2. Interfaces have only abs methods
 * 3. Interface method are public whether we mention or not
 * 
 */

interface abc {
	void normalAbsMethod();

	default void methodWithBody() {
		System.out.println("Default method introduced in Java8");
	}

}

public class InterfaceDefaultMethod1 implements abc {

	@Override
	public void normalAbsMethod() {
		System.out.println("I am normal old java method");
	}

	public static void main(String[] args) {
		InterfaceDefaultMethod1 obj = new InterfaceDefaultMethod1();
		obj.normalAbsMethod();
		obj.methodWithBody();
	}
}
