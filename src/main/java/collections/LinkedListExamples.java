package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


/*
 * LinkedList is same as AarryList
 * In LL easy to add/remove element from start and end
 */
public class LinkedListExamples {

	public void methodsOfLinkedList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("One");
		linkedList.add("Two");
		linkedList.add("Three");

		System.out.println(linkedList); // [One, Two, Three]
		linkedList.addFirst("First");
		linkedList.addLast("Last");
		System.out.println(linkedList); // [First, One, Two, Three, Last]
		
		System.out.println("1st ele: "+linkedList.getFirst()); // First
		System.out.println("last ele: "+linkedList.getLast()); // Last
		System.out.println("1st ele: "+linkedList.get(3)); // Three
		
		linkedList.removeFirst(); // return and remove first element
		linkedList.removeLast(); // same
		System.out.println(linkedList); // [One, Two, Three]

		linkedList.set(0, "updated");
		System.out.println(linkedList); // [updated, Two, Three]
		System.out.println(linkedList.get(0)); // updated

		linkedList.add(0, "inserted");
		System.out.println(linkedList);// [inserted, updated, Two, Three]
		linkedList.remove(1);
		System.out.println(linkedList);// [inserted, Two, Three]

		ArrayList<String> al = new ArrayList<String>();
		al.add("10");
		al.add("Two");
		al.add("20");
		linkedList.addAll(1, al);
		System.out.println(linkedList); // [inserted, 10, Two, 20, Two, Three]

		linkedList.removeLastOccurrence("Two");
		System.out.println(linkedList); // [inserted, 10, Two, 20, Three]
	}

	public void methodsOfLinkedList2() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Jan");
		linkedList.add("Feb");
		linkedList.add("Mar");
		linkedList.add("Apr");
		linkedList.add("May");

		Object linkedListCloned = linkedList.clone();
		System.out.println(linkedListCloned); // [Jan, Feb, Mar, Apr, May]

		Object pl = linkedList.poll(); // return and removes first element same
										// as pollFirst(), removeFirst() method
		System.out.println(pl); // Jan
		System.out.println(linkedList); // [Feb, Mar, Apr, May]

		Object plast = linkedList.pollLast(); // return and removes last element
												// same as removeLast() method
		System.out.println(plast); // May
		System.out.println(linkedList); // [Feb, Mar, Apr]
		
		linkedList.push("Push");     // same as addFirst()
		System.out.println("After push: "+linkedList); // After push: [Push, Feb, Mar, Apr]
		
		linkedList.pop();  // same as poll, pollFirst, removeFirst
		System.out.println("After pop: "+linkedList); // After pop: [Feb, Mar, Apr]    

	}
	
	/*
	 * Like array list linked list can also be loop using simple for loop, adv for loop, iterator. Now will see some more type
	 */
	public void iteratingLinkedList(){
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.add("4");
		linkedList.add("5");
		
		//Normal iterator style
		Iterator<String> itr=linkedList.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.print(str+" > ");   // 1 > 2 > 3 > 4 > 5 > 
		}
		
		System.out.println("");
		
		//using ListIterator forward
		ListIterator<String> listItr=linkedList.listIterator();
		while(listItr.hasNext()){
			Object str=listItr.next();
			System.out.print(str+" >> ");   // 1 >> 2 >> 3 >> 4 >> 5 >>
		}
		
		System.out.println("");
		
		
		//Note: We used same obj "listItr" because to iterate back, pointer should be
		//at the end of list else it will not go back if pointer is at 0th position
		
		//using ListIterator backward
		while(listItr.hasPrevious()){
			Object str=listItr.previous();
			System.out.print(str+" >> ");   // 5 >> 4 >> 3 >> 2 >> 1 >>  
		}
	}

	public static void main(String[] args) {
		LinkedListExamples obj = new LinkedListExamples();
		obj.methodsOfLinkedList();
		obj.methodsOfLinkedList2();
		obj.iteratingLinkedList();
	}

}
