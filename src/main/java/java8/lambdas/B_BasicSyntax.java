package java8.lambdas;

/**
 * In this case interface method require multiple lines to implement its functionality e.g. line 19,20
 *
 */
public class B_BasicSyntax {

	public static void main(String[] args) {
		Cloud obj = new Cloud();
		System.out.println("Sum: " + obj.multiline(20));
	}
}

class Cloud implements Cloudy {

	@Override
	public int multiline(int i) {
		int sum = i + 20;
		return sum;
	}

}

interface Cloudy {
	int multiline(int i);
}
