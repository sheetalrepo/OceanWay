package classes.concepts.objcopy;

import java.util.Arrays;
/**
 * If a class contains only primitives then shallow and deep are same
 * If a class contains references to other objects then we need to we aware of concept  
 * 
 * In shallow copy: only primitives members are get copied
 * In Deep copy: both primitives are ref obj get copied
 * 
 */
class Apple{
	
	int [] array;
	
	// '=' shows a shallow copy example 
	Apple(int [] a){
		this.array = a; 
	}
	
	public void printData(){
		System.out.println("Current Array: "+ Arrays.toString(array));
	}
}


/**
 * In shallow copy complete object is not get copied only the reference get copy
 * If original object get changed then new copied obj will also get changed
 *
 */
public class ShallowCopyExample1 {
	public static void main(String[] args) {
		int [] a1 = {10,20,30};
		Apple obj = new Apple(a1);
		obj.printData(); //[10, 20, 30]

		
		//update the object
		a1[0] = 100;
		obj.printData(); //[100, 20, 30]
	}

}
