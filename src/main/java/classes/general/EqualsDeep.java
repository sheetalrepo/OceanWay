package classes.general;

import java.util.Arrays;

public class EqualsDeep {

	/**
	 * equals compare two obj content which is same here
	 */
	public void compareSimpleArray(){
		int [] arr1 = {1,2,3};
		int [] arr2 = {1,2,3};
		
		//if(arr1.equals(arr2))
		if(Arrays.equals(arr1, arr2))
			System.out.println("TRUE"); // TRUE
		else
			System.out.println("FALSE"); 
	}
	
	
	/**
	 * Arrays.equals() cannot go deep inside arrays to check for content
	 * For this we need deep array concept
	 */
	public void compareComplexArray(){
		int [] a1 = {1,2,3};
		int [] a2 = {1,2,3};
		
		Object [] arr1 = {a1};
		Object [] arr2 = {a2};
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("TRUE"); 
		else
			System.out.println("FALSE"); // FALSE
	}
	
	
	/**
	 * deep equals go inside arrays's of array
	 */
	public void compareComplexArrayUsingDeepArrays(){
		int [] a1 = {1,2,3};
		int [] b1 = {10,20,30};
		
		int [] a2 = {1,2,3};
		int [] b2 = {10,20,30};
		
		Object [] arr1 = {a1,b1};
		Object [] arr2 = {a2,b2};
		
		if(Arrays.deepEquals(arr1, arr2))
			System.out.println("TRUE"); // TRUE
		else
			System.out.println("FALSE"); 
	}
	
	
	
	public static void main(String [] args){
		EqualsDeep obj = new EqualsDeep();
		obj.compareSimpleArray();
		obj.compareComplexArray();
		obj.compareComplexArrayUsingDeepArrays();
		
		
	}
}
