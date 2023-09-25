package collections.sort.comparator;

import java.util.Arrays;


/**
 *  Comparable used in default sorting Arrays.sort(single param)
 *  
 *  Custom sorting not possible, for that we need to use Comparator
 *
 */
public class SortClassWithComparable {

	public static void sortPerson() {
		Person p1 = new Person();
		p1.setAge(100);
		p1.setFirstName("Hen");
		p1.setLastName("Za");
		
		Person p2 = new Person();
		p2.setAge(20);
		p2.setFirstName("Macho");
		p2.setLastName("Nacho");
		
		Person p3 = new Person();
		p3.setAge(50);
		p3.setFirstName("Charli");
		p3.setLastName("Harley");
		
		
		Person[] arrayObj = new Person[3];
		arrayObj[0] = p1;
		arrayObj[1] = p2;
		arrayObj[2] = p3;
		
		
		System.out.println("Before:"+Arrays.toString(arrayObj));
		Arrays.sort(arrayObj);
		System.out.println("After: "+Arrays.toString(arrayObj));
	}
	
	
	
	
	
	public static void main(String[] args) {
		sortPerson();
	}

}
