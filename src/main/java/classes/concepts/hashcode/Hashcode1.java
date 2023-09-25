package classes.concepts.hashcode;

public class Hashcode1 extends Object {

	public static void main(String args[]) {
		Hashcode1 obj1 = new Hashcode1();
		Hashcode1 obj2 = new Hashcode1();

		// different hashcode
		System.out.println(obj1.hashCode()); // 2018699554
		System.out.println(obj2.hashCode()); // 1311053135

		// because of diff hashcode, equals will always return false
		System.out.println(obj1.equals(obj2));

		// Reference check - else loop will execute
		if (obj1 == obj2)
			System.out.println("True: References, points to same location on heap");
		else
			System.out.println("False: References, points to different location on heap");
	}

}
