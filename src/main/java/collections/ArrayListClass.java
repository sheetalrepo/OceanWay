package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * Imp: none of the collection classes are synchronized
 * all legacy classes like vector, Hashtable etc are synchronized
 * AL as Ordered (by insertion) + Not sorted + Duplicate allowed
 */
public class ArrayListClass {

	public void howToIterateArrayList() {
		// ArrayList al=new ArrayList(); // Non generic declaration style before Java 1.5
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");   // Simple way to initialize ArrayList with elements
		al.add("Ball");
		al.add("Cat");
		al.add("Cat"); // Duplicate allowed
		al.add(2, "Elephant");

		System.out.println("Hashcode: "+al.hashCode());  //Hashcode: -2020597237
		
		// Style 1: using iterator
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.print(str + "-"); // Apple-Ball-Elephant-Cat-Cat- + maintain insertion order
		}

		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Mango");
		al2.add("Orange");
		al2.add("Apple");

		al.addAll(al2); // list 2 added in list 1
		System.out.println();
		System.out.println(al); // [Apple, Ball, Elephant, Cat, Cat, Mango, Orange, Apple]

		al.removeAll(al2); // all list 2 element will be removed from list1 if exist
		System.out.println(al);  // [Ball, Elephant, Cat, Cat] 

		al.addAll(al2); // list 2 again added in list 1
		System.out.println(al);  // [Ball, Elephant, Cat, Cat, Mango, Orange, Apple]
		
		al.retainAll(al2);   // al will retain only element which present in al2 rest will be deleted
		System.out.println(al); // [Mango, Orange, Apple]

		
		// Style 2: using adv for loop
		for(String str: al){
			System.out.print(str+"-");  // Mango-Orange-Apple-
		}
		
		
		//Style 3: using normal for loop
		System.out.println("\n");
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+"*"); // Mango*Orange*Apple*
		}
		
		//Style 4: using ListIterator
		System.out.println("\n");
		ListIterator<String> listItr=al.listIterator();
		while(listItr.hasNext()){
			System.out.print(listItr.next()+" > ");  // Mango > Orange > Apple >
		}
		
		
		//Style 5: using ListIterator(start index)
		System.out.println("\n");
		System.out.println("List Iterator for :"+ al);
		ListIterator<String> listItr2=al.listIterator(1);
		while(listItr2.hasNext()){
			System.out.print(listItr2.next()+" > ");  // Orange > Apple >
		}
		
		
		
	}

	public void handleObjectsArray() {
		ArrayStudentsData s1 = new ArrayStudentsData(10, "John", 20);
		ArrayStudentsData s2 = new ArrayStudentsData(11, "Bob", 22);
		ArrayStudentsData s3 = new ArrayStudentsData(12, "Ryan", 21);

		ArrayList<ArrayStudentsData> al = new ArrayList<ArrayStudentsData>();   //ArrayList of Student class objects
		al.add(s1);
		al.add(s2);
		al.add(s3);

		System.out.println("");
		Iterator<ArrayStudentsData> itr = al.iterator();
		while (itr.hasNext()) {
			ArrayStudentsData s = itr.next();
			System.out.println(s.rollNo + "-" + s.name + "-" + s.age);
		}
		// 10-John-20
		// 11-Bob-22
		// 12-Ryan-21
	}
	
	/*
	 * used when array need to initialize with same element multiple times
	 */
	public void initializeArrayListWithNCopies() {
		ArrayList<Integer> al = new ArrayList<Integer>(Collections.nCopies(10,2));
		System.out.println(al); // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
		
		List<Integer> subList=al.subList(3, 5);  //returns subset of list
		System.out.println(subList);  // [2, 2]
		
	}

	
	public void initializeArrayListWithInnerClass() {
		ArrayList<String> al = new ArrayList<String>() {
			{
				add("C");
				add("D");
				add("A");
				add("B");
			}
		};
		System.out.println(al); // [C, D, A, B]
	}

	/**
	 * List.of introduced in Java 9
	 */
	public static void createListUsingOf() {
		List<String> list = List.of("apple", "bat", "cat");
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ArrayListClass obj = new ArrayListClass();
//		obj.howToIterateArrayList();
//		obj.handleObjectsArray();
//		obj.initializeArrayListWithNCopies();
//		obj.initializeArrayListWithInnerClass();
		createListUsingOf();
		
	}
}
