package interview;

public class RecursionReverse {

	public void reverseNumber(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			reverseNumber(number / 10);
		}
		
	}

	public void reverseString(String str) {
		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverseString(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {
		RecursionReverse obj = new RecursionReverse();
		obj.reverseNumber(12345);
		obj.reverseString("Hello");
	}

}
