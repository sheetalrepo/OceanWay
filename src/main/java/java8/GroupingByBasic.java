package java8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
	private String name;
	private String city;
	private int age;

	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
}






public class GroupingByBasic {
	
	public static void groupPreJava8(List<Person> personList) {
		Map<String, List<Person>> cityMap = new HashMap<>();

		for (Person person : personList) {
			if (!cityMap.containsKey(person.getCity())) {
				cityMap.put(person.getCity(), new ArrayList<>());
			}
			cityMap.get(person.getCity()).add(person);
		}

		System.out.println("Person grouped by cities :          " + cityMap);

	}

	public static void groupJava8(List<Person> personList) {
		Map<String, List<Person>> cityMap = new HashMap<>();
		
		// Let's see how we can group objects in Java 8
		cityMap = 
				personList.stream()
				.collect(Collectors.groupingBy(Person::getCity));
		System.out.println("Person grouped by cities in Java 8: " + cityMap);

	
		// Now let's group person by age
		Map<Integer, List<Person>> ageMap = 
				personList.stream()
				.collect(Collectors.groupingBy(Person::getAge));
		System.out.println("Person grouped by age in Java 8:    " + ageMap);

	}

	public static void main(String args[]) throws IOException {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Dan", "Delhi", 20));
		personList.add(new Person("Dave", "Delhi", 20));
		personList.add(new Person("Peter", "Pune", 25));
		personList.add(new Person("Bob", "Bombay", 25));
		personList.add(new Person("Pen", "Pune", 25));
		personList.add(new Person("Delta", "Delhi", 30));

		
		groupPreJava8(personList);
		groupJava8(personList);

	}

}
