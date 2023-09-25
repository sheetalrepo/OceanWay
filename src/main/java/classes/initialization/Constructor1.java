package classes.initialization;

/**
 *  In upper hierarchy param constructor never called by child constructors
 * @author Sheetal_Singh
 */

class Parent {
	Parent() {
		System.out.println("Parent DEFAULT constructor");
	}
	
	Parent(int a) {
		System.out.println("P: Never called");
	}
}

class Child extends Parent {
	Child() {
		// super(); -> added implicitly by compiler
		System.out.println("Child DEFAULT constructor");
	}
	
	//Param parent const never called 
	Child(int a){
		System.out.println("C: Never Called");
	}
}

public class Constructor1 extends Child {

	public Constructor1() {
		// super(); // -> added implicitly by compiler
		System.out.println("Grand Child DEFAULT constructor");
	}

	public Constructor1(int a) {
		// super(); // Imp: Parameterized const also call "default super constructor" rather "parameterized super const"
		System.out.println("Grand Child PARAM constructor");
	}

	public static void main(String[] args) {
		new Constructor1();
		System.out.println("\n\n");
		new Constructor1(10);
	}
}