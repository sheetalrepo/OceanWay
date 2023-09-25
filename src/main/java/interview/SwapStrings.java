package interview;


/**
 * Q: How To Swap Two String Variables Without Using Third Variable in Java?
 */
public class SwapStrings {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		System.out.println("Before Swapping :");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		// Swapping starts
		s1 = s1 + s2;  // HelloWorld
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("After Swapping :");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
}
