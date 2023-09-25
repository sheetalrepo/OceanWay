package file;

import java.io.Serializable;

public class Student implements Serializable {

	int id;
	int age;
	String name;
	StudentAddress address;
	
	transient int phoneno; //will not get serialized
	
	public Student(int id, int age, String name, StudentAddress address, int phoneno){
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
	}
	
	//getter and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address.getAddress();
	}
	public void setAddress(StudentAddress address) {
		this.address = address;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int p) {
		this.phoneno = p;
	}
	
}
