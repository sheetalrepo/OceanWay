package e_interview;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * input  -> aaaabbc444&&&&&aazccc  
 * output -> a4b2c143&5a2z1c3
 * 
 */
public class A_CharOccurrence {

	/**
	 * All char will be treated as one
	 * 
	 * input: aaaccbbbaa
	 * output: a5c2b3
	 */
	public void printAllCharOccurrencesCount(String str){
		System.out.println("### Puzzel 1:");
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c: charArray ){
			map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
		}

		System.out.println(map);
		
		for(Character key : map.keySet()){
			System.out.print(key + "" + map.get(key));
		}
	}



	/**
	 * All char will be treated differently
	 * IMP: char[] NOT REQUIRED. Directly use STRING.charAt()
	 * 
	 * input: aaabbcccaa
	 * output: a3b2c3a2
	 */
	public void printAllCharOccurrencesCount2(String str){
		System.out.println("\n\n### Puzzel 2:");
		System.out.println("Given String: "+ str);
		StringBuilder sb = new StringBuilder();
		int count = 1;     // IMP: count will be 1

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++; // Increment count for consecutive characters
			} else {
				sb.append(str.charAt(i - 1)).append(count); // IMP: Append previous char & count
				count = 1; // IMP: count reset to 1
			}
		}

		// Append last character and its count
		sb.append(str.charAt(str.length() - 1)).append(count);

		System.out.println(sb);
	}


	public static void main(String[] args) {
		A_CharOccurrence obj = new A_CharOccurrence();
		//obj.printAllCharOccurrencesCount("aaabbcccaa");	   //a5b2c3	
		obj.printAllCharOccurrencesCount2("aaabbccca");    //a3b2c3a1
	}

}
