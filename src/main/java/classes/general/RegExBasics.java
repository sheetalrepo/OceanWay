package classes.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ?:  Match 0 or 1
 * +:  Match 1 or more
 * *:  Match 0 or more
 * order to rem: ? + *
 */
public class RegExBasics {

	public void basicRegex() {
		Pattern p;
		Matcher m;

		p = Pattern.compile("Java Concepts");
		m = p.matcher("Java Concepts");
		System.out.println("Matches:" + m.matches()); // true

		p = Pattern.compile("Java Concepts");
		m = p.matcher("Java Concepts 5.0");
		System.out.println("Matches:" + m.matches()); // false

		System.out.println("Matches:" + m.find()); // true
	}

	public void regex1() {
		Pattern p;
		Matcher m;

		p = Pattern.compile("java");
		m = p.matcher("java based on oops concept java 8.0 is running as of now");

		while (m.find()) {
			System.out.println("index: " + m.start()); // 0 27
		}
	}

	public void regex2() {
		Pattern p;
		Matcher m;

		p = Pattern.compile("k.+i"); // start with 'k' ends with 'i'
		m = p.matcher("kavi going to daffodil play school, kavi turns 2.7");

		while (m.find()) {
			System.out.println("k 2 i> " + m.group()); // kavi going to daffodil
														// play school, kavi
		}
	}

	public void regex3() {
		Pattern p;
		Matcher m;

		p = Pattern.compile("k.+?i"); // will give group of matches as ? means 0
										// or 1
		m = p.matcher("kavi going to daffodil play school, kavi turns 2.7");

		while (m.find()) {
			System.out.println("reg3> " + m.group()); // kavi kavi
		}
	}

	public void regex4() {
		Pattern p;
		Matcher m;

		p = Pattern.compile("[a-z]+"); // will give group of matches as ? means
										// 0 or 1
		m = p.matcher("kavi going to daffodil at 2.7 age");

		while (m.find()) {
			System.out.print(" " + m.group()); // kavi going to daffodil at age
		}
	}

	public void regex5() {
		Pattern p;
		Matcher m;

		p = Pattern.compile("jon.*? "); // any string starting with jon
		m = p.matcher("jon jonason zen jonvi den");
		System.out.println("");

		while (m.find()) {
			System.out.print(m.group() + " "); // jon jonason jonvi
		}
	}

	public void regex6() {
		Pattern p;
		String str = "kavi, know, all the, colous,at,age of 2";
		p = Pattern.compile("[,]"); // any string starting with jon
		String[] arr = p.split(str);
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "-");
		}

	}

	public static void main(String[] args) {
		RegExBasics obj = new RegExBasics();
		obj.basicRegex();
		obj.regex1();
		obj.regex2();
		obj.regex3();
		obj.regex4();
		obj.regex5();
		obj.regex6();
	}
}
