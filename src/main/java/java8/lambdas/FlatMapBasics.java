package java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Flat Map: Generally used when we have to deal with multiple collections
 */
public class FlatMapBasics {
	
	//normal java8 code
	public static void playWithMultipleListsUsingMaps() {
		List<String> list1 = Arrays.asList("a","b");
		List<String> list2 = Arrays.asList("c","d");
		List<String> list3 = Arrays.asList("e","f");
		
		//manual process: merging all list into one
		List<String> commonList = new ArrayList<String>();
		commonList.addAll(list1);
		commonList.addAll(list2);
		commonList.addAll(list3);
		
		
		List<String> capitals = commonList.stream()
//				.map(String::toUpperCase)
				.map(x -> x.toUpperCase())
				.collect(Collectors.toList());

		
		System.out.println(capitals);		
	}
	

	
	//merging list using Stream.of func and later used flat map
	public static void playWithMultipleListsUsingFlatMaps() {
		List<String> list1 = Arrays.asList("a","b");
		List<String> list2 = Arrays.asList("c","d");
		List<String> list3 = Arrays.asList("e","f");


		List<String> capitals = Stream.of(list1,list2,list3)
//				.flatMap(List::stream)
//				.map(String::toUpperCase)
				.flatMap(ls -> ls.stream())
				.map(x -> x.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(capitals);		
	}

	
	public static void main(String [] args) {
		playWithMultipleListsUsingMaps();
		playWithMultipleListsUsingFlatMaps();
	}

}
