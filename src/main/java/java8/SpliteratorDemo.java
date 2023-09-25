package java8;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(-3);
		al.add(-4);
		al.add(5);

		// Obtain a Stream to the array list.
		Stream<Integer> streamObj = al.stream();

		// getting Spliterator object on al
		Spliterator<Integer> spliteratorObj1 = streamObj.spliterator();

		// estimateSize method
		System.out.println("Estimate size : " + spliteratorObj1.estimateSize());

		// getExactSizeIfKnown method
		System.out.println("Exact size : " + spliteratorObj1.getExactSizeIfKnown());

		// hasCharacteristics and characteristics method
		System.out.println("Has Characteristics: "+spliteratorObj1.hasCharacteristics(spliteratorObj1.characteristics()));

		// forEachRemaining method
		System.out.println("Content of arraylist :");
		spliteratorObj1.forEachRemaining((n) -> System.out.println(n));

		// Obtaining another Stream to the array list.
		Stream<Integer> str1 = al.stream();
		spliteratorObj1 = str1.spliterator();

		// trySplit() method
		Spliterator<Integer> splitr2 = spliteratorObj1.trySplit();

		// If splitr1 could be split, use splitr2 first.
		if (splitr2 != null) {
			System.out.println("Output from splitr2: ");
			splitr2.forEachRemaining((n) -> System.out.println(n));
		}

		// Now, use the splitr
		System.out.println("\nOutput from splitr1: ");
		spliteratorObj1.forEachRemaining((n) -> System.out.println(n));

	}
}
