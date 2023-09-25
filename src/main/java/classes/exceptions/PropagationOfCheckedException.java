package classes.exceptions;

import java.io.IOException;


public class PropagationOfCheckedException {

	//method 3 got an exception, but it throws rather handling it using catch
	public void method3() throws IOException{
		System.out.println("method3");
		throw new IOException(); 
	}
	
	//exception comes to method2 from method3, this method also not handled it
	public void method2() throws IOException{
		System.out.println("method2");
		method3(); 
		System.out.println("method2 out"); //Will not get executed
	}
	
	/**
	 * I am not throwing exception hence I need to catch it
	 */
	public void method1(){
		System.out.println("method1");
		try {
			method2();
		} catch (IOException e) {
			System.out.println("Exception Handled");
		}
		System.out.println("catch recovered from exception sucessfully");
	}
	
	public static void main(String [] args){
		PropagationOfCheckedException obj=new PropagationOfCheckedException();
		obj.method1();
	}
}
