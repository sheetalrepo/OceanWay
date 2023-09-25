package collections.generics;

/**
 * interview:
 * suppose we want to make sure whatever class we pass in method 
 * should have comparable. Then using generic we can do that easily.
 * 
 * T is an interface, so a class can be easily passed
 * extends Comparable will make sure that T should have implements Comparable 
 * 
 * @author Sheetal_Singh
 */
public class C_GenericBoundedParam {

	public static <T extends Comparable<T>> int boundedParametersMethod(T obj1, T obj2) {
		return obj1.compareTo(obj2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
