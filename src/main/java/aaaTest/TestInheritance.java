package aaaTest;

import java.util.ArrayList;

class Abc{
	protected void aaa() {
		System.out.println("Parent");
	}
}


public class TestInheritance extends Abc{

	public void aaa() {
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) {
		TestInheritance obj = new TestInheritance();
		obj.aaa();
		
		Abc p = new Abc();
		p.aaa();
		
		
		ArrayList<Integer> list = new ArrayList<>();
	    list.add(1);
	    list.add(new Integer(10));
	    //list.add("20");
	    list.add(null);
	    list.add(null);
	    
	    System.out.println(list);
	}

}
