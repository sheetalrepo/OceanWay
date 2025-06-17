package e_interview;

import java.util.HashMap;
import java.util.Map;

public class A_CharCount {

	public void charOccurenceInAString1(String str, char input) {
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
	public void charOccurenceInAString2(String word, String s) {
		int length1 = word.length();

		word = word.replaceAll(s, "");
		int length2 = word.length();

		System.out.println("Occurance: " + (length1 - length2));
	}

	public void allCharacterCountInAString(String inputString) {
		Map<Character, Integer> map = new HashMap<>();
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
		obj.charOccurenceInAString1("Hello man how are you!! aha", 'a');
		obj.charOccurenceInAString2("I am not using any loops", "a");
		obj.allCharacterCountInAString("hello");
	}

}
