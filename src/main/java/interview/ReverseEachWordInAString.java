package interview;


public class ReverseEachWordInAString {

	/*
	 * Expected output: avaJ tpecnoC fO ehT yaD 
	 */
	static void reverseEachWordOfString(String inputString) {

		String[] arrWords = inputString.split(" ");
		String reverseString = "";

		for (int i = 0; i < arrWords.length; i++) {
			String word = arrWords[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(inputString);
		System.out.println(reverseString);
	}

	
	

	/*
	 * Expected output: Day The Of Concept Java
	 */
	static void reverseStringWordWise(String inputString) {
		String [] arr = inputString.split(" ");
		
		for(int i= arr.length - 1; i>= 0; i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	
	
	
	/*
	 * Expected output: yaD ehT fO tpecnoC avaJ 
	 */
	static void reverseEvertything(String inputString){
		String [] arr = inputString.split(" ");
		
		for(int i= arr.length - 1; i>=0; i--){
			String word = arr[i];
			for(int j= word.length()- 1; j>=0;j--){
					System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

	
	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");
		reverseStringWordWise("Java Concept Of The Day");
		reverseEvertything("Java Concept Of The Day");
	}
}
