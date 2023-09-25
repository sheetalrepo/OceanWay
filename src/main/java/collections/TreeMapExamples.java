package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * TreeMap: ordered + sorted
 * LHM : ordered(as per insertion) + unsorted
 * 
 * 
 * HM Allows One Null Key and Multiple Null Value
 * LHM comes under HM, hence LHM also allow One Null Key
 * Null key placed at index[0] in internal bucket implementations
 * 
 * TM don't allow Null Key because TM uses comparator internally to sort keys. 
 * And comparator through NPE if compared with null key
 * 
 */
public class TreeMapExamples {

	public void treeMapMethods() {
		// Type 1: Default Constructor
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("b", "ball");
		tm.put("a", "apple");
		tm.put("d", "dog");
		tm.put("e", null);
		tm.put("c", "cat");
		// tm.put(null, "joker"); // runtime error
		tm.put("f", null);
		tm.put("a", "big-apple");

		System.out.println(tm.size()); // 5
		System.out.println(tm.containsKey("b")); // true
		System.out.println(tm.containsValue("ball")); // true
		System.out.println(tm.isEmpty()); // false
		tm.remove("d");

		Set<String> set = tm.keySet();
		for (String key : set) {
			System.out.print(key + ":" + tm.get(key) + "  "); // a:big-apple b:ball c:cat e:null f:null | sorted
		}

		System.out.println("\n\nIn Reverse Order:");
		Set<String> set2 = tm.descendingKeySet();
		for (String key : set2) {
			System.out.print(key + ":" + tm.get(key) + "  "); // f:null e:null c:cat b:ball a:big-apple | sorted
		}

		System.out.println("\n");
		System.out.println(tm); // {a=big-apple, b=ball, c=cat, e=null, f=null}
		System.out.println("In Reverse Order:");
		System.out.println(tm.descendingMap()); // {f=null, e=null, c=cat, b=ball, a=big-apple}
	}

	public void iterationUsingEntrySet() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "One");
		tm.put(2, "Two");
		tm.put(3, "Three");
		Set<Entry<Integer, String>> entires = tm.entrySet();
		for (Entry<Integer, String> ent : entires) {
			System.out.print(ent.getKey() + ":" + ent.getValue() + "   "); // 1:One 2:Two 3:Three
		}
	}

	public void subMap() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Sunday");
		tm.put(4, "Wednessday");
		tm.put(5, "Thursday");
		tm.put(6, "Friday");
		tm.put(7, "Satday");
		tm.put(3, "Tueday");
		tm.put(2, "Monday");

		// subMap: first sort the key and then return accordingly
		Map<Integer, String> subMap1 = tm.subMap(3, 5); // (fromKey,ToKey)
		System.out.println("\n\n" + subMap1); // {3=Tueday, 4=Wednessday}

		Map<Integer, String> subMap2 = tm.subMap(3, 3);
		System.out.println(subMap2); // {} no val will be returned

		Map<Integer, String> subMap3 = tm.subMap(3, true, 3, true); // (fromKey,include fromKey,toKey,include toKey)
		System.out.println(subMap3); // {3=Tueday} | as from and to both are included

		Map<Integer, String> subMap4 = tm.subMap(3, true, 5, true);
		System.out.println(subMap4); // {3=Tueday, 4=Wednessday, 5=Thursday}

		Map<Integer, String> subMap5 = tm.subMap(3, false, 5, true);
		System.out.println(subMap5); // {4=Wednessday, 5=Thursday}

	}

	public void sortedMap() {
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(4, "D");
		sm.put(2, "B");
		sm.put(1, "A");
		sm.put(3, "C");

		// Type 2: Constructor accepting SortedMap
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(sm);
		System.out.println("\n" + tm); // {1=A, 2=B, 3=C, 4=D}

		sm.put(5, "E");
		sm.put(6, "F");
		System.out.print(sm); // {1=A, 2=B, 3=C, 4=D, 5=E, 6=F}

		System.out.println("\n" + sm.firstKey()); // 1
		System.out.println(sm.lastKey()); // 6
		System.out.println(sm.subMap(3, 5)); // {3=C, 4=D}
		System.out.println(sm.headMap(4)); // {1=A, 2=B, 3=C}
		System.out.println(sm.tailMap(4)); // {4=D, 5=E, 6=F}
		System.out.println(sm.comparator()); // null , as natuaral sorting is used

		System.out.println("");
	}

	public void sortingMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Z", "Zebra");
		map.put("F", "Fish");
		map.put("K", "Kite");
		map.put("C", "Cat");
		System.out.println(map); // {F=Fish, C=Cat, K=Kite, Z=Zebra} unordered + unsorted

		// Type 3: Constructor accepting map
		TreeMap<String, String> tm = new TreeMap<String, String>(map);
		System.out.println(tm); // {C=Cat, F=Fish, K=Kite, Z=Zebra} ordered + sorted

	}

	private void sortUsingComparator() {
		TreeMap<String, String> tm = new TreeMap<String, String>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});

		tm.put("b", "mango");
		tm.put("a", "zero");
		tm.put("d", "dog");
		System.out.println("");
		System.out.println(tm); // {d=dog, b=ball, a=apple}
	}


	

	public static void main(String[] args) {
		TreeMapExamples obj = new TreeMapExamples();
		// obj.treeMapMethods();
		// obj.iterationUsingEntrySet();
		// obj.subMap();
		// obj.sortedMap();
		// obj.sortingMap();
		obj.sortUsingComparator();

	}
}
