package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class HashSetExamples {
	/*
	 * HashSet: Unordered + UnSorted Duplicate not allowed, null can be added
	 */
	public void hashSetMethods() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("C"); // insertion order will not be maintained
		hashSet.add(null); // null can be added as in ArrayList
		hashSet.add("B");
		hashSet.add("A"); // previous duplicate will be removed
		hashSet.add(null);
		System.out.println(hashSet); // [null, A, B, C]

		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("3");
		hashSet2.add("10");
		hashSet2.add("1");

		hashSet.addAll(hashSet2); // element will get added randomly
		System.out.println(hashSet); // [3, null, 10, 1, A, B, C]
		System.out.println(hashSet.contains("10")); // true
		System.out.println("Size: " + hashSet.size()); // 7
		System.out.println("Empty: " + hashSet.isEmpty()); // false
		hashSet.clear();
		System.out.println(hashSet); // []
	}

	public void hashSetIterator() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		hashSet.add("4");

		Iterator<String> itr = hashSet.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.print(str + " > "); // 3 > 2 > 1 > 4 > | unordered+ unsorted
		}

		System.out.println("");
		for (String str : hashSet) {
			System.out.print(str + " > "); // 3 > 2 > 1 > 4 >
		}
	}

	//same as array list
	public void hashSetToSimpleArray() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Jan");
		hashSet.add("Feb");
		hashSet.add("Mar");
		hashSet.add("Apr");
		int size = hashSet.size();
		
		//HashSet to Array
		System.out.println("");
		String[] strArray = new String[1];  // array will grow dynamically
		
		strArray=hashSet.toArray(strArray);
		for (String str : strArray) {
			System.out.print(str + " > "); // Feb > Mar > Apr > Jan >
		}
	}

	public void hasSetToDifferentCollections() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("10");
		hashSet.add("20");
		hashSet.add("30");
		hashSet.add("40");

		// HashSet to ArrayList or LinkedList
		ArrayList<String> al = new ArrayList<String>(hashSet);
		System.out.println("");
		System.out.println(al); // [20, 10, 30, 40]

		// HashSet to TreeSet
		TreeSet<String> ts = new TreeSet<String>(hashSet);
		System.out.println(ts); // [10, 20, 30, 40]

	}
	
	public void hashSetConstructors(){
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		
		HashSet<Integer> hs1=new HashSet<Integer>(ls); // constructor accepting Collections
		HashSet<Integer> hs2=new HashSet<Integer>(100); // 100*0.75=75,initialize with size=75 because default fill ratio=0.75
		HashSet<Integer> hs3=new HashSet<Integer>(100, (float) 0.90); // 100*0.90=90 initialize with size=90
		HashSet<Integer> hs4=new HashSet<Integer>();//default constructor
		hs1.add(1);
		hs1.add(5);
		hs1.add(3);
		hs1.add(4);
		hs1.add(2);
		System.out.println(hs1); //[1, 2, 3, 4, 5, 10]
		
	}

	public static void main(String[] args) {
		HashSetExamples obj = new HashSetExamples();
		obj.hashSetMethods();
		obj.hashSetIterator();
		obj.hashSetToSimpleArray();
		obj.hasSetToDifferentCollections();
		obj.hashSetConstructors();

	}
}