package interview;

import java.util.HashMap;
import java.util.Map;

public class FindError2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Abhi", 123);
		map.put(null, 456);
		map.put("Abhi", 555);
		map.put("Ashish", null);
		map.put(null, 1000);

		//what will be the output
		System.out.println(map.get("Abhi"));  //latest value considered
		System.out.println(map.get(null) );    //no issue in this stmt  1000
		System.out.println(map.get("Anup"));   // null as key not present
		System.out.println(map.get("Ashish")); // null value will get returned
	
	}

}
