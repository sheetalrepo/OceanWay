package classes.string;

/**
 * Whenever a object is printed it implicitly call obj.toString()
 * As all class are default child of Object class, hence obj.toString() call toString() method of Object class
 * toString() method has this content :  return getClass().getName() + '@' + Integer.toHexString(hashCode())
 * In this class if we print obj then o/p will be "javacode.Student@7852e922" which is not readable
 * To overco
 *
 */
public class ToStringExample {
	public static void main(String [] args){
		Student obj = new Student (10, "Ram");
		System.out.println(obj);  //implicitly it is calling "obj.toString()" and o/p will be "javacode.Student@7852e922"
		System.out.println(obj);  // now we have overridden toString(), so the o/p will be: "After overriding output will be: 10 - Ram"
	}
	
}


class Student {
	int rollno;
	String name;
	
	public Student(int r, String n){
		this.rollno = r;
		this.name = n;
	}

	/**
	 * Now object class toString will not be called
	 */
	@Override
	public String toString(){
		return "After overriding output will be: "+ rollno + " - " + name; 
	}

}