package collections.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Doubt
 */
public class WildcardSubtyping {

	public static void main(String[] args) {
		//upperbound case
		List<? extends Integer> obj1 = new ArrayList<>();  // obj of Integer
		List<? extends Number> obj2 =  new ArrayList<>();  // obj of Number, Integer, Double
		obj2 = obj1;  //subtyping, Integer is Subtype of Number
		//obj1 = obj2;  // obj2 cant fit into Integers, hence compiler error 
		
		
		//lowerbound case
		List<? super Integer> obj3 = new ArrayList<>(); // obj of Integer, Number, Object
		List<? super Number> obj4 = new ArrayList<>();  // obj of Number, Object
		obj3 = obj4;  // ???
		//obj4 = obj3;
		
		obj3.add(1);
		obj4.add(10);
		
	}

}

//
//
//List<? extends Integer> intList = new ArrayList<>();
////intList.add(1, 10);
//
//
//List<? extends Number> numList =  new ArrayList<>();
//numList = intList;  //subtyping, Integer is Subtype of Number
//
//
//List<? super Number> foo3 = new ArrayList<Number>();
//foo3.add(10);