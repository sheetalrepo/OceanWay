package interview;

public class StringRemovesWhiteSpaces {

	public void removeWhiteSpace1() {
		String str = "I am into 		Java  World";
		System.out.println(str.replaceAll("\\s", ""));
	}

	public void removeWhiteSpace2() {
		String str = "I am into 		Java  World";
		char[] arr = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] != ' ') && (arr[i] != '\t')) {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {

		StringRemovesWhiteSpaces obj = new StringRemovesWhiteSpaces();
		// obj.removeWhiteSpace1();
		obj.removeWhiteSpace2();
	}
}
