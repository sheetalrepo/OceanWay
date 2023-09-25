package collections;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LHM is ordered(by insertion) + not sorted like TreeMap
 * Its again a Map interface class and don't implement Iterable interface hence can't use List iteration methods
 */
public class LinkedHashMapExamples {

	public void methodsOfLinkedHashMap() {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("2", "B");
		lhm.put("1", "A");
		lhm.put("3", "C");
		lhm.put("4", "D");
		lhm.put(null, null);
		lhm.put("5", null);
		lhm.put("10", "K");
		lhm.put("2", "Updated-B");
		System.out.println("LHM: "+lhm);
		
		
		System.out.println("Contains Key Check: "+lhm.containsKey("4")); // true
		System.out.println("Contains Value Check: "+lhm.containsValue("D")); // true
		lhm.remove("4");
		System.out.println("Updated LHM: "+lhm);


		//To iterate on LHM : Can't use iterator as Map are not Collections
		Set<String> set = lhm.keySet();
		System.out.println("# Iterating over LHM:");
		for (String key : set) {
			System.out.println(key + ":" + lhm.get(key) + "	");
		}
		
	}

	public static void main(String[] args) {
		LinkedHashMapExamples obj = new LinkedHashMapExamples();
		obj.methodsOfLinkedHashMap();
	}

}
