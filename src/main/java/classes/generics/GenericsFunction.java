package classes.generics;

public class GenericsFunction {
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}

	public static void main(String[] args) {
		genericDisplay(11);
		genericDisplay("Wow");
		genericDisplay(1.0);
	}
}