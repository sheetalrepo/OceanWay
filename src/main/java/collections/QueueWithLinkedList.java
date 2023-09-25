package collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Hierarchy :   Collection(I)  -->  Queue(I)  --> Deque(I)  --> LinkedList(C)
 * Hierarchy :   Collection(I)  -->  List(I)  --> AbstractList(C)  --> AbstractSequenceList(C)  -->  LinkedList(C)
 * 
 * Queue : FIFO  >--->--->---->--->
 * Queue can be implemented using LL or PQ

 *
 */
public class QueueWithLinkedList {

	public static void queueWithLL() {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(4);
		queue.add(1);
		queue.add(3);
		queue.add(2);

		System.out.println(queue); // maintain insertion order with LL
		System.out.println("Peek: " + queue.peek()); // Fetch 0 index element
		System.out.println("Poll: " + queue.poll()); // Fetch & Remove 0 index element
		System.out.println("After Poll: " + queue);

		System.out.println("Boolean Test :" + queue.contains(4));
		System.out.println("Boolean Test :" + queue.contains(2));
		System.out.println("Boolean Test :" + queue.offer(100)); // return true if able to add element in Queue
		
		System.out.println(queue);
		queue.clear(); // To empty the complete queue

		System.out.println(queue); // Empty Queue
	}

	public static void main(String[] args) {
		queueWithLL();
	}

}
