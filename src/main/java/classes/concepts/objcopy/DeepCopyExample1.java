package classes.concepts.objcopy;

import java.util.Arrays;

class Mango{
	
	int [] array;
	
	// 'new' shows deep copy concept
	Mango(int [] a){
		array = new int[a.length]; 
        for (int i = 0; i < array.length; i++) { 
        	array[i] = a[i]; 
        } 
	}
	
	public void printData(){
		System.out.println("Current Array: "+ Arrays.toString(array));
	}
}



/**
 * In deep copy complete obj get cloned 
 */
public class DeepCopyExample1 {

	public static void main(String[] args) {
		int [] a1 = {10,20,30};
		Mango obj = new Mango(a1);
		obj.printData();  //  [10, 20, 30]

		
		//update the object
		a1[0] = 100;
		obj.printData();  //  [10, 20, 30]

	}

}
