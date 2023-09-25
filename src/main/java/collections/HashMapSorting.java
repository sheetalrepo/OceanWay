package collections;

import java.util.*;


/**
 * Sort HM using its values
 */
public class HashMapSorting {

	// function to sort hashmap by values
	public static Map<String, Integer> sortHMByValue(HashMap<String, Integer> hm) {

		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		Map<String, Integer> tempMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> aa : list) {
			tempMap.put(aa.getKey(), aa.getValue());
		}
		return tempMap;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Math", 3);
		hm.put("Data Structure", 4);
		hm.put("Database", 2);
		hm.put("Java", 1);
		hm.put("Operating System", 5);

		Map<String, Integer> newMap = sortHMByValue(hm);
		System.out.println(newMap);
	}
}
