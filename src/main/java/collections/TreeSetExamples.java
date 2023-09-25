package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet: ordered by natural order(not insertion order) + sorted by natural order
 */
public class TreeSetExamples {

	public void basicOperations() {
		TreeSet<String> ts = new TreeSet<String>();   //Type 1: Default constructor
		ts.add("40");
		ts.add("10");
		ts.add("30");
		ts.add("50");
		ts.add("20");
		ts.add("20"); //duplicate get removed
		System.out.println(ts); // [10, 20, 30, 40, 50]
		System.out.println("Is set empty: " + ts.isEmpty()); // false
		System.out.println(ts.size()); // 5

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " , "); // 10 , 20 , 30 , 40 , 50 ,
		}
	}

	public void listToTreeSet() {
		List<String> ls = new ArrayList<String>();
		ls.add("c");
		ls.add("a");
		ls.add("a");
		ls.add("b");
		System.out.println("");
		System.out.println(ls); // [c, a, a, b]

		//Type 2: Constructor accepting Collections
		TreeSet<String> ts = new TreeSet<String>(ls);  
		System.out.println(ts); // [a, b, c] | duplicate removed + sorted

	}

	

	

	public void constructorWithSortedSet(){
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("z");
		ss.add("a");
		
		//Type 3: Constructor accepting SortedSet
		TreeSet<String> ts=new TreeSet<String>(ss);
		System.out.println("\n"+ts); //[a, z]
	}
	
	public static void main(String[] args) {
		TreeSetExamples obj = new TreeSetExamples();
		obj.basicOperations();
		obj.listToTreeSet();
		obj.constructorWithSortedSet();
	}
}
