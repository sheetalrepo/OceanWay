package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExamples {

	public void methodsOfSortedSet(){
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("Z");
		ss.add("U");
		ss.add("A");
		ss.add("N");
		ss.add("B");
		System.out.println(ss); // [A, B, N, U, Z]
		
		System.out.println(ss.first()); // A
		System.out.println(ss.last());  // Z
		System.out.println(ss.headSet("N")); // [A, B]
		System.out.println(ss.tailSet("N")); //[N, U, Z]
		System.out.println(ss.subSet("B", "U")); // [B, N]
		System.out.println(ss.comparator()); // null, as natural sorting is used
		
		for(String str: ss){
			System.out.print(str+" > "); //A > B > N > U > Z > 
		}
		
	}
	
	public static void main(String [] args){
		SortedSetExamples obj=new SortedSetExamples();
		obj.methodsOfSortedSet();
	}
}
