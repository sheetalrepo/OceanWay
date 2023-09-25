package interview;

import java.util.HashMap;
import java.util.Scanner;

public class A_CharCount {

	public void charOccurenceInAString1(char input, String str) {
		char[] ch = str.toCharArray();

		char c = input;
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c)
				count++;
		}
		System.out.println("Occurences: " + count);
	}

	// without using loops
	public void charOccurenceInAString2(String input, String str) {
		int length1 = str.length();

		str = str.replaceAll(input, "");
		int length2 = str.length();

		System.out.println("Occurences: " + (length1 - length2));
	}

	public void allCharacterCountInAString(String inputString) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] arr = inputString.toCharArray();

		// checking each char of strArray
		for (char key : arr) {
			//map.put(key, map.containsKey(key)? map.get(key)+1:1);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		A_CharCount obj = new A_CharCount();
		obj.charOccurenceInAString1('a', "Hello man how are you!! aha");
		obj.charOccurenceInAString2("a", "I am not using any loops");
		obj.allCharacterCountInAString("hello");
	}

}
