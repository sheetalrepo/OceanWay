package classes.string;

/**
 * String : Immutable
 * StringBuffer : Mutable + Synchronized
 * StringBuilder : Mutable + Unsyncronized
 * 
 * + : plus sign is actually using StringBuilder behind the scene, good to use for large strings
 * concat: good to use for small string e.g. add two strings
 */
public class StringConcatAndPlusDiffTest {

	/**
	 * concat can only join two strings not int or boolean as in case of String Builder
	 * concat is good if we need to join smaller number of strings
	 */
	public static void concat(){
		String s2 = "ab";
		String s3 = "cd";
		System.out.println(s2.concat(s3)); 
		//System.out.println(s2.concat(50));   compiler error
	}
	
	/**
	 * plus is using string builder internally
	 * good for large number of string
	 * good if there are things other than strings
	 */
	public static void plus(){
		//Following two stmt are same
		String s1 = "My age is "+ 31+ Boolean.valueOf(true);

		StringBuilder s2 = new StringBuilder("My age is ").append(31).append(Boolean.valueOf(true));
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public static void main(String [] args){
		concat();
		plus();
	}

}
