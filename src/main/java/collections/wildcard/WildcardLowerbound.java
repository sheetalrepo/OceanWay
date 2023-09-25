package collections.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Lowerbound : We bound/set limit to Integers. Now anything can be passed which is upper to integers i.e. Number or Object
 * 
 * Lower limit has been bound i.e. only upper level allowed
 */
public class WildcardLowerbound {


	//Accept anything which is above/super to Integers
	public static void addIntegers(List<? super Integer> list){
		for(Object obj : list){
			System.out.print(obj + " > ");
		}
		System.out.println("");
		
	}
	
	
	public static void main(String[] args) {
		//Integer passed
		List<Integer> intsList = new ArrayList<>();
		intsList.add(300);
		intsList.add(500);
		addIntegers(intsList);
		
		//Number passed
		List<Number> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		addIntegers(numList);
		
		//Obj passed
		List<Object> objList = new ArrayList<>();
		objList.add(100.5);
		objList.add("abc");
		objList.add(200);
		addIntegers(objList);
		
		
	}

}
