package interview;

/**
 * 
 * Q: How To Reverse The String With Preserving The Position Of Spaces?
 *
 * 1 22 333 4444 55555
 * 5 55 554 4443 33221
 *
 */
public class ReverseStringMaintainSpaces {

	public void reverseString(String inputString) {

		char[] arr1 = inputString.toCharArray();
		char[] arr2 = new char[arr1.length];

		// for every space in arr1, insert space in arr2
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == ' ') {
				arr2[i] = ' ';
			}
		}

		
		int j = arr2.length - 1;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != ' ') {
				if (arr2[j] == ' ') {
					j--;
				}

				arr2[j] = arr1[i];
				j--;
			}
		}

		System.out.println(inputString);
		System.out.println(String.valueOf(arr2));
	}

	public static void main(String[] args) {
		ReverseStringMaintainSpaces obj = new ReverseStringMaintainSpaces();
		obj.reverseString("I Am Not String");
		obj.reverseString("1 22 333 4444 55555");
	}
}
