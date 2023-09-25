package classes.initialization;

/*
 * static var share common copy for all class object
 * all static member executed in sequence they appear
 * this(), super() cannot be used inside static methods
 * 
 * 
 * one rule to remember: static method like main() require obj to access non static methods/variables
 */

public class StaticExample1{

	static int a=10;
	int b=20;
	
	static{
		System.out.println("Block: i am a static block:"+a);
	}
	
	public static void method1(StaticExample1 obj){
		System.out.println("SM: I am a static method:"+a);
//		this.a=a;  // compiler error
//		method2(); // compiler error
//		System.out.println("b="+b); // compiler error
		System.out.println("SM: Using obj i can access non-static members: "+obj.b); // compiler error
	}
	
	public void method2(){
		System.out.println("M: I am a non static method:"+a);
		System.out.println("M: I can access non static var:"+b);
	}
	
	public static void main(String [] args){
		
		System.out.println("Main: I can access static var w/o obj:"+a);

		StaticExample1 obj1=new StaticExample1();
		StaticExample1 obj2=new StaticExample1();
		method1(obj1);
		obj1.method2();
		
		StaticExample1.a=50; // a=50
		StaticExample1.a=a+1; // a=50+1
		System.out.println(StaticExample1.a); //51
		System.out.println(StaticExample1.a); //51
		
		obj1.b=50;   // b=50
		obj2.b=obj2.b+1;  // b=20+1
		System.out.println(obj1.b);  // 50
		System.out.println(obj2.b);  // 21
	}
}

/* o/p

i am a static block:10
I am a static method:10
I can access static var w/o obj:10
I am a non static method:10
I can access non static var:20
51
51
50
21

*/