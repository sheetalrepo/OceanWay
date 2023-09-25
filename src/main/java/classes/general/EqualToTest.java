package classes.general;

/*
 * == compare two references(object or primitive) not object content
 * primitive can also be compared
 * incompatible type cannot be compared, will get compile time error
 * null can be compared
 */

class Duck {
	Duck() {
	}
}

public class EqualToTest {
	
	public void primitiveReferences() {
		int a = 10;
		int b = 10;

		if (a == b)
			System.out.println("Prim: a == b"); // a == b
		else
			System.out.println("a != b");
	}

	/**
	 * null exists in only objects; as primitives have default values
	 */
	public void nulls() {
		Integer a = null;
		Integer b = null;

		if (a == b)
			System.out.println("Null: a == b"); // a == b
		else
			System.out.println("a != b");
	}

	public void incompatibleType() {
		int a = 10;
		String b = "hi";

		// if (a == b) //compile time error
		// System.out.println("a == b"); // a == b
		// else
		// System.out.println("a != b");
	}

	
	
	public void stringObjectTest() {
		String obj1 = new String("xyz");
		String obj2 = obj1;
		String obj3 = new String("xyz");

		if (obj1 == obj2)
			System.out.println("Obj: obj1 == obj2"); // obj1 == obj2
		else
			System.out.println("obj1 != obj2");

		/**
		 * obj 1 and obj 3 are having two diff memory location but pointing same obj on heap
		 */
		if (obj1 == obj3)
			System.out.println("obj1 == obj3");
		else
			System.out.println("Obj: obj1 != obj3"); // obj1 != obj3
	}
	
	
	
	/**
	 * In objects if "new" keyword is come then == cannot pass that thing
	 * this rule is applicable for normal object and String object
	 */
	public void normalObjectTest() {
		Duck d1 = new Duck();
		Duck d2 = d1;
		Duck d3 = new Duck();

		if (d1 == d2)
			System.out.println("Duck are same"); // Duck are same
		else
			System.out.println("Duck are diff"); 
		
		
		if (d1 == d3)
			System.out.println("Duck are same");
		else
			System.out.println("Duck are diff"); // Duck are diff
	}

	
	


	
	public static void main(String[] args) {

		EqualToTest obj = new EqualToTest();
		obj.primitiveReferences();
		obj.nulls();
		obj.incompatibleType();
		obj.stringObjectTest();
		obj.normalObjectTest();

	}
}
