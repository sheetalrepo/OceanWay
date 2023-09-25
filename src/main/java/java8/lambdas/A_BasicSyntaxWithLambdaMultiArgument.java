package java8.lambdas;

/**
 * - lambda argument should always match interface method signature lambda 
 * - can only work with functional interface because if we have two method inside
 * 	 interface with same arg then lambda will get confused
 */
public class A_BasicSyntaxWithLambdaMultiArgument {

	public static void main(String[] args) {
		Addable add = (int a, int b) -> a + b;
		System.out.println("Sum: " + add.getAddition(50, 100));
	}
}

interface Addable {
	int getAddition(int a, int b);
}
