package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Methods which not used frequently
 */
public class CollectionsAdvMethods {
	public void setOfMethods1() {
		List<String> al1 = new ArrayList<String>();
		al1.add("1");
		al1.add("2");
		al1.add("3");
		List<String> al2 = new ArrayList<String>();
		al2.add("10");
		al2.add("20");
		al2.add("30");

		System.out.println("Are collections has no common element: "
				+ Collections.disjoint(al1, al2)); // true
		
		Collections.fill(al2, "50"); // fill list with given object
		System.out.println(al2); // [50, 50, 50]

		System.out.println("Occurence of object: "
				+ Collections.frequency(al2, "50")); // 3

		System.out.println(al1); // [1, 2, 3]
		Collections.reverse(al1);
		System.out.println(al1); // [3, 2, 1]

	}

	public void setOfMethods2() {
		List<String> al1 = new ArrayList<String>();
		al1.add("0");
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		al1.add("5");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		

		List<String> al2 = new ArrayList<String>();
		al2.add("2");
		al2.add("3");
		al2.add("4");

		System.out.println("" + Collections.indexOfSubList(al1, al2)); // 2
		System.out.println("" + Collections.lastIndexOfSubList(al1, al2)); // 6

		System.out.println(al1); // [0, 1, 2, 3, 4, 5, 2, 3, 4]
		Collections.replaceAll(al1, "4", "400"); // replace all occurrences of 4
													// with new value
		System.out.println(al1);// [0, 1, 2, 3, 400, 5, 2, 3, 400]
	}

	public void setOfMethods3() {
		List<String> al1 = new ArrayList<String>();
		al1.add("0");
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		al1.add("5");

		System.out.println(al1); // [0, 1, 2, 3, 4, 5]
		Collections.rotate(al1, 1); // rotate to right by 1 place
		System.out.println(al1); // [5, 0, 1, 2, 3, 4]
		Collections.rotate(al1, -1);
		System.out.println(al1); // [0, 1, 2, 3, 4, 5]

		Collections.swap(al1, 1, 4);
		System.out.println(al1); // [0, 4, 2, 3, 1, 5]
		
		Collections.shuffle(al1);
		System.out.println(al1); // [4, 3, 0, 1, 2, 5]
	}
	
	public void countGivenWord(String sentence, String word){
		
		String [] arr = sentence.split(" ");
		List<String> ls = Arrays.asList(arr);
		int count = Collections.frequency(ls, word);
		System.out.println("Count of '"+word+"' in given sentence is "+ count);
		
	}

	public static void main(String[] args) {
		CollectionsAdvMethods obj = new CollectionsAdvMethods();
		//obj.setOfMethods1();
		//obj.setOfMethods2();
		//obj.setOfMethods3();
		obj.countGivenWord("Hello how are you where are you going","you");
		
	}

}
