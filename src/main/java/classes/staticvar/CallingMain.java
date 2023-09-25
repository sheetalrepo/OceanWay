package classes.staticvar;

/**
 * interview question: can object call static methods like main() method
 * 
 * This is just to show that object can call a static method But Ideally its of
 * no use to call a static method from object we should call using class name
 * static method will not behave differently based on object value hence use
 * class name
 *
 */
public class CallingMain {

	static int counter = 0;

	public static void callme(CallingMain obj) {
		counter++;
		System.out.println("I am in Method");

		String[] arr = { "10", "20" };
		main(arr); // also work fine but get into a loop
	}

	public static void main(String[] args) {
		CallingMain obj = new CallingMain();
		System.out.println("I am in Main, array length: " + args.length);

		if (counter == 0) {
			callme(obj);
		}
	}
}
