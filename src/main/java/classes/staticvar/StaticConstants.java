package classes.staticvar;

/**
 * Constant never get a default value (be an instance or static constant)
 * Constant cannot be used before initialization (be an instance or static constant) 
 * Static constant has to be initialized at declaring time or in static block
 * 
 * Static variable/method get executed in order they appear in class from top to bottom
 *
 */
public class StaticConstants {

	// public static final int ONE ; //compiler error : not initialized here and in static block
	public static final int TEN = 10;
	public static final int FIFTY;

	static {
		System.out.println("I am static block");
		// System.out.println(FIFTY); // compiler error, can't use static constant before initialization
		FIFTY = 50;
	}

	public static void main(String[] args) {
		System.out.println("I am static main");
		StaticConstants obj = new StaticConstants();
	}
}
