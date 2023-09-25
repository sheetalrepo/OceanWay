package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *  phoneno has not been serialized and default value get assigned at the time of de-serialization
 * 
 */
public class StudentSerializationTest {

	
	public static void main(String [] args){
		
		Student obj1 = new Student(1, 10, "Ram", new StudentAddress("Delhi") , 123456);
		Student obj2 = new Student(2, 10, "Sham", new StudentAddress("Bombay") , 987654);
		
		
		//write object into stream
		try {
			FileOutputStream fos = new FileOutputStream("student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.writeObject(obj2);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		obj1 = null;
		obj2 = null;
		
		
		//read back objects
		try{
			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student s1 = (Student) ois.readObject();
			Student s2 = (Student) ois.readObject();
			
			ois.close();
			
			System.out.println("s1 objects:");
			System.out.println("id: "+s1.getId()+", name: "+s1.getName()+", age: "+s1.getAge()+", phone: "+s1.getPhoneno()+", address: "+s1.getAddress());
			
			
			System.out.println("s2 objects:");
			System.out.println("id: "+s2.getId()+", name: "+s2.getName()+", age: "+s2.getAge()+", phone: "+s2.getPhoneno()+", address: "+s2.getAddress());
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
