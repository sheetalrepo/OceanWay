package classes.exceptions;

/**
 * To create a custom exception extends Exception class which further extends Throwable class
 */
class MyOwnException extends Exception {
	
	int price;
	
	public MyOwnException() {
		System.out.println("UDE :  mango is not ripped");
	}
	
	public MyOwnException(int p) {
		this.price = p ;
		System.out.println("UDE : Price should not be negative: "+ price);
	}
	
}