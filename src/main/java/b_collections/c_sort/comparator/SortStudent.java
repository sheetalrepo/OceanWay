package b_collections.c_sort.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * Major advantage of Comparator over Comparable
 * is w/o updating Student class code we can sort its object.
 * 
 * In comparable, we have to implement Comparable interface in Student class 
 *
 * Comparator useful if Student is 3rd party class over which we don't have any control	
 *
 */
public class SortStudent {

	public static void sortStudentList(){
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student(2, "Jack"));
		ls.add(new Student(1, "Bob"));
		ls.add(new Student(4, "Elli"));
		ls.add(new Student(3, "Adam"));
		
		ls.sort(Comparator.comparing(x -> x.name));
		System.out.println(ls);
		
		ls.sort(Comparator.comparing(x -> x.rollNo));
		System.out.println(ls);
		System.out.println("====================================");
	}
	
	public static void sortStudentArray() {
		//List
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student(2, "Jack"));
		ls.add(new Student(1, "Bob"));
		ls.add(new Student(4, "Elli"));
		ls.add(new Student(3, "Adam"));
		
		
		// Convert List to Arrays
		Student[] arr = new Student[1];
		arr = ls.toArray(arr);

		//Arrays.sort(studArr); run time error
		Arrays.sort(arr, (s1, s2) -> s1.getRollNo() - s2.getRollNo());
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		sortStudentList();
		sortStudentArray();
	}

}
