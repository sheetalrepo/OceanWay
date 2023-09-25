package collections;

import java.util.Iterator;
import java.util.Stack;

/*											  | |
 * Stack is subclass of Vector. FILO or LIFO  |_|
 * 
 * 
 * Collection(I)  ---->  List(I) ----->  Vector(C) ----->  Stack(C)
 */
public class StackExamples {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		System.out.println(stk); // [10, 20, 30]

		
		Iterator<Integer> itr=stk.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());  // 10 20 30
		}
		
		int peek = stk.peek();
		System.out.println(stk + " | " + peek);// [10, 20, 30] | 30

		int pop = stk.pop();
		System.out.println(stk + " | " + pop);// [10, 20] | 30

		stk.pop();
		stk.pop();
		// stk.pop(); // EmptyStackException
	}
}
