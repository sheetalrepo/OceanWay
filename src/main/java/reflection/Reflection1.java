package reflection;

/**
 * Reflection: it is a process of analyzing class's capabilities, functionalities at runtime
 * 
 * 
 *
 */
public class Reflection1 implements Interface1 {

	private String s1="100";
	
	//public constructor
	public Reflection1(int a){
		System.out.println("i am public constructor with values: "+a);
	}
	
	private String privateMethod1(){
		return "i am a private method 1";
	}
	
	private String privateMethod2(int a, String b){
		return "i am private method with values: "+ a+" & "+ b;
	}

	@Override
	public void abc() {
		System.out.println("I am interface method");
	}
	
}
