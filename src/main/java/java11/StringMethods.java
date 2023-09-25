package java11;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethods {

	public static void isBlankMethod() {
		String s1 = "abc";
		String s2 = "";
		String s3 = "   ";
		
		System.out.println(s1.isBlank()); // false
		System.out.println(s2.isBlank()); // true
		System.out.println(s3.isBlank()); // true
		System.out.println("===== * ===== * =====");
	}
	
	/**
	 * it split string by new line and return as array
	 */
	public static void lineMethod() {
		String str = "abc\nmno\nxyz";
		System.out.println(str);
		
		List<String> ls = str.lines().collect(Collectors.toList());
		System.out.println(ls);
		System.out.println("===== * ===== * =====");
	}

	/**
	 */
	public static void stripMethod() {
		String s = " abc ";
		
		System.out.println(">"+s.strip()+"<"); 
		System.out.println("===== * ===== * =====");
	}
	public static void main(String[] args) {
		isBlankMethod();
		lineMethod();
		stripMethod();
	}

}
