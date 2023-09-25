package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * In PQ only poll and peek method return first least element as it has highest priority in queue
 * 
 * PQ: The head of the queue is the least element with respect to the specified ordering
 *     Poll() always removes least element in PQ i.e. gives priority to least element even if that element is present in middle 
 */
public class QueueWithPriorityQueue {

	
	/**
	 * PQ don't maintained insertion order unlike LL but least element will always be at index 0
	 * poll: removes least element irrespective of index
	 */
	public void PQOrdering(){
		Queue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(50);
		pq.add(300);
		pq.add(251);
		pq.add(45);
		pq.add(200);
		
		System.out.println("Queue: "+pq); 
		System.out.println("Poll: "+pq.poll());  // least removed
		
		
		System.out.println("Queue: "+pq); 
		System.out.println("Poll: "+pq.poll());  // least removed
		
		System.out.println("Queue: "+pq); 
		System.out.println("Poll: "+pq.poll()); // least removed
	
		System.out.println("Queue: "+pq); 
		System.out.println("Poll: "+pq.poll()); // least removed
		
		
		System.out.println("Queue: "+pq); 
		System.out.println("Poll: "+pq.poll()); // least removed
		
		System.out.println("Queue: "+pq); 
	
	
		
		System.out.println("********************************************");
		
	}
	
	public void methodsOfPQ() {
		Queue<Integer> pq = new PriorityQueue<Integer>(); // Default Constructor:
//		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(30);
		pq.add(50);
		pq.add(40);
		pq.add(20);
		System.out.println(pq);// [10, 20, 50, 40, 30]

		pq.offer(75); // add element randomly anywhere
		System.out.println(pq); // [10, 20, 50, 40, 30, 75]

		System.out.println(pq.peek()); // 10 | return head of queue and don't touch pq 
		System.out.println(pq.poll()); // 10 | return head and also removes head from pq
		System.out.println(pq); // [20, 50, 40, 30, 75]

		System.out.println(pq.element()); // 20 | same as peek but throw exception if pq is empty
		System.out.println(pq); // [20, 50, 40, 30, 75]

		pq.remove(); // 20 | same as poll but throw exception when queue is empty
		System.out.println(pq); // [50, 40, 30, 75]

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1000);
		ls.add(2000);

		pq.addAll(ls);
		System.out.println(pq); // [30, 40, 50, 75, 1000, 2000]

		pq.removeAll(ls);
		System.out.println(pq); // [30, 40, 50, 75]

		ls.clear(); // empty ls
		ls.add(101);
		ls.add(102);
		pq.addAll(ls);
		pq.retainAll(ls); // all element will be removed except ls
		System.out.println(pq); // [101, 102]

		System.out.println(pq.containsAll(ls)); // true
		System.out.println("********************************************");

	}

	public void constructorsOfPQ() {
		// Constructor 2: taking initial capacity
		Queue<Integer> pq1 = new PriorityQueue<Integer>(10);
		System.out.println("Initialised: "+pq1); // [] empty queue

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(100);
		ls.add(200);

		// Constructor 3: taking collection
		Queue<Integer> pq2 = new PriorityQueue<Integer>(ls);
		System.out.println("Adding collections: "+pq2); // [100, 200]

		// Constructor 4: taking initial capacity and comparator
		PriorityQueue<Integer> pq3 = new PriorityQueue<Integer>(2,new MyCompPQ());
		pq3.add(2);
		pq3.add(8);
		pq3.add(6);
		pq3.add(4);
		pq3.add(0);
		System.out.println("Sorted in reverese order: "+pq3); // [8, 4, 6, 2, 0]

	}

	public void constructorsOfPQ2() {
		Queue<Integer> pq4 = new PriorityQueue<Integer>();
		pq4.add(1000);

		// Constructor 5: accepting PQ4
		Queue<Integer> pq5 = new PriorityQueue<Integer>(pq4);
		pq5.add(200);
		pq5.add(1500);
		pq5.add(300);
		System.out.println("Adding another PQ: "+pq5);

		
		
		
		// Constructor 6: accepting SortedSet - need to check implementation
		 SortedSet<String> ss=new TreeSet<String>();
		 ss.add("z");
		 ss.add("a");
		 Queue<String> pq6=new PriorityQueue<String>(ss);
		 System.out.println("Adding SortedSet: "+pq6); // [a, z]
	}

	public static void main(String[] args) {
		QueueWithPriorityQueue obj = new QueueWithPriorityQueue();
		//obj.PQOrdering();
		//obj.methodsOfPQ();
		//obj.constructorsOfPQ();
		obj.constructorsOfPQ2();
	}
}

class MyCompPQ implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {
		int z=b.compareTo(a);
		System.out.println("Comparator: "+a+","+b+", result: "+z);
		
		return z;
	}
}