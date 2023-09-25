package collections.wildcard;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


/**
 * Rule: Use an extends wildcard when you only get values out of a structure.
 * Rule: Dont use a wildcard when you both get and put.
 */
public class UpperboundEg {
	
	//Only accept numbers
	public static double sumHardcode(Collection<Number> numbers) {
	    double result = 0.0;

	    for (Number num : numbers) 
	    	result = result + num.doubleValue();
	 
	    return result;
	}
	
	
	/**
	 * Accept integer, double, numbers
	 */
	public static double sumOfNumbers(Collection<? extends Number> numbers) {
	    double result = 0.0;

	    for (Number num : numbers) 
	    	result = result + num.doubleValue();
	 
	    return result;
	}
	

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(2, 4, 6);
		//double sum = sumHardcode(integers);  //compiler error
		double sumInt = sumOfNumbers(integers);
		System.out.println("Sum of integers = " + sumInt);
		
		List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
		double sumDouble = sumOfNumbers(doubles);
		System.out.println("Sum of doubles = " + sumDouble);
		 
		List<Number> numbers = Arrays.<Number>asList(2, 4, 6, 3.14, 1.68, 2.94);
		double sumNumbers = sumOfNumbers(numbers);
		System.out.println("Sum of numbers = " + sumNumbers);
		
	}

}
