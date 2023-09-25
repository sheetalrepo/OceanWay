package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public void simpleComparator() {
		//Type 4: Constructor accepting comparator
		TreeSet<String> ts = new TreeSet<String>(new MyComp());
		ts.add("1");
		ts.add("2");
		ts.add("3");
		ts.add("4");
		System.out.println(ts);
	}

	public static void main(String[] args) {
		TreeSetComparator obj = new TreeSetComparator();
		obj.simpleComparator();
	}
}

class MyComp implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
//		return str1.compareTo(str2); //[1, 2, 3, 4]
		return str2.compareTo(str1); //[4, 3, 2, 1]
	}

}