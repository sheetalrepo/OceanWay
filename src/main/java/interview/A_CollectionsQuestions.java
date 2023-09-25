package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * List ['beer','apple','orange','grapes'] reverse it
 * ['reeb','elppa','egnaro','separg']
 *
 */
public class A_CollectionsQuestions {

	public void reverseAListContent() {

		List<String> ls = new ArrayList<>();
		ls.add("beer");
		ls.add("apple");
		ls.add("orange");
		ls.add("grapes");
		System.out.println(ls); // [beer, apple, orange, grapes]

		Collections.reverse(ls);
		System.out.println(ls); // [grapes, orange, apple, beer]

		//now reverse every element in AL
		List<String> ls2 = new ArrayList<>();
		for (String str : ls) {
			ls2.add(reverseMe(str));
		}

		System.out.println(ls2);  // [separg, egnaro, elppa, reeb]
	}

	public String reverseMe(String in) {
		String input = in;
		String rev = "";
		int len = input.length() - 1;

		for (int i = len; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}

	public void getDuplicateEntryFromStringArray() {
		String[] arr = { "one", "three", "two", "five", "three", "one", "six" };
		Set<String> hs = new HashSet<String>();
		for (String str : arr) {
			boolean flag = hs.add(str); // duplicate entry will not be added and
										// give false value
			if (!flag) {
				System.out.print(str + " , "); // three , one ,
			}
		}
	}

	public void removeDuplicateEntryFromStringArray() {
		String[] arr = { "5", "7", "2", "3", "1", "2", "3" };
		TreeSet<String> ts = new TreeSet<String>(Arrays.asList(arr));
		System.out.println(ts); // [1, 2, 3, 5, 7]

		Set<String> ts2 = new TreeSet<String>(Arrays.asList(arr));
		System.out.println(ts2);

	}

	/**
	 * In both AL and LL, rest of the element has been shifted to right
	 */
	public void howToAddElementInMiddleOfAL() {
		List<String> list = new ArrayList<String>();
		list.add(0, "A");
		list.add(1, "B");
		list.add(2, "C");
		list.add(1, "G");
		System.out.println(list); // [A, G, B, C]

		List<String> ll = new LinkedList<String>();
		ll.add(0, "A");
		ll.add(1, "B");
		ll.add(2, "C");
		ll.add(1, "G");
		System.out.println(ll); // [A, G, B, C]
	}

	public void howToGetTop5ElementFromArray() {
		// style 1
		int[] arr = { 10, 20, 5, 15, 40, 50 };
		Arrays.sort(arr); // sort in ascending order
		int[] top5 = Arrays.copyOfRange(arr, arr.length - 5, arr.length); // (arr,
																			// 1,
																			// 6)
		System.out.println(Arrays.toString(top5));

		// style 2
		int[] arr2 = { 10, 20, 5, 15, 40, 50 };
		Arrays.sort(arr2);
		for (int i = arr2.length - 5; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	public void howToGetDuplicateAndUniqueValueAmoungList() {
		List<String> ls1 = new ArrayList<String>();
		ls1.add("a");
		ls1.add("b");
		ls1.add("c");
		ls1.add("d");
		ls1.add("e");
		ls1.add("f");

		List<String> ls2 = new ArrayList<String>();
		ls2.add("a");
		ls2.add("b");
		ls2.add("c");

		// Used Set to remove repeated value in list
		Set<String> set1 = new HashSet<String>();
		set1.addAll(ls1);

		Set<String> set2 = new HashSet<String>();
		set2.addAll(ls2);

		 set1.removeAll(set2); // give unique value in ls1
		//set1.retainAll(set2); // give duplicate values in ls1

		for (String str : set1) {
			System.out.println(str.toString());
		}
	}

	/**
	 * Reverse a LL 
	 */
	public void reverseLL() {
		// style 1:
		List<String> ll = new LinkedList<>();
		ll.add("1");
		ll.add("2");
		ll.add("3");

		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);

		// style 2:
		List<String> llA = new LinkedList<>();
		llA.add("A");
		llA.add("B");
		llA.add("C");

		System.out.println(llA);
		List<String> llB = new LinkedList<>();
		int len = llA.size() - 1;

		for (int i = len; i >= 0; i--) {
			llB.add(llA.get(i));
		}

		System.out.println(llB);
	}

	public static void main(String[] args) {
		A_CollectionsQuestions obj = new A_CollectionsQuestions();
		 obj.reverseAListContent();
		// obj.getDuplicateEntryFromStringArray();
		// obj.removeDuplicateEntryFromStringArray();
		// obj.howToAddElementInMiddleOfAL();
		// obj.howToGetTop5ElementFromArray();
		// obj.howToGetDuplicateAndUniqueValueAmoungList();
		//obj.reverseLL();

	}
}
