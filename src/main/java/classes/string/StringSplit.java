package classes.string;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 */
public class StringSplit {

	public static void fetchSpecificCharactersFromStringUsingSplitFunc() {
		String str = "Hi i am learning 50";

		// to read digits as int we have two approaches
		String[] arr1 = str.split(" ");
		System.out.println(arr1);					//[Ljava.lang.String;@15db9742
		System.out.println(arr1.toString()); 		//[Ljava.lang.String;@7852e922
		System.out.println(Arrays.toString(arr1)); 	//[Hi, i, am, learning, 44]

		System.out.println(arr1.length); // 5
		int age = 0;
		try {
			age = Integer.parseInt(arr1[arr1.length - 1]);
		} catch (NumberFormatException nfe) {
			System.out.println("NFE catched");
		}

		System.out.println(age); // 50

		if (age == 50) {
			System.out.println("Age compared");
		}

	}

	
	public static void fetchSpecificCharactersFromStringUsingSubStringFunc() {
		String str = "Hi i am learning 50";
		
		// use substring
		String age2 = str.substring(str.length() - 2);
		int ageInt = Integer.parseInt(age2);
		System.out.println(ageInt); // 50

		
		
	}
	
	

	public static void main(String[] args) {
		fetchSpecificCharactersFromStringUsingSplitFunc();
		fetchSpecificCharactersFromStringUsingSubStringFunc();
	}

}
