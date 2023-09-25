package classes.exceptions;

/*
 * Unchecked cannot be check by compiler hence called unchecked
 * Runtime exception example : Arithmetic,NumberFormat and Null pointer exceptions  
 * 
 */
public class UncheckedExamples {

	/**
	 * Compiler cannot detect runtime exception hence called runtime
	 * Not necessary to catch or throws runtime exception 
	 */
	public void compilerDontBother1() {
		int i = 100 / 0;
	}

	
	/**
	 * This is just a way to inform other developer that this method may throw runtime exception
	 * throws is not mandatory here
	 * @throws ArithmeticException
	 */
	public void compilerDontBother2() throws ArithmeticException {
		int i = 100 / 0;
	}

	
	
	
	
	/**
	 *  runtime exception can also be catched if we want to save the program
	 */
	public void catchRuntimeException() {

		try {
			int i = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println("successfully recovered program from runtime exception");
		}
		System.out.println("Program resumed as usual...");
	}

	
	
	
	/**
	 *  we can give user defined message in this way
	 */
	public void throwRuntimeException()  {
		throw new ArithmeticException("I dont want to save the program if this comes");
	}

	

	
	
	public static void main(String[] args) {
		UncheckedExamples obj = new UncheckedExamples();
		//obj.compilerDontBother1();
		//obj.compilerDontBother2();
		
		//obj.catchRuntimeException();
		//obj.throwRuntimeException();
	}
}
