package classes.primitives;

import java.util.Comparator;


/**
 * Rule: Always use primitive over Boxed primitive like Integer, Long, Boolean etc
 * Note: In collections we have to use Boxed primitive as collection don't support primitive
 * 
 * @author Sheetal_Singh
 */
public class PreferPrimitiveOverboxedPrimitive {

	
	public void boxedPrimitive() {

		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a < b ? -1 : (a == b ? 0 : 1);
			}
		};
		
		System.out.println(naturalOrder.compare(20, 10));   // 1  Correct
		System.out.println(naturalOrder.compare(100, 100)); // 0  Correct
		System.out.println(naturalOrder.compare(30, 40));   // -1 Correct
		System.out.println(naturalOrder.compare(new Integer(100), new Integer(100)));  // 1 : Wrong
	}

	
	public void boxedPrimitiveUpdatedCode() {

		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer a1, Integer b1) {
				//Auto Unboxing
				int a = a1;
				int b = b1;
				return a < b ? -1 : (a == b ? 0 : 1);
			}
		};
		
		System.out.println(naturalOrder.compare(20, 10));   // 1  Correct
		System.out.println(naturalOrder.compare(100, 100)); // 0  Correct
		System.out.println(naturalOrder.compare(30, 40));   // -1 Correct
		System.out.println(naturalOrder.compare(new Integer(100), new Integer(100)));  // 0 : Correct
	}

	
	
	public static void main(String[] args) {
		PreferPrimitiveOverboxedPrimitive obj = new PreferPrimitiveOverboxedPrimitive();
		obj.boxedPrimitive();
		obj.boxedPrimitiveUpdatedCode();
	}

}
