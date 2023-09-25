package classes.concepts.objcopy;

import java.util.Arrays;

import org.apache.commons.lang3.SerializationUtils;

/**
 * Will do deep cloning using apache's utils in very simple way
 * 
 * @author Sheetal_Singh
 */
public class DeepCopyExample3 {

	private static void clone1() {
		String[] arr1 = { "a", "b", "c" };
		System.out.println(Arrays.toString(arr1));

		String[] arr2 = SerializationUtils.clone(arr1);
		System.out.println(Arrays.toString(arr2));

		// now update elements
		arr2[0] = "x";
		arr2[1] = "y";
		arr2[2] = "z";
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	private static void clone2() {
		Student s1 = new Student(1, "John", 10);
		System.out.println("First Original Copy: " + s1); // [rollno=1, name=John, age=10]

		Student s2 = SerializationUtils.clone(s1); // [rollno=1, name=John, age=10]

		System.out.println("Second Original Copy: " + s2);
		s2.rollno = 2;
		s2.name = "Dan";
		System.out.println("Second Updated Copy: " + s2); // [rollno=2, name=Dan, age=10]

		System.out.println("First Copy Status: " + s1); // [rollno=1, name=John, age=10]

	}

	public static void main(String[] args) {
		clone1();
		clone2();
	}

}
