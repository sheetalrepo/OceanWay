package classes.staticvar;

//import collections.ArrayClass;
import static collections.ArrayClass.*;



/**
 * note: we import something when that class is not present in current package
 * In normal import statement we need to use class name to access member
 * In case of static import we can use static member w/o using class name
 */
public class StaticImport {

	public static void main(String [] args){
		
		//static member accessed using class name with normal import
		//ArrayClass.testimportmethod();
		//System.out.println(ArrayClass.testimport);

		
		//static member accessed w/o using class name with static import
		testimportmethod();
		System.out.println(testimport);
			
	}
	
}
