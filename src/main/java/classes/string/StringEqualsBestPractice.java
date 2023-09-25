package classes.string;

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
		String s2 = someOperation();

		
		// case 1: string which cannot be null should be used first 
		if(s1.equals(s2)){
			System.out.println("Operation sucessfull");
		}else{
			System.out.println("Operation failed");
		}
		
		
		//case 2: s2 may be null as it get calculated by a method
		if(s2.equals(s1)){
			System.out.println("Operation sucessfull");
		}else{
			System.out.println("Operation failed");
		}
	}

}
