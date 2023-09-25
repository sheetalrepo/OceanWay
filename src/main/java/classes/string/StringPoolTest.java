package classes.string;

/**
 * Till Java 6: String pool are stored in PermGen area
 * From Java 7: String pool are stored in main heap area
 * Every string create is cached in string pool
 * 
 * Why String pool concept in Java: Suppose we have 1 lakhs name DB saved in a array list. In 1 lakh lot of name surname will be
 * common. If there is no pool then we will have 1 lakhs object in memory.
 */
public class StringPoolTest {

	
	public static void poolTest(){
		String s1 = "hello"; // cached in string pool
		
		// s2 referencing same s1 object which is present in string pool
		// s2 will not create a new object like s1, it will go in string pool and check if same object already present or not
		// if found then same reference will be passed to s2
		String s2 = "hello"; 
		System.out.println(s1 == s2); //true
		
		
		//s3 will not be stored in string pool and given a separate space in heap
		//'hello' string is not 'interned'; term used when creating string obj using 'new' keyword 
		String s3 = new String("hello");
		System.out.println(s1 == s3); //false
		
		
		//interning make sure jvm look inside string pool and refer object if its value already present in pool
		// interning helps in optimizing memory
		String s4 = new String("hello").intern();
		System.out.println(s1 == s4); //true
		
	}
	
	
	
	/**
	 * Password should always be stored in char array rather string
	 * as String are put in string pool and if hacker get access to string pool then it can be easily
	 * recovered and string from string pool are not easily garbage collected.
	 * 
	 * use char array and once password used set it to null so that it can be garbage collected
	 */
	public static void password(){
		char [] arr = new char[]{'p','a','s','s','w','o','r','d'};
		System.out.println(arr);
	}
	
	
	public static void main(String [] args){
		poolTest();
		password();
	}

}
