package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * LinkedHashSet: maintain insertion order, ordered + unsorted
 */
public class LinkedHashSetExamples {
	public void linkedHashSetMethods(){
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("E");
		lhs.add("C");
		lhs.add("B");
		lhs.add("A");
		lhs.add("D");
		System.out.println(lhs.contains("B")); //true
		System.out.println(lhs.size());  //5
		System.out.println(lhs); //[E, C, B, A, D] | ordered by insertion
//		lhs.clear(); // delete all elements
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("2");
		hs.add("E"); // common in both collections
		hs.add("D"); // same
		
		lhs.addAll(hs);
		System.out.println(lhs); //[E, C, B, A, D, 2]  | duplicate removed

		//adv for loop can also be used
		lhs.retainAll(hs);  // delete all element except hs elements
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.print(str+" , "); //E , D , 2 ,
		}
	}
	
	
	public void linkedHastSetToSimpleArray(){
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Apple");
		lhs.add("Mango");
		lhs.add("Orange");

		String [] arr=new String[lhs.size()];
		arr=lhs.toArray(arr);
		System.out.println("");
		for(String str:arr){
			System.out.print(str+" , ");  //Apple , Mango , Orange , 
		}
		
	}
	
	public void linkedHashSetConstructors(){
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>(ls); // constructor accepting Collections
		LinkedHashSet<Integer> lhs2=new LinkedHashSet<Integer>(100); // 100*0.75=75,initialize with size=75 because default fill ratio=0.75
		LinkedHashSet<Integer> lhs3=new LinkedHashSet<Integer>(100, (float) 0.90); // 100*0.90=90 initialize with size=90
		LinkedHashSet<Integer> lhs4=new LinkedHashSet<Integer>();//default constructor
		lhs1.add(1);
		lhs1.add(5);
		lhs1.add(3);
		lhs1.add(4);
		lhs1.add(2);
		System.out.println("\n");
		System.out.println(lhs1); //[10, 1, 5, 3, 4, 2]
	}
	
	public static void main(String [] args){
		LinkedHashSetExamples obj=new LinkedHashSetExamples();
		obj.linkedHashSetMethods();
		obj.linkedHastSetToSimpleArray();
		obj.linkedHashSetConstructors();
	}
}
