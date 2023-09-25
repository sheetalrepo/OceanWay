package collections.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Rule: Use a super wildcard when you only put values into a structure.
 * Rule: Dont use a wildcard when you both get and put.
 *
 */
public class LowerboundEg {

	/**
	 * This list accepts only integers
	 */
	public static void appendHardcoded(Collection<Integer> ls, int n) {
	    for (int i = 1; i <= n; i++) {
	        ls.add(i);
	    }
	}

	/**
	 * This list will accepts integers, numbers, objects
	 */
	public static void append(Collection<? super Integer> ls, int n) {
	    for (int i = 1; i <= n; i++) {
	        ls.add(i);
	    }
	}
	
	public static void main(String[] args) {
		
		//pass integers
		List<Integer> in = new ArrayList<Integer>();
		appendHardcoded(in, 5);
		System.out.println("list of integers: "+ in);
		
		//pass numbers
		List<Number> numbers = new ArrayList<Number>();
		//appendHardcoded(numbers, 5);  // cant pass numbers
		append(numbers, 5);
		numbers.add(6.5);
		System.out.println("list of numbers: "+numbers);
		
		
		//pass objects
		List<Object> objects = new ArrayList<Object>();
		append(objects, 5);
		objects.add(6.6);
		objects.add("Seven");
		System.out.println("list of objects: "+objects);

	}

}
