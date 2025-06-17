package a_classes.b_string;

/**
 * String equals good practices
 * string which cannot be null should be used first to avoid NPE
 */
public class StringEqualsBestPractice {

	private static String someOperation() {
		return null;
	}

	public static void main(String [] args){
		
		String s1 = "safe_to_use";
		String s2 = someOperation(); //null

		/**
		 * case 1: 
		 * 	- Known Str should always be used on LHS
		 * 	- s1 is known, and we know its value
		 * 	- s2 is unknown and its value may vary from time to time
		 */
		if(s1.equals(s2)){
			System.out.println("Operation success full");
		}else{
			System.out.println("Operation failed");
		}
		
		
		//case 2: s2 may be null as it get calculated by a some unknown method
		if(s2.equals(s1)){
			System.out.println("Operation success full");
		}else{
			System.out.println("Operation failed");
		}
	}

}
