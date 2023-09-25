package interview;

public class StringEquals {

	public void verifyStringReferences() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");

		if (s1 == s2) {
			System.out.println("S1 == S2");
		} else {
			System.out.println("S1 != S2");
		}

		if (s1 == s3) {
			System.out.println("S1 == S3");
		} else {
			System.out.println("S1 != S3");
		}
	}

	
	
	public void verifyStringObject() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");

		if (s1.equals(s2)) {
			System.out.println("S1 equals S2");
		} else {
			System.out.println("S1 un-equals S2");
		}

		// imp - equals check only values
		if (s1.equals(s3)) {
			System.out.println("S1 equals S3");
		} else {
			System.out.println("S1 un-equals S3");
		}
	}

	
	
	static String name = "mango";
	public void objVariables(String name) {
		System.out.println("Current Name: "+name); 
		StringEquals.name = "orange";
		System.out.println(name);        // mango
		System.out.println(StringEquals.name);   // orange
	}

	
	public void concatString() {
		String a = "Jan";
		System.out.println(a);
		System.out.println(a.concat(" Feb"));
		System.out.println(a);

	}

	public static void main(String[] args) {
		StringEquals obj = new StringEquals();
		obj.verifyStringReferences();
		obj.verifyStringObject();

//		obj.objVariables(name);

//		obj.concatString();

	}

}
