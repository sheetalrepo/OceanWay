package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

class LastNameComparator implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		int i, j, k;
		String subA, subB;

		i = a.lastIndexOf(" "); // return last name starting index
		j = b.lastIndexOf(" ");
		subA = a.substring(i); // return last name
		subB = b.substring(j);

		k = subA.compareTo(subB); // k = 0 if last name is same 

		if (k == 0)
			return k = a.compareTo(b); // if last name is same, sort with first name
		else
			return k;
	}
}

public class TreeMapComparator {

	public static void main(String[] args) {
		//Type 4: Constructor accepting Comparator
		TreeMap<String, Double> tm = new TreeMap<String, Double>(
				new LastNameComparator());
		tm.put("Zoe Smith Ula", 500.50);
		tm.put("Bob Michel", 1500.50);
		tm.put("Joe Smith", 100.50);
		tm.put("Rich Rich", 500.00);
		tm.put("Cob Boy Yen", 800.00);

		// Adding 1000 bucks in Rich account to make him more rich
		Double d = tm.get("Rich Rich");
		tm.put("Rich Rich", d + 1000);

		Set<String> set = tm.keySet();
		for (String key : set) {
			System.out.println(key + ":" + tm.get(key));
		}
		
		System.out.println(tm.comparator()); // collections.LastNameComparator@2a163765  | not return null as we are not using natural order
	}

}

/*
Bob Michel:1500.5
Rich Rich:1500.0
Joe Smith:100.5
Zoe Smith Ula:500.5
Cob Boy Yen:800.0
*/

