package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToArrayListConversion {

	//Not to be used this way
	public void manualWayArrayToArrayList() {
		String[] arr = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }; // simple array of strings
		ArrayList<String> al = new ArrayList<String>();

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			al.add(arr[i]);
		}

		for (String str : al)
			System.out.print(str + ", "); // Sun, Mon, Tue, Wed, Thu, Fri, Sat,
	}

	//using Arrays.asList(arr)
	public void convertingArraysIntoArrayList() {
		String[] arr = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }; 
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));   
		//al.addAll(Arrays.asList(arr)); //This can also be used
		
		System.out.println();
		for (String str : al)
			System.out.print(str + ", "); // Sun, Mon, Tue, Wed, Thu, Fri, Sat,
	}
	//Another style of writing Array
	//ArrayList<String> al = new ArrayList<String>(Arrays.asList("Jan","Feb", "Mar", "Apr", "May")); 

	
	
	/**
	 * Object Array can only be converted as collection, it can not handle primitives
	 */
	public void convertingArraysIntoList(){
		Integer [] arr=new Integer[3];
		//int [] arr=new int[3]; // primitives array will get compiler error
		arr[0]=1000;
		arr[1]=2000;
		arr[2]=3000;
		
		List<Integer> ls=new ArrayList<Integer>(Arrays.asList(arr));
		for(Integer in: ls){
			System.out.println(in);
		}
		
	}
	
	
	//using Collections.addAll(al,arr)
	public void convertingArraysIntoArrayList2() {
		String[] arr = { "1", "4", "3", "5", "2", "7", "6" };
		ArrayList<String> al = new ArrayList<String>();
		System.out.println();

		Collections.addAll(al, arr); // converting array into array list
		
		Collections.sort(al); // sorting Array List
		al.set(2, "Update"); // set method update value with new one; add method insert new value
		int index = al.indexOf("Update");
		System.out.println("Index is: " + index); // Index is: 2

		for (String str : al)
			System.out.print(str + ", "); // 1-2-Update-4-5-6-7-

		// dynamically added new element, not possible with Arrays
		al.add("5"); // list will looks like: 1-2-Update-4-5-6-7-5-
		System.out.println();
		System.out.println(al.contains("4") + " && " + al.lastIndexOf("5")); // true && 7
	}
	
	

	
	public static void main(String[] args) {
		ArraysToArrayListConversion obj = new ArraysToArrayListConversion();
		obj.manualWayArrayToArrayList();
		obj.convertingArraysIntoArrayList();
		obj.convertingArraysIntoList();
		obj.convertingArraysIntoArrayList2();
		
	}
}
