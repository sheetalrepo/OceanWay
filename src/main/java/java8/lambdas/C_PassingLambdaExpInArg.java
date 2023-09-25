package java8.lambdas;

/**
 * We can pass interface implementation(lambda expression) as an argument
 */
public class C_PassingLambdaExpInArg {

	private void passMe(Expresso e) {
		int len = e.getExpressLength("Hello Lambda");
		System.out.println("Length: " + len);
	}

	public static void main(String[] args) {
		C_PassingLambdaExpInArg obj = new C_PassingLambdaExpInArg();
		
		//method 1
		Expresso e = s -> s.length();
		obj.passMe(e);

		//method 2
		obj.passMe(s -> s.length());
	}
}

@FunctionalInterface
interface Expresso {
	int getExpressLength(String s);
}