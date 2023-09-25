package brokenpractices;

/**
 * Rule 1: A utility class should always have a private constructor, so that no object can be created in class.
 * Rule 2: A utility class should not have any class level variables, all variables should be local to methods
 *  
 * @author Sheetal_Singh
 */
public class H_UtilClassSolution {

	private H_UtilClassSolution() {
		throw new IllegalStateException("Its a utility class");
	}

	public static String concatenate(String s1, String s2) {
		return s1 + s2;
	}

	public static String printMe(String s1) {
		return s1;
	}
}
