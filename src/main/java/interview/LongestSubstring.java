package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {

		String inputString = "javaconceptoftheday";
		char[] charArray = inputString.toCharArray();

		String longestSubstring = null;
		int longestSubstringLength = 0;

		// Creating LinkedHashMap with characters as keys and their position as
		// values.
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			}

			// If ch is already present in map, reposioning the cursor i
			// to the position of ch and clearing the map
			else {
				i = map.get(ch);
				map.clear();
			}

			if (map.size() > longestSubstringLength) {
				longestSubstringLength = map.size();
				longestSubstring = map.keySet().toString();
			}
		}

		System.out.println("Input String : " + inputString);
		System.out.println("The longest substring : " + longestSubstring);
		System.out.println("The longest Substring Length : " + longestSubstringLength);
	}
}
