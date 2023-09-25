package classes.exceptions;

import java.io.FileNotFoundException;

/**
 * finally block generally used for clean up purposes like closing a connection etc
 * finally will run in two sequence:  try - finally   or  try - catch - finally
 * finally will always get executed even if try has return statement
 * finally will not execute only in one case : System.exit(0)
 */
public class TryCatchFinally {

	public void finallyCode() {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("catching FileNotFound exception");
		} finally {
			System.out.println("finally always execute");
		}
		System.out.println("catch recovered program");
	}
	

	public int returnCode(){
		try{
			return 10;
		}finally{
			System.out.println("Finally Always execute");
		}
	}
	
	/**
	 * If you are not catching a exception then you have to declare it
	 * so that other calling method can handle exception
	 */
	public void mustDeclareIfNotCatching() throws FileNotFoundException{
		try{
			throw new FileNotFoundException();
		}finally{
			//clean up code
		}
	}
	


	/**
	 * catch is not mandatory if finally is present with try
	 * valid combinations: try-catch, try-finally, try-catch-finally
	 */
	public int noFinallyExecutionCase() {
		try {
			System.exit(0); //in this case finally will not be executed
			return 10;
		} finally {
			System.out.println("unreachable code");
		}
	}
	
	public void testExceptionMessage(){
		
		try{
			int i = 100/0;
			System.out.println(i);
		}catch(Exception e){
			//e.printStackTrace(); //show complete trail of exceptions
			//System.out.println(e.getMessage());  //  show only one liner message:   / by zero
			//System.out.println(e);
			
		}
		
	}
	
	

	public static void main(String[] args) throws FileNotFoundException {
		TryCatchFinally obj = new TryCatchFinally();
		//obj.finallyCode();
		//obj.returnCode();
		//obj.mustDeclareIfNotCatching();
		//obj.noFinallyExecutionCase();
		obj.testExceptionMessage();
		
	}
}

/*
catching FileNotFound exception
finally always execute
catch recovered program

Finally Always execute
*/