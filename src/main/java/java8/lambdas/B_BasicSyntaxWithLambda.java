package java8.lambdas;

/**
 *  If an interface need multiple lines to implement then we have to use { } after ->
 *  
 *  return is mandatory in multiline case
 *  
 */
public class B_BasicSyntaxWithLambda {

	public static void main(String[] args) {
		// return stmt is required if method has some return value
		CloudyLambda obj = (int i) -> {
			int sum = i + 20;
			return sum;
		};

		System.out.println("Sum: " + obj.multiline(20));



		// in case of single line no return required
		CloudyLambda obj2 = (int i) -> i*5;
		System.out.print("Multi: "+obj2.multiline(10));



	}
}

interface CloudyLambda {
	int multiline(int i);
}
