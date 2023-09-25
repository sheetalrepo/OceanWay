package java8.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class ForloopLambadas {

	public static void beforeJava8() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);

		System.out.println("# Before Java 8");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

	}

	public static void afterJava8withMap() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);

		System.out.println("\n\n# After Java 8(Map) - Part1");
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		System.out.println("\n# After Java 8(Map) - Part2");
		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("C".equals(k)) {
				System.out.println("Hello C");
			}
		});
	}
	
	
	
	public static void afterJava8withList() {
		List<String> ls = new ArrayList<>();
		ls.add("A");
		ls.add("B");
		ls.add("C");

		System.out.println("\n\n# After Java 8(List) - Part1");
		ls.forEach(x -> System.out.println(x));
		
		
		System.out.println("\n# After Java 8(List) - Part2");
		ls.forEach(x -> {
			System.out.println(x);
			
			if("C".equalsIgnoreCase(x))
				System.out.println("Hello C");
			
		});
	
	}

	public static void main(String[] args) {
		beforeJava8();
		afterJava8withMap();
		afterJava8withList();
	}

}
