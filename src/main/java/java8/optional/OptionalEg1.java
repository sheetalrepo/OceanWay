package java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Optional Usage
 * Introduced to avoid Runtime NPE Reduced code as no need to check for null
 * 
 */
public class OptionalEg1 {

	public void sample1() {

		// create a List
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 15, 10);

		// filter list based on condition and fetch first element
		Optional<Integer> opt = ls.stream().filter(x -> x > 25).findFirst();

		if (opt.isPresent())
			System.out.println(opt.get());
		else {
			System.out.println("Nothing is present");
		}
	}


	public static void main(String[] args) {
		OptionalEg1 obj = new OptionalEg1();
		obj.sample1();
	}
}
