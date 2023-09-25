package classes.oops;

/*
 * Overriding is dynamic or runtime polymorphism
 * In overriding, method invoked based on object not reference
 * Compiler don't know which method to run it decide at run time
 * 
 * Also static method can't be overridded. Static is compile time concept. 
 * Also if two method are static with same name in parent-class then they will be separate method 
 * and moreover @override tag need to be removed else compiler error comes
 * 
 * Rules:
 * same name, same param, same return type
 * access modifier cannot reduce the visibility in child class
 * 
 * private > default > protected > public
 */

class Base {
	 protected void speed() {
		System.out.println("Parent speed");
	}
}

class Audi extends Base {
	@Override
	 public void speed() {
		System.out.println("Child speed");
	}
}

public class OopsDynamicPolymorphism {
	
	public static void main(String[] args) {
		Base obj1 = new Base();
		Base obj2 = new Audi();   // Parent reference, Child object
		obj1.speed(); // Parent speed
		obj2.speed(); // Child speed
	}
}
