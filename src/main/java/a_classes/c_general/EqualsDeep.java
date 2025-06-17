package a_classes.c_general;

import java.util.Arrays;

public class EqualsDeep {

	/**
	 * Arrays.equals(arr1, arr2)
	 * 		- equals compare two obj content which is same here
	 * 	
	 * 	Note:
	 * 	if(arr1.equals(arr2))   //FALSE, Check Reference Not Value: not to be used
	 */
	public void compareSimpleArray(){
		int [] arr1 = {1,2,3};
		int [] arr2 = {1,2,3};

		// Check values, what we want most of the time	
		if(Arrays.equals(arr1, arr2))	  
			System.out.println("TRUE");   //Output:  TRUE
		else
			System.out.println("FALSE"); 
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
		obj.compareComplexArrayUsingDeepArrays();
		
		
	}
}
