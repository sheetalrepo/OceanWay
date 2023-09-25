package interview;

import java.util.Arrays;

/**
 * Two strings are anagram if by rearranging them we get a new word i.e. both
 * string have exactly same characters in different order
 *
 * 
 * "Mother In Law", "Hitler Woman" "keEp", "peeK" "SiLeNt CAT", "LisTen AcT"
 * "Debit Card", "Bad Credit"
 *
 * 
 */
public class A_Anagram {

	public static void main(String[] args) {

		String str1 = "Mother In Law";
		String str2 = "Hitler Woman";

		// replace all white spaces
		String strA = str1.toLowerCase().replaceAll("\\s", "");
		String strB = str2.toLowerCase().replaceAll("\\s", "");

		char[] arr1 = strA.toCharArray();
		char[] arr2 = strB.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println("Is Anagram: " + Arrays.equals(arr1, arr2));
	}

}
