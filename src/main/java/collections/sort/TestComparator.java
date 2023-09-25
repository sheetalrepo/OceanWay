package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator is used to custom sort String, int etc
 * Comparable is used to sort custom objects 
 * Reference: https://www.youtube.com/watch?v=JSvVsOm4oX0
 *
 */
public class TestComparator {

	//Java give preferences to Upper case letter over lower case means 'Cat' will come before 'apple' which is surely we don't want
	//Comparable cannot be used in this situation
	//Hence we required Comparator to custom sort string as per our wish, so 'apple' should come first before 'Cat'
	public void problemInStringSorting(){
		String str1 = "apple";
		String str2 = "boy";
		String str3 = "Cat";
		String str4 = "dog";
		
		
		List<String> ls = new ArrayList<String>();
		ls.add(str1);
		ls.add(str2);
		ls.add(str3);
		ls.add(str4);
		
		System.out.println(ls);   // [apple, boy, Cat, dog]
		Collections.sort(ls);
		System.out.println(ls);  // [Cat, apple, boy, dog]
	}
	
	
	
	public void updatedCode() {
		String str1 = "apple";
		String str2 = "boy";
		String str3 = "Cat";
		String str4 = "dog";
		
		
		List<String> ls = new ArrayList<String>();
		ls.add(str1);
		ls.add(str2);
		ls.add(str3);
		ls.add(str4);
		
		System.out.println(ls);   // [apple, boy, Cat, dog]

		//We can use comparator as inner class
		Collections.sort(ls, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
	
		
		System.out.println(ls);  // [apple, boy, Cat, dog]   -- apple comes first , wow!!!
	}

	public static void main(String [] args){
			
		TestComparator obj = new TestComparator();
		obj.problemInStringSorting();
		obj.updatedCode();
		
	}
	
}
