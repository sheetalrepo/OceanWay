package collections;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Hierarchy :   Collection(I)  -->  Queue(I)  --> Deque(I)
 * Queue : 
 * 1. It is based on FIFO  [first, second, third.....], on calling poll/peek; 'first' will be picked
 * 2. We add element to one end and remove from another end
 * 
 * 
 * DEQueue (Full form: Double Ended Queue)
 * 1. We can add things to either end, and take them from either end
 * 2. Stack(LIFO)/Queue(FIFO) can be implemented using this
 */
public class QueueAsDeque {

	
	public static void dequeLinkListExample() {
		Deque<Integer> deque = new LinkedList<Integer>(); 
				
		deque.add(50);
		deque.add(60);
		deque.add(40);
		System.out.println(deque);  // insertion order maintained  [50(Head),60,40(Tail)]
		
		deque.addFirst(100);
		deque.addLast(200);
		System.out.println(deque);  // 100(Head) ...... 200(Tail)
		
		
		deque.removeFirst();  
		deque.removeLast();
		System.out.println(deque);  // [50(Head),60,40(Tail)]
		
		
		deque.push(500); //same as addFirst()
		deque.offer(600); //same as addLast()
		System.out.println(deque);  // 500 ....... 600
		
		deque.pop();  //same as removeFirst()
		System.out.println(deque);  
	}
	
	
	
	
	public static void main(String[] args) {
		dequeLinkListExample();
	}

}
