package classes.concepts.objcopy;

import java.io.Serializable;

/**
 * Deep clone:
 * - One way is to use serialization 
 *
 */
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public int rollno;
	public String name;
	public int age;
	
	public Student(){}
	
	public Student(int r, String n, int a){
		this.rollno = r;
		this.name = n;
		this.age = a;
	}


	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
}

