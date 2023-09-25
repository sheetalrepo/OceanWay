package classes.staticvar;

/**
 * Private constructor ensure any other class or subclass cannot create its object
 * This concept generally used in Singleton
 *	
 * Object can be created from within class
 */
public class NoObjectsClass {

	private NoObjectsClass() {
		System.out.println("Private Constructor");
	}

	public static void main(String[] args) {
		NoObjectsClass obj1 = new NoObjectsClass();
		NoObjectsClass obj2 = new NoObjectsClass();
	}

}

class AnyOtherClass {

	public static void main(String[] args) {
		//NoObjectsClass obj = new NoObjectsClass();
	}

}