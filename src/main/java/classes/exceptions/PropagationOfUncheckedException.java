package classes.exceptions;

//runtime dont propogates
public class PropagationOfUncheckedException {

	public void method2(){
		System.out.println("method2");
		throw new ArithmeticException("dont want to handle...");
	}
	
	
	
	public void method1(){
		System.out.println("method1");
		method2();
		System.out.println("dead code");
	}
	
	
	
	public static void main(String [] args){
		PropagationOfUncheckedException obj=new PropagationOfUncheckedException();
		obj.method1();
	}
	
	
}
