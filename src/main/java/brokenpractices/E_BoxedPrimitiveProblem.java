package brokenpractices;

import java.util.Comparator;

public class E_BoxedPrimitiveProblem {

	public static void boxedPrimitive() {
		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a < b ? -1 : (a == b ? 0 : 1);
			}
		};
		System.out.println(naturalOrder.compare(20, 10));
		System.out.println(naturalOrder.compare(100, 100));
		System.out.println(naturalOrder.compare(30, 40));
		System.out.println(naturalOrder.compare(new Integer(100), new Integer(100))); 
	}

	public static void main(String[] args) {
		boxedPrimitive();
	}

}
