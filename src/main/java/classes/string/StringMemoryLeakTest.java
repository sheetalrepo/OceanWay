package classes.string;

/**
 * Memory Leak has been fixed in Java 7
 */
public class StringMemoryLeakTest {

	
	/**
	 * Here GC will not remove s1 even if s1 is not getting used in code because s2 is referring it internally
	 */
	public static void java6(){
		String s1 = "train"; 
		String s2 = s1.substring(1, 5);
		System.out.println(s2);   // rain
	}
	
	
	/**
	 * Here GC will garbage collect s1 if it is not getting used in code
	 */
	public static void java7(){
		String s1 = "train"; 
		String s2 = s1.substring(1, 5);
		System.out.println(s2);   
	}

	
	public static void main(String [] args){
		java6();
		java7();
	}
}
