package collections.wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerboundSuperExamples {

	/**
	 * Normal Understanding: Accept only Numbers, Object
	 * super behave like super 
	 */
	public static void printList(List<? super Number> ls){
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
		printList(objLs);   //OK, Object is super Number
		printList(numLs);   //OK, Number is super Number
//		printList(intLs); //Compiler Error, Integer is not super to Number
		
	}
	

	
	/**
	 * While adding into wildcard list, 'super' behaves opposite way
	 * 
	 * in simple terms while adding wildcard behave like normal list i.e Animal can't be added into Cat
	 */
	public static void testAdd(){
		Object obj = "A";
		Number num = 5000;
		Integer in = 50;
		Double d = 50.5;

		List<? super Number> lsNum = new ArrayList<>();
		//lsNum.add(obj);  	//?? Compiler error, Higher level thing cannot be added 
		lsNum.add(num);  
		lsNum.add(in); 		//?? Able to add integer because integer is a subtype of whatever can be added into List i.e. Number,Object
		lsNum.add(d);		//??
		
		System.out.println(lsNum);
	}
	
	
	public static void main(String[] args) {
		testPass();
		testAdd();
		
	}

}
