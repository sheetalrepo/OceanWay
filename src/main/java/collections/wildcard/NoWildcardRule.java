package collections.wildcard;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Rule: Dont use a wildcard when you both get and put.
 * https://www.codejava.net/java-core/collections/generics-with-extends-and-super-wildcards-and-the-get-and-put-principle
 */
public class NoWildcardRule {

	
	/**
	 * Rule: Use a super wildcard when you only put values into a structure.
	 * This list will accepts integers, numbers, objects
	 * ref: LowerboundEg.java
	 */
	public static void append(Collection<? super Integer> ls, int n) {
	    for (int i = 1; i <= n; i++) {
	        ls.add(i);
	    }
	}

	
	
	/**
	 * Rule: Use an extends wildcard when you only get values out of a structure.
	 * Accept integer, double, numbers
	 * ref: UpperboundEg.java
	 */
	public static double sumOfNumbers(Collection<? extends Number> numbers) {
	    double result = 0.0;

	    for (Number num : numbers) 
	    	result = result + num.doubleValue();
	 
	    return result;
	}
	
	
	/**
	 * Not to use wild card in this method as this method get and put values
	 */
	public static double myMethod(Collection<Number> numbers, int n) {
	    append(numbers, n);
	    System.out.println("list of numbers = " + numbers);
	    
	    return sumOfNumbers(numbers);
	}
	
	
	
	public static void main(String[] args) {
		
		Collection<Number> numbers = new ArrayList<Number>();
		double sumOfTen = myMethod(numbers, 10);
		
		System.out.println("Sum = " + sumOfTen);
	}

}
