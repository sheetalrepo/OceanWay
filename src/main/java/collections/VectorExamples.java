package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector is same as ArrayList except Vector is synchronous
 * imp: none of the collection classes are synchronized
 * all legacy classes like vector, Hashtable, Dictionary, Properties, Stack etc are synchronized
 */
public class VectorExamples {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("one");
		vec.add("two");
		vec.add("three");
		vec.add("four");

		Enumeration<String> e = vec.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " "); // one two three four
		}

		System.out.println("");
		Iterator<String> itr = vec.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " "); // one two three four
		}

		System.out.println(" ");
		for (String str : vec) {
			System.out.print(str + " "); // one two three four
		}

	}
}
