package collections.wildcard;

import java.util.ArrayList;
import java.util.List;


/**
 * Upperbound : We bound/set limit to Number. Now anything can be passed which is lower or equal to Number i.e. Number or Integer,Double
 * 
 * Upper limit has been bound i.e. only lower level allowed
 */
public class WildcardUpperbound {

	/**
	 * Generics Normal Case
	 * Only Numbers can be passed
	 * Subclass of Numbers i.e. Integers/Doubles can't be passed
	 */
	public static double sumForHardcodedType(List<Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}
	
	/**
	 * Generics Upper bound Wildcard Case
	 * We can pass anything which extends Numbers i.e. lower tree
	 */
	public static double sumForUpperBoundWildCard(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		//case 1
		List<Number> number = new ArrayList<>();
		number.add(10);
		number.add(20.5);
		double numberSum = sumForHardcodedType(number);
		System.out.println("Sum of Numbers=" + numberSum);

		
		//case 2 - generics upperbound wildcard
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		double sum = sumForUpperBoundWildCard(ints);
		System.out.println("Sum of ints=" + sum);
		
		
		//sumForHardcodedType(ints); //Can't pass Integer to Numbers
		
		
	}

	

	

}
