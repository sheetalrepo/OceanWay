package classes.oops;

/*
 * encapsulation: variable shd be private and method should be public
 * 
 * abstraction and encapsulation are both about hiding internal details
 * 
 * encapsulation: it more about hiding members of a class from outside world using private access
 * abstraction: it is more about hiding functionality from outside world using interfaces, abstract classes, compositions etc
 */
public class OopsEncapsulation {
	private int age;
	private String name;
	private String empid;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return empid;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		empid = newId;
	}
}
