package collections.sort.comparator;

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

	public static void sortStudentClass() {

		// Created a List
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student(2, "Jack"));
		ls.add(new Student(1, "Bob"));
		ls.add(new Student(4, "Elli"));
		ls.add(new Student(3, "Adam"));
		//System.out.println("List :" + ls);

		
		// Convert List to Arrays
		Student[] studArr = new Student[1];
		studArr = ls.toArray(studArr);

		// Arrays.sort(studArr); run time error

		System.out.println("Before: " + Arrays.toString(studArr));
		//Sorting using Comparator
		Arrays.sort(studArr, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.getRollNo() - s2.getRollNo();
			};

		});


		System.out.println("After: " + Arrays.toString(studArr));
	}

	public static void main(String[] args) {
		sortStudentClass();
	}

}
