//package aaaTest;
//
//public class JavaFundamentalsSolution1 {
//
//    private static int getSum(int[] numbers) {
//        int sum = 0;
//        if (numbers != null) {
//            for (int number : numbers) {
//                sum += number;
//            }
//        }
//        return sum;
//    }
//
//    private static void printWithPrefixAndPostfix(String text) {
//        if (text == null || text.equals("")) {
//            System.out.println("\"Parameter was empty.\"");
//        } else {
//            System.out.printf("\"The parameterized text was this --> %s <--\"\n", text);
//        }
//    }
//
//    private static String getHungarianNameOfDay(String nameOfDayInEnglish) {
//        String invalidDayMessage = "Parameter is not an English day name starting with capital letter.";
//
//        if (nameOfDayInEnglish == null) {
//            return invalidDayMessage;
//        }
//        switch (nameOfDayInEnglish) {
//            case "Monday":
//                return "Hétfő";
//            case "Tuesday":
//                return "Kedd";
//            case "Wednesday":
//                return "Szerda";
//            case "Thursday":
//                return "Csütörtök";
//            case "Friday":
//                return "Péntek";
//            case "Saturday":
//                return "Szombat";
//            case "Sunday":
//                return "Vasárnap";
//            default:
//                return invalidDayMessage;
//        }
//    }
//
//    private static boolean isNumberDividableBy9AndGreaterThan50(int number) {
//        return number % 9 == 0 && number > 50;
//    }
//
//    private static boolean isTextContainingTheProperCharacters(String text) {
//        return text != null && (text.contains("a") || text.contains("b") || text.contains("c"))
//                && (!text.contains("x") && !text.contains("y") && !text.contains("z"));
//    }
//
//    private static int getGreater(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
//
//    private static Integer getTheGreatest(int[] numbers) {
//        if (numbers == null) {
//            System.out.print("The parameter was null. ");
//            return null;
//        }
//        if (numbers.length == 0) {
//            System.out.print("The parameter was an empty array. ");
//            return 0;
//        }
//        int maxValue = numbers[0];
//        boolean allPositive = true;
//        boolean allNegative = true;
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                allPositive = false;
//            } else if (numbers[i] > 0) {
//                allNegative = false;
//            }
//            if (numbers[i] > maxValue) {
//                maxValue = numbers[i];
//            }
//        }
//        if (allNegative) {
//            System.out.print("Every number was non-positive. ");
//            return 0;
//        }
//        if (!allPositive) {
//            System.out.print("Not every number was positive. ");
//        }
//        return maxValue;
//    }
//
//    public static void main(String[] args) {
//
//        //  Task 1: Implement the function which gets an array of integers as its only parameter and
//        //  returns the sum of them as int, if it is possible to calculate it, otherwise return 0
//
//    	int[] positiveNumbers = {1, 4, 2, 3};
//        int[] nonPositiveNumbers = {-1, 0, -2, 0};
//        int[] decimals = {1, 3, 2, -4, -6};
//        int[] foreverAlone = {42};
//        int[] emptyArray = {};
//
//        System.out.println("Task 1 ---------------------");
//        System.out.println(getSum(new int[]{1, 2, 3, -4}));
//        System.out.println(getSum(new int[]{42}));
//        System.out.println(getSum(null));
//
//
//
//        //Task 2: Implement the method which writes the parameterized text to the console (using System.out.print or
//        // System.out.println), extended by a pre-defined prefix and postfix. If the parameterized text was empty or null,
//        // write the "Parameter was empty." text to the console.
//        // prefix: "The parameterized text was this --> ", postfix: " <--"
//
//        System.out.println("Task 2 ---------------------");
//        printWithPrefixAndPostfix("Example text");
//        printWithPrefixAndPostfix(null);
//        printWithPrefixAndPostfix("");
//
//        // Task 3: Implement the function which returns the Hungarian meaning of the parameterized English day name,
//        // as String. If the parameterized text isn't exactly one of the English day names starting with capital letter
//        // or null then return the "Parameter is not an English day name starting with capital letter." String.
//        // The assertion has to be case-sensitive.
//
//        System.out.println("Task 3 ---------------------");
//        System.out.println(getHungarianNameOfDay("Thursday"));
//        System.out.println(getHungarianNameOfDay("Something"));
//        System.out.println(getHungarianNameOfDay(null));
//
//        // Task 4: Implement the function which returns true if the parameterized int could be divided by 9, and it's also
//        // greater than 50. Return false if either the number cannot be divided by 9, or is not greater than 50, or both.
//
//        System.out.println("Task 4 ---------------------");
//        System.out.println(isNumberDividableBy9AndGreaterThan50(27));
//        System.out.println(isNumberDividableBy9AndGreaterThan50(51));
//        System.out.println(isNumberDividableBy9AndGreaterThan50(90));
//
//        // Task 5: Implement the function which returns true if the parameterized text contains at least one of the
//        // 'a', 'b' or 'c' characters and doesn't contain any of the 'x', 'y' and 'z' characters. Return false otherwise.
//        // Assertion has to be case-sensitive.
//
//        System.out.println("Task 5 ---------------------");
//        System.out.println(isTextContainingTheProperCharacters("apple"));
//        System.out.println(isTextContainingTheProperCharacters("Apple"));
//        System.out.println(isTextContainingTheProperCharacters("axe"));
//        System.out.println(isTextContainingTheProperCharacters(""));
//        System.out.println(isTextContainingTheProperCharacters(null));
//
//        // Task 6: Implement the function which returns the greater one of the parameterized two integers,
//        // if they are different. Return any of them if they are equal.
//
//        System.out.println("Task 6 ---------------------");
//        System.out.println(getGreater(1, 2));
//        System.out.println(getGreater(1, -2));
//        System.out.println(getGreater(5, 5));
//
//        // Task 7: Implement the function which returns the greatest of the parameterized array of positive integers,
//        // if they are different. Return any of them if they are equal. If there are both positive and non-positive
//        // numbers in the array, return the greatest positive number and write the "Not every number was positive." text
//        // to the console. If there are only non-positive numbers in the array, return 0 and write the "Every number
//        // was non-positive." text to the console. If the parameter is an empty array of integers, return 0 and write
//        // the "The parameter was an empty array." text to the console. If the parameter is null, return null and write
//        // the "The parameter was null." text to the console.
//        System.out.println("Task 7 ---------------------");
//        System.out.println(getTheGreatest(new int[] {1, 2, 4, 3}));
//        System.out.println(getTheGreatest(new int[] {1, 2, -3}));
//        System.out.println(getTheGreatest(new int[] {-1, -2, 0}));
//        System.out.println(getTheGreatest(new int[] {}));
//        System.out.println(getTheGreatest(null));
//    }
//
//
//}
