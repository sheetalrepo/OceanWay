package interview;

import java.text.DecimalFormat;

public class C_CharPercentageInString {

	public static void main(String[] args) {

		String inputString = "Tiger Runs @ The Speed Of 100 km/hour.";
		// char [] arr = inputString.toCharArray();

		int totalChars = inputString.length();
		int upperCaseLetters = 0, lowerCaseLetters = 0, digits = 0, others = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseLetters++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseLetters++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				others++;
			}
		}

		double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;
		double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
		double digitsPercentage = (digits * 100.0) / totalChars;
		double otherCharPercentage = (others * 100.0) / totalChars;

		// Format percentage to two decimal places
		DecimalFormat formatter = new DecimalFormat("##.##");
		System.out.println("In '" + inputString + "' : ");
		System.out.println("Uppercase letters are " + formatter.format(upperCaseLetterPercentage) + "% ");
		System.out.println("Lowercase letters are " + formatter.format(lowerCaseLetterPercentage) + "%");
		System.out.println("Digits Are " + formatter.format(digitsPercentage) + "%");
		System.out.println("Other Characters Are " + formatter.format(otherCharPercentage) + "%");
	}
}
