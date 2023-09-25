package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEg {

	public static void abc() {
		// toList
		List<Integer> intList = Stream.of(1, 2, 4, 3, 2, 1).collect(Collectors.toList());
		System.out.println(intList);

		// toSet
		Set<Integer> intSet = Stream.of(10, 4, 20, 4, 32, 2, 1).collect(Collectors.toSet());
		System.out.println(intSet);

		// toCollection
		Stream<Integer> stream = Stream.of(1, 2, 4, 3, 2, 1);
		Set<Integer> set = (Set<Integer>) stream.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set);

		// summingInt, summingLong, summingDouble
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		Integer sum = (Integer) intStream.collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Summing Int: " + sum);

		// summingInt, summingLong, summingDouble
		Stream<Integer> intStream2 = Stream.of(1, 2, 3, 4, 5);
		Double average = (Double) intStream2.collect(Collectors.averagingInt(Integer::intValue));
		System.out.println("Avgerage: " + average);

		// counting
		Stream<Integer> intStream3 = Stream.of(10, 20, 30, 40, 50, 60);
		Long count = (Long) intStream3.collect(Collectors.counting());
		System.out.println("Count: " + count);

		// max
		Stream<Integer> intStream4 = Stream.of(100, 20, 30, 40, 50, 60);
		Optional<Integer> max = intStream4.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println("MAX: " + max);

		// min
		Stream<Integer> intStream5 = Stream.of(100, 20, 30, 40, 50, 60);
		Optional<Integer> min = intStream5.collect(Collectors.minBy(Comparator.naturalOrder()));
		System.out.println("MIN: " + min);
	}
	
	
	
	public static void xyz(){
		
		Stream<String> strStream = Stream.of("abc","xyz","a","b","mango");
		Map<Integer, List<String>> map= strStream.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		//separating even and odd
		Stream<Integer> intStream = Stream.of(1, 4, 5, 2, 7);
		Map<Boolean, List<Integer>> mapInt = intStream.collect(Collectors.partitioningBy(e -> e % 2 == 0));
		System.out.println(mapInt);
		
	}

	public static void main(String[] args) {
		//abc();
		xyz();
		//https://www.javadevjournal.com/java/java-8-collectors/     8 pt completed
	}

}
