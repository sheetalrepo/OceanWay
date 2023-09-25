package file;

import java.io.Serializable;

/**
 *  As Student object is referencing StudentAddress class and Student is serialized
 *  then all referencing class has to be serialized too else NotSerializableException will come
 */
public class StudentAddress implements Serializable{

	String add;
	
	public StudentAddress(String add){
		this.add = add;
	}
	
	public String getAddress(){
		return add;
	}
	
}
