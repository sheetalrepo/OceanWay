package brokenpractices;

import java.util.Comparator;

/**
 * Rule: 
 * Always use primitive over Boxed primitive like Integer, Long, Boolean
 * Note: In collections we have to use Boxed primitive as collection don't
 * support primitive
 * 
 * @author Sheetal_Singh
 */
public class E_BoxedPrimitiveSolution {

	public static void boxedPrimitiveUpdatedCode() {

		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer a1, Integer b1) {
				
				// Auto Unboxing : Integer to int convertion
				int a = a1;
				int b = b1;
				
				return a < b ? -1 : (a == b ? 0 : 1);
			}
		};

		System.out.println(naturalOrder.compare(20, 10));
		System.out.println(naturalOrder.compare(100, 100));
		System.out.println(naturalOrder.compare(30, 40));
		System.out.println("Corrected:" + naturalOrder.compare(new Integer(100), new Integer(100)));
	}

	
	public static void main(String[] args) {
		boxedPrimitiveUpdatedCode();
	}

}
