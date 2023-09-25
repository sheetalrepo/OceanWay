package collections.wildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperboundExtendsExamples {

	/**
	 * Normal Understanding: Accept only Numbers, Integers
	 * extend behave like extend i.e. upper is bound, only lower entities applicable 
	 */
	public static void printList(List<? extends Number> ls){
		System.out.println(ls);
	}
	
	public static void testPass(){
		//Create Object List
		List<Object> objLs = new ArrayList<>();
		objLs.add("A");
		objLs.add("B");

		//Create Number List
		List<Number> numLs = new ArrayList<>();
		numLs.add(100);
		numLs.add(200);
				
		//Create Integer List
		List<Integer> intLs = new ArrayList<>();
		intLs.add(1);
		intLs.add(2);
		
		//pass list one by one
		//printList(objLs);  //OK, Object is above Number
		printList(numLs);    //OK, Number extends Number
		printList(intLs);    //OK, Integer extends Number
		
	}
	

	
	/**
	 * Pls note we cannot add anything in Upperbound extends case except null
	 * https://stackoverflow.com/questions/2776975/how-can-i-add-to-list-extends-number-data-structures
	 * 
	 * List<? extends Number> foo3 = new ArrayList<Number>;   // List of T which extends Numbers i.e. Integer,Double and Number 
	 * So ideally we can add all three type but List should be of only one T either Integer,Double or Numbers
	 * In List we cant add different element, its again rules of List in Java 
	 * Hence we cant add anything into Upperbound wildcard 
	 * 
	 * We can only use it to read values which will be of type T or subtype of T
	 */
	public static void testAdd(){
		Object obj = "A";
		Number num = 5000;
		Integer in = 50;
		Double d = 50.5;

		//We are trying to add Num, Int, Double in same List as all extends Num. But this is wrong as List can be of only one type
		List<? extends Number> lsNum = new ArrayList<>();
		//lsNum.add(obj);  	
		//lsNum.add(num);  
		//lsNum.add(in); 		
		//lsNum.add(d); 		
		lsNum.add(null);
		
		System.out.println(lsNum);
	}
	
	
	public static void main(String[] args) {
		testPass();
		testAdd();
		
	}

}
