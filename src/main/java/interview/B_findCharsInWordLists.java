package interview;

import java.util.Arrays;
import java.util.List;

/**
 * Return a word which contains all the characters from input list? word
 * list:["acb","bgbca","aaacbb","asdsd"] input list: [a,b,b,c]
 *
 * Ans: "bgbca" and "aaacbb" | "abc" will not be ans as it contains only single
 * 'b'
 */
public class B_findCharsInWordLists {

	public static String sortWord(String word) {
		char[] arr = word.toCharArray();
		Arrays.sort(arr);
		return String.copyValueOf(arr); // char array to string
	}

	public static void findCharsInWordLists(List<String> list, List<String> wordList) {
		System.out.println("Given word list:" + wordList);
		System.out.println("Chars to find out: " + list);

		// convert list into string
		String str = list.toString().replaceAll(",", "");
		char[] chars = str.substring(1, str.length() - 1).replaceAll(" ", "").toCharArray();
		Arrays.sort(chars); // to sort array
		String charString = String.copyValueOf(chars); // char[] to string

		System.out.println("Result:");
		for (String word : wordList) {
			String sortedWord = sortWord(word);
			if (sortedWord.contains(charString)) {
				System.out.println(word);
			}
		}

	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "b");
		List<String> wordList = Arrays.asList("acb", "bgbca", "aaacbb", "asdsd");

		findCharsInWordLists(list, wordList);

	}

}
