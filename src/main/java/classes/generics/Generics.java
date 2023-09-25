package classes.generics;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * collection can store only references to objects, not primitives
 */
public class Generics {

	//Supposed to be a Integer array
	public void preGenericCode1() {
		ArrayList al = new ArrayList(); // want to create Integer array list
		al.add(10); // what compiler see it: al.add(new Integer(10))
		al.add(20);
//		al.add("oops"); // added string by mistake - will get run time exception no compiler error

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			int i = (Integer) itr.next(); // casting required to convert Object into int
			System.out.print(i+" ");  //10 20
		}
		System.out.println("");
	}

	//Supposed to be a String array
	public void preGenericCode2(){
		ArrayList al=new ArrayList();
		al.add("jan");
		al.add("feb");
		al.add(200); // Added by mistake
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			String s=(String) itr.next();  // added int by mistake and Integer object cannot be converted into String
			System.out.println("Pre gen:"+ itr.next());
		}
	}

	
	public void genericCode() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10); // what compiler see it: al.add(new Integer(10))
		al.add(20);
		// al.add("oops"); // compiler error

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int i = itr.next(); // casting not required
			System.out.print(i+" "); //10 20
		}
	}
	
	public static void main(String[] args) {
		Generics obj = new Generics();
		obj.preGenericCode1();
		obj.preGenericCode2();
		obj.genericCode();
	}
}
