package classes.string;

/**
 * Why Strings are immutable
 */
public class StringImmutabilityTest {
	
	
	public static void reason1(){

		String s1 = "world"; // cached in string pool
		String s2 = "world"; // s2 points to same object already present in pool
		System.out.println("s1 and s2:  "+s1+" & "+s2);
		
		/**
		 *   s1 value updated with upper case, hence object in heap becomes upper case
		 *   now as s2 also points to same object, s2 also become upper case, which break further code 
		 *   to avoid this situation strings are made immutable
		 *   
		 *   In below code new obj will be created with Upper Case value but it has not been assigned to any reference variable
		 *   So new object will be lost in string pool with no reference to it
		 *   Hence s1 and s2 will remain lower case 
		 */
		s1.toUpperCase();  
		
		System.out.println("s1 and s2:  "+s1+" & "+s2);

	}
	
	/**
	 * Strings hashcode are cached in JVM
	 * 
	 * suppose we have a very long string, now jvm has to calculate its hashcode everytime when this is getting used 
	 * as string are immutable i.e. cannot change, so jvm cached their hashcode so whenever same string get used no need to 
	 * calculate hashcode again which save lot of time and improves performance
	 */
	public static void reason2(){
		
		String s3 = "I am a very long string....."; 
		
	}

	
	public static void main(String [] args){

		reason1();
		reason2();
		
	}

}
