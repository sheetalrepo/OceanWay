package collections.wildcard;

import java.util.ArrayList;
import java.util.List;


/**
 * Unbound can accept any thing which satisfy < ? extends Object >
 *
 */
public class WildcardUnbound {

	//Accept anything which extends Objects i.e. everything in Java
	public static void printData(List<?> list){
		for(Object obj : list){
			System.out.print(obj + " > ");
		}
		System.out.println("");
	}	
	
	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20.5);
		printData(numberList);
		
		
		List<Integer> intsList = new ArrayList<>();
		intsList.add(30);
		intsList.add(50);
		printData(intsList);
		
		
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		printData(strList);

	}

}
