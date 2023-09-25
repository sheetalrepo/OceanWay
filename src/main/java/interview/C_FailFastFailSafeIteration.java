package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class C_FailFastFailSafeIteration {
	
	
	/**
	 * Fail Fast: On run time if any collection is modified then it will throw ConcurrentModificationException
	 * 
	 * As new collection classes are not thread safe i.e. non synchronized hence modification is not allowed on runtime
	 */
	public static void testFailFast() {
		
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		
		Iterator<Integer> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			ls.add(4); //added while iterating
		}
		
	}
	

	/**
	 * Fail Safe: On run time if any collection is modified then it will not throw ConcurrentModificationException
	 * 
	 * CopyOnWriteArrayList classes are thread safe i.e. synchronized hence modification can be done on runtime
	 * same will not work for Vector and others
	 * 
	 */
	public static void testFailSafe() {
		
		List<Integer> ls = new CopyOnWriteArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		System.out.println(ls);
		
		Iterator<Integer> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			ls.add(10); //added while iterating
		}
		System.out.println(ls);
	}
	

	
	
	public static void main(String args[]) {
		//testFailFast();
		testFailSafe();
	}

}
