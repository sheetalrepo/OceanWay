package brokenpractices;

/**
 *  Hypothetical Class: Methods written by different developer at different point of time
 *  
 * @author Sheetal_Singh
 */
public class H_UtilClassProblem {

	public String str = ""; // class level variable

	public String concatenate(String s1, String s2) {
		str = s1 + s2;
		return str;
	}

	public String printMe(String s1) {
		str = str + s1;
		return str;
	}

}
