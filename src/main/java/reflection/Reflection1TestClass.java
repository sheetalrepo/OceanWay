package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * reading class name, modifier, method names etc
 *
 */
public class Reflection1TestClass {

	public static void main(String [] args){

		// get class name reference
		Class ref1 = Reflection1.class;  

		//reading class name
		System.out.println("Class Name: "+ref1.getName());  // Class Name: advjava.Reflection1

		//reading class access modifier
		int mod = ref1.getModifiers();
		System.out.println(Modifier.isPublic(mod));  // true
		System.out.println(Modifier.isPrivate(mod)); // false
		
		//reading interfaces
		Class [] arr = ref1.getInterfaces();
		System.out.println(arr[0]);  // interface advjava.Interface1
		
		
		// reading super class
		System.out.println(ref1.getSuperclass().getName());  //class java.lang.Object
		
		
		//reading methods
		Method [] methods = ref1.getMethods();
		for(Method m: methods){
			System.out.println("method name: "+m.getName());
		}		
		
	}
	
}
