package java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPersonObjects {

	public static List<Person> getListOfPerson(){
		List<Person> ls = Arrays.asList(
				new Person("john", "cena", 30), 
				new Person("kate", "winslette", 32),
				new Person("albert", "pinto", 32), 
				new Person("abrm", "Lincon", 32)
				);
				
		return ls;
	}
	

	public static void printAll(List<Person> ls) {
		System.out.println("-------------------------------");
		for (Person p : ls) {
			System.out.println(p);
		}
	}
	
	//sorting as per last name
	public static void sortBeforeJava8(List<Person> ls) {

		Collections.sort(ls, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastname().toLowerCase().compareTo(o2.getLastname());
			}
		});

		printAll(ls);
	}
	
	
	/**
	 * this is also using same Collections's sort method
	 * just we converted it into lambadas
	 * 
	 * In default sorting, Capitals comes before small case, hence we need to convert it into lower case
	 */
	public static void sortWithJava8(List<Person> ls) {
		Collections.sort(ls, (o1, o2) -> o1.getLastname().toLowerCase().compareTo(o2.getLastname()));
		printAll(ls);
	}

	
	public static void main(String[] args) {
		List<Person> persons = getListOfPerson();
		System.out.println("List Of Person: "+ persons);
		
		sortBeforeJava8(persons);
		sortWithJava8(persons);
	}

}
