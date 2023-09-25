package classes.concepts.objcopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.yaml.snakeyaml.Yaml;




public class DeepCopyExample2 {

	
	/**
	 * Makes a deep copy of any Java object that is passed using serialization
	 */
	 @SuppressWarnings("unused")
	private static Object deepCopyUsingSerialization(Object object) {
	   try {
	     ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	     ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
	     outputStrm.writeObject(object);
	     ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
	     ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
	     return objInputStream.readObject();
	   }
	   catch (Exception e) {
	     e.printStackTrace();
	     return null;
	   }
	 }
	
	
	 
	/**
	 *  Makes a deep copy of any Java object that is passed using YAML
	 */
	public static <T> T deepCopyUsingYaml(T inputObj) {
		Yaml yaml = new Yaml();
		String str = yaml.dump(inputObj);
		
		T newObj = yaml.load(str);
		return newObj;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "John", 10);
		System.out.println("First Original Copy: "+ s1); //[rollno=1, name=John, age=10]
		
		//Student s2 = (Student)deepCopyUsingSerialization(s1);
		Student s2 = (Student)deepCopyUsingYaml(s1); // [rollno=1, name=John, age=10]
		
		System.out.println("Second Original Copy: "+ s2);
		s2.rollno = 2;
		s2.name = "Dan";
		System.out.println("Second Updated Copy: "+ s2); //[rollno=2, name=Dan, age=10]
		
		System.out.println("First Copy Status: "+ s1); // [rollno=1, name=John, age=10]

	}

}
