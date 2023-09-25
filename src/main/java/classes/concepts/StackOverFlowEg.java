package classes.concepts;

/**
 * If same method called again and again then stack overflow exception comes
 * rather OutOfMemory
 */
public class StackOverFlowEg {

	public static void callMe() {
		callMe();
	}

	public static void main(String[] args) {
		try {
			callMe();
		} catch (OutOfMemoryError e) {
			System.out.println("OOM");
		} catch (StackOverflowError e) {
			System.out.println("SOE");
		} catch (Exception e) {
			System.out.println("Exception");
		}

	}

}
