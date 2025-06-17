package e_interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class A_CharCheck {

	/**
	 * Case 1: I want to check if str2 is present in str1 in the same sequence
	 */
	public static void case1(){
		String str1 = "Mango";
		String str2 = "ng";

		// Using contains()
		if (str1.contains(str2)) {
			System.out.println("str2 is present in str1");
		} else {
			System.out.println("str2 is NOT present in str1");
		}

		// Using indexOf()
		if (str1.indexOf(str2) != -1) {
			System.out.println("str2 is found at index: " + str1.indexOf(str2));
		}
		
		System.out.println("================");
	}

	/**
	 * Case 2: I want to check if int[] 1 is present in int[] 2, anywhere 
	 */
	public static void case2int(){
		Integer[] arr1 = {1, 2, 3, 4, 5};
		Integer[] arr2 = {3, 5};

		List<Integer> ls1 = Arrays.asList(arr1);
		List<Integer> ls2 = Arrays.asList(arr2);

		boolean containsAll = ls1.containsAll(ls2);
		System.out.println("All Integer elements of arr2 in arr1:  " + containsAll);
	}
	
	
	/**
	 * Case 2: I want to check if str2 characters is present in str1, anywhere 
	 * 
	 * above logic will not work with char
	 */
	public static void case2char(){
		String str1 = "Mango";
		String str2 = "no";

		Set<Character> set = new HashSet<>();
		for (char c : str1.toCharArray()) { // Store characters of str1
			set.add(c);
		}

		boolean allPresent = true;
		for (char c : str2.toCharArray()) { // Check each character of str2
			if (!set.contains(c)) {
				allPresent = false;
				break;
			}
		}

		System.out.println(allPresent ? "All characters found" : "Some characters missing");
		System.out.println("================");
	}
	
	
	public static void main(String[] args) {
		case1();
		case2int();
		case2char();
	}

}
