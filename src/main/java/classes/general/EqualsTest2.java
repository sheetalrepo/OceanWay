package classes.general;

public class EqualsTest2 {

	private String firstname, lastname;
	
	//initializing members using constructor rather setters
	public EqualsTest2(String f, String l){
		firstname = f;
		lastname = l;
	}
	
	
	public static void main(String [] args){
		EqualsTest2 obj1 = new EqualsTest2("john","cobb");
		EqualsTest2 obj2 = new EqualsTest2("john","cobb");
		EqualsTest2 obj3 = new EqualsTest2("will","cobb");
		
		
		/**
		 * equals method check for objects content ++ its storage location on heap
		 * in this case content is same but location of two objects are different on heap
		 * in case of String o/p will be "SAME PERSON" because content is same and storage location is also same on heap (string pool concept)
		 */
		if(obj1.equals(obj2))
			System.out.println("SAME PERSON");
		else
			System.out.println("DIFFERENT PERSON");  // DIFFERENT PERSON
	

	}
}
