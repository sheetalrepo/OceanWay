package classes.anonymous;

/**
 * Member Class example i.e. non static class example
 * 
 * Inner class cannot have static members as if static member present then
 * we cannot access outside class non static members
 * 
 * After compilation we will have two different .class files
 * OuterClass.class
 * OuterClass$InnerClass.class   i.e. OuterClass1$InnerClass1.class
 * 
 * refer: https://www.youtube.com/watch?v=okruEgWGVGU&list=PLsyeobzWxl7pL4Qy1ftJR0CB0NtjAotyD&index=1
 */

public class OuterClass1 {
	
	int a = 10;
	
	/**
	 * Inner class can access outer class members directly w/o any class name or object
	 */
	class InnerClass1{
		
		public void abc(){
			System.out.println("I am inner member: "+a);  // 10
		}
		
	}
	
	/**
	 * Outer method can create Inner class object and use its members
	 */
	public void outerMethod(){
		InnerClass1 in = new InnerClass1(); 
		in.abc();
	}
	
	
	
	public static void main(String [] args){
		//style 1: to access inner class member
		OuterClass1 obj = new OuterClass1();
		obj.outerMethod();
		
		//style 2: to access inner class member
		//style 2 can be used from any other class which has access to Outer class
		OuterClass1.InnerClass1 inner = obj.new InnerClass1();
		inner.abc();
		
		//A obj = new A();
		//A.B in = obj.new B();
		//in.abc();
				
	}
}
