package java8.lambdas;

public class Person {

	private String firstname;
	private String lastname;
	private int age;

	public Person(String f, String l, int a) {
		firstname = f;
		lastname = l;
		age = a;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return getLastname()+" "+ getFirstname()+" "+ getAge();
	}
}
