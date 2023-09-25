package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachInCollections {

	public void listEg() {
		List<String> ls = new ArrayList<>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
		ls.add("5");

		// one line implementation
		ls.forEach((str) -> System.out.print(str));

		// multi line implementation
		System.out.println();
		ls.forEach((s) -> {
			s = s + ":";
			System.out.println(s);
		});

	}

	public void mapEg() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jan");
		map.put("2", "Feb");
		map.put("3", "Mar");
		map.put("4", "Apr");
		map.put("5", "May");
		
		//single line
		map.forEach((k, v) -> System.out.println("Key:" + k + " Val:" + v));
		

		//multi line
		System.out.println("");	
		map.forEach((k, v) -> {
			System.out.print("#");	
			System.out.println("Key:" + k + " Val:" + v);	
		});

		
		//single line with entry
		System.out.println("");	
		map.entrySet().forEach(entry -> System.out.println("Key:" + entry.getKey() + " Val:" + entry.getValue()));
		
		
		
	}

	public static void main(String[] args) {

		ForEachInCollections obj = new ForEachInCollections();
		// obj.listEg();
		obj.mapEg();

	}

}
