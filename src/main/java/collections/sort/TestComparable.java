package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String [] args){

		Users obj1 = new Users();
		obj1.setUsername("zob");
		obj1.setPassword("z-pass");
		
		Users obj2 = new Users();
		obj2.setUsername("elli");
		obj2.setPassword("e-pass");
		
		List<Users> ls = new ArrayList<Users>();
		ls.add(obj1);
		ls.add(obj2);
		
		//Collections.sort(ls);  - compiler error, collections sort method only work on simple lists not on customized list
		//To use above method we need to implement Comparable interface
		
		// as we have implemented Comparable interface now there will be no error
		//Collection.sort method will call compareTo method internally
		Collections.sort(ls);  
		
		System.out.println(ls.get(0).getUsername());    // elli
		System.out.println(ls.get(1).getUsername());    // zob

	
}
	
}
