//package aaaTest;
//
//public class JavaFundamentals {
///* 1) Implement the function which gets an array of integers as
// * its only parameter and returns the sum of them as int,
// *    if it is possible to calculate it, otherwise return 0.
// *
// *       examples:
// *       parameter: {1, 2, 3, -4}
// *       returns: 2, as int
// *
// *       parameter: {}
// *       returns: 0, as int
// *
// *       parameter: null
// *       returns: 0, as int
// */
//    private static int getSum(int[] numbers) {
//        // TODO: Implement function here
//    }
//
///* 2) Implement the method which writes the parametered text to the console (using System.out.print or
// *    System.out.println), extended by a pre-defined prefix and postfix. If the parametered text was empty or null,
// *    write the "Parameter was empty." text to the console.
// *       prefix: "The parametered text was this --> "
// *       postfix: " <--"
// *
// *    examples:
// *      parameter: "Example text"
// *      should be written to console: "The parametered text was this --> Example text <--"
// *
// *      parameter: ""
// *      should be written to console: "Parameter was empty."
// *
// *      parameter: null
// *      should be written to console: "Parameter was empty."
// */
//    private static void printWithPrefixAndPostfix(String text) {
//      // TODO: Implement method here
//    }
//
///* 3) Implement the function which returns the Hungarian meaning of the parametered English day name, as String. If the
// *    parametered text isn't exactly one of the English day names starting with capital letter or null then return the
// *    "Parameter is not an English day name starting with capital letter." String. The assertion has to be case
// *    sensitive.
// *
// *    examples:
// *      parameter: "Thursday"
// *      should return: "Cs�t�rt�k"
// *
// *      parameter: "Something"
// *      should return: "Parameter is not an English day name starting with capital letter."
// *
// *      parameter: null
// *      should return: "Parameter is not an English day name starting with capital letter."
// */
//    private static String getHungarianNameOfDay(String nameOfDayInEnglish) {
//        // TODO: Implement function here
//    }
//
///* 4) Implement the function which returns true if the parametered int could be divided by 9 and it's also greater
// *    than 50. Return false if either the number cannot be divided by 9, or is not greater than 50, or both.
// *
// *    examples:
// *      parameter: 27
// *      should return: false
// *
// *      parameter: 51
// *      should return: false
// *
// *      parameter: 90
// *      should return true
// */
//    private static boolean isNumberDividableBy9AndGreaterThan50(int number) {
//        // TODO: Implement function here
//    }
//
///* 5) Implement the function which returns true if the parametered text contains at least one of the 'a', 'b' or 'c'
// *    characters and doesn't contain any of the 'x', 'y' and 'z' characters. Return false otherwise. Assertion has to be
// *    case sensitive.
// *
// *    examples:
// *      parameter: "apple"
// *      should return: true
// *
// *      parameter: "Apple"
// *      should return: false
// *
// *      parameter: "axe"
// *      should return: false
// *
// *      parameter: ""
// *      should return: false
// *
// *      parameter: null
// *      should return: false
// */
//    private static boolean isTextContainingTheProperCharacters(String text) {
//        // TODO: Implement function here
//    }
//
///* 6) Implement the function which returns the greater one of the parametered two integers, if they are different.
// *    Return any of them if they are equal.
// *
// *    examples:
// *      parameters: 1, 2
// *      should return: 2
// *
// *      parameters: 1, -2
// *      should return: 1
// *
// *      parameters: 5, 5
// *      should return: 5
// */
//    private static int getGreater(int a, int b) {
//        // TODO: Implement function here
//    }
//
///* 7) Implement the function which returns the greatest of the parametered array of positive integers, if they are
// *    different. Return any of them if they are equal.
// *    - If there are both positive and non-positive numbers in the array, return the greatest positive number and write
// *    the "Not every number was positive." text to the console.
// *    - If there are only non-positive numbers in the array, return 0 and write the "Every numbers was non-positive."
// *    text to the console.
// *    - If the parameter is an empty array of integers, return 0 and write the "The parameter was an empty array." text
// *    to the console.
// *    - If the parameter is null, return null and write the "The parameter was null." text to the console.
// *
// *    examples:
// *      parameter: {1, 2, 4, 3}
// *      should return: 4
// *
// *      parameter: {1, 2, -3}
// *      should write the "Not every number was positive." text to the console, and
// *      should return: 2
// *
// *      parameter: {-1, -2, 0}
// *      should write the "Every numbers was non-positive." text to the console, and
// *      should return: 0
// *
// *      parameter: {}
// *      should write the "The parameter was an empty array." text to the console, and
// *      should return: 0
// *
// *      parameter: null
// *      should write the "The parameter was null." text to the console, and
// *      should return: null
// */
//    private static Integer getTheGreatest(int[] numbers) {
//        // TODO: Implement function here
//    }
//
///* 8) Implement the function which returns the index of first appearance of the parametered character in the parametered
// *    text, starting with 1. The assertion has to be case sensitive. If the text doesn't contain the character, then
// *    return 0. Implement the other method which writes one of these messages to the console, based on the return value
// *    of the previous function:
// *      a) "The 'Apple is awesome.' text contains the 'a' character, first at this index: 10.", or
// *      b) "The 'Apple is awesome.' text doesn't contain the 'x' character."
// *
// *    examples:
// *      parametered text: "Apple is awesome."
// *      parametered character: 'a'
// *      function should return: 10
// *      should write the "The 'Apple is awesome.' text contains the 'a' character, first at this index: 10." text to the console
// *
// *      parametered text: "apple is awesome"
// *      parametered character: 'a'
// *      function should return: 1
// *      should write the "The 'apple is awesome' text contains the 'a' character, first at this index: 1." text to the console
// *
// *      parametered text: "apple is awesome"
// *      parametered character: 'x'
// *      function should return: 0
// *      should write the "The 'Apple is awesome.' text doesn't contain the 'x' character." text to the console
// *
// *      parametered text: ""
// *      parametered character: 'x'
// *      function should return: 0
// *      should write the "The '' text doesn't contain the 'x' character." text to the console
// */
//    private static int getIndexOfFirstAppearanceOfCharInString(String text, char character) {
//        // The return index should start from 1 if the character is found.
//        // TODO: Implement function here
//    }
//
//    private static void printWhetherStringContainsCharacter(String text, char character) {
//        // TODO: Implement method here, use the getIndexOfFirstAppearanceOfCharInString() function above as well
//    }
//
//    public static void main(String[] args) {
//        // You can check your methods and functions by running the main() method and checking the console output.
//        // You can write further checks if you want, but you don't have to.
//
//        int[] positiveNumbers = {1, 4, 2, 3};
//        int[] nonPositiveNumbers = {-1, 0, -2, 0};
//        int[] decimals = {1, 3, 2, -4, -6};
//        int[] foreverAlone = {42};
//        int[] emptyArray = {};
//
//	    System.out.println("1) Sum of positiveNumbers = " + getSum(positiveNumbers));
//	    System.out.println("1) Sum of emptyArray = " + getSum(emptyArray));
//	    System.out.println("1) Sum of decimals = " + getSum(decimals));
//	    System.out.println("1) Sum of null = " + getSum(null));
//        System.out.println();
//
//        System.out.print("2) Output for Example text = ");
//        printWithPrefixAndPostfix("Example text");
//        System.out.print("2) Output for EMPTY_STRING = ");
//        printWithPrefixAndPostfix("");
//        System.out.print("2) Output for null = ");
//        printWithPrefixAndPostfix(null);
//        System.out.println();
//
//        System.out.println("3) The return value for Thursday = " + getHungarianNameOfDay("Thursday"));
//        System.out.println("3) The return value for Something = " + getHungarianNameOfDay("Something"));
//        System.out.println("3) The return value for null = " + getHungarianNameOfDay(null));
//        System.out.println();
//
//        System.out.println("4) Is 27 greater than 50 and dividable by 9? " + isNumberDividableBy9AndGreaterThan50(27));
//        System.out.println("4) Is 51 greater than 50 and dividable by 9? " + isNumberDividableBy9AndGreaterThan50(51));
//        System.out.println("4) Is 90 greater than 50 and dividable by 9? " + isNumberDividableBy9AndGreaterThan50(90));
//        System.out.println();
//
//        System.out.println("5) Does apple contain 'a', 'b' or 'c', and not any of 'x', 'y' or 'z'? " + isTextContainingTheProperCharacters("apple"));
//        System.out.println("5) Does Apple contain 'a', 'b' or 'c', and not any of 'x', 'y' or 'z'? " + isTextContainingTheProperCharacters("Apple"));
//        System.out.println("5) Does axe contain 'a', 'b' or 'c', and not any of 'x', 'y' or 'z'? " + isTextContainingTheProperCharacters("axe"));
//        System.out.println("5) Does EMPTY_STRING contain 'a', 'b' or 'c', and not any of 'x', 'y' or 'z'? " + isTextContainingTheProperCharacters(""));
//        System.out.println("5) Does null contain 'a', 'b' or 'c', and not any of 'x', 'y' or 'z'? " + isTextContainingTheProperCharacters(null));
//        System.out.println();
//
//        System.out.println("6) Which is greater, 1 or 2? " + getGreater(1, 2));
//        System.out.println("6) Which is greater, 1 or -2? " + getGreater(1, -2));
//        System.out.println("6) Which is greater, 5 or 5? " + getGreater(5, 5));
//        System.out.println();
//
//        System.out.println("7) The greatest of array positiveNumbers: " + getTheGreatest(positiveNumbers) + "\n");
//        System.out.println("7) The greatest of array nonPositiveNumbers: " + getTheGreatest(nonPositiveNumbers) + "\n");
//        System.out.println("7) The greatest of array decimals: " + getTheGreatest(decimals) + "\n");
//        System.out.println("7) The greatest of array emptyArray: " + getTheGreatest(emptyArray) + "\n");
//        System.out.println("7) The greatest of array foreverAlone: " + getTheGreatest(foreverAlone) + "\n");
//        System.out.println("7) The greatest of array null: " + getTheGreatest(null) + "\n");
//        System.out.println();
//
//        System.out.print("8) ");
//        printWhetherStringContainsCharacter("Apple is awesome", 'a');
//
//        System.out.print("8) ");
//        printWhetherStringContainsCharacter("apple is awesome", 'a');
//
//        System.out.print("8) ");
//        printWhetherStringContainsCharacter("Apple is awesome", 'x');
//
//        System.out.print("8) ");
//        printWhetherStringContainsCharacter("", 'a');
//
//        System.out.print("8) ");
//        printWhetherStringContainsCharacter(null, 'a');
//    }
//}