package collections;

import java.util.Arrays;

/**
 * Before using Binary search Array has to be sorted else result will be random
 * 
 * Binary Search gives the index of searched item
 */
public class ArraysSearch {

	
	public static void searchUsingBinarySearch(String s1, char s2) {
		// alphabet, bat
		char[] arr = s1.toCharArray();
		Arrays.sort(arr); //agmno
		

		int index = Arrays.binarySearch(arr, s2);
		System.out.println("index of "+s2+" is "+index+ " in "+ s2);
	}
	
	
	
	public static void test(String s1, String s2) {
		char[] arrBig = s1.toCharArray();
		char[] arrSmall = s2.toCharArray();
		Arrays.sort(arrBig);
		Arrays.sort(arrSmall);
		
		String match = "";
		
		for(int i=0; i<arrSmall.length;i++) {
			char a = arrSmall[i];
			
			for(int j=0; j<arrBig.length;j++) {
				
				if(arrSmall[i]==arrBig[j]) {
					System.out.println("Found - "+ arrSmall[i]);
					match = match + arrSmall[i];
				}
			}
		}
		
		System.out.println("Matched string: "+ match);
		
		//Sort a string
		String newBig = new String(arrBig);
		String newSmall = new String(arrSmall);
		System.out.println(newBig);
		System.out.println(newSmall);
		
		if(newBig.startsWith(newSmall))
			System.out.println("Complete string is present");
		else {
			System.out.println("Complete string is not present");
		}
		
		
	}

	public static void main(String[] args) {
		ArraysSearch.searchUsingBinarySearch("mango",'m');
		//ArraysSearch.test("mango","noa");
	}

}
