package collections.sort.comparator;

public class Person implements Comparable<Person>{
	int age;
	String firstName;
	String lastName;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	@Override
	public int compareTo(Person obj) {
		//return this.getAge() - obj.getAge() ;   //ascending
		return obj.getAge() - this.getAge();      //descending
		//return this.getLastName().codePointAt(0) - obj.getLastName().codePointAt(0);
		
	}
	
}
