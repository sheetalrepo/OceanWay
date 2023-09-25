package java8.lambdas;


/**
 * If we have a functional interface then we can directly implement and use it
 * Using lambdas we can directly use an interface w/o implementing it
 * If functional interface method require only one parameter then we can use following 3 styles also
 * If method don't have any argument then we can use :    Type obj = () -> implementation;
 * imp: lambda expression syntax should match with functional interface method
 */
public class A_BasicSyntaxWithLambda {

	public static void main(String[] args) {
		GreetingNew lam1 = (String s) -> s.length();
		GreetingNew lam2 = (s) -> s.length();
		GreetingNew lam3 = s -> s.length();

		System.out.println(">> " + lam1.toString());
		System.out.println("Length: " + lam1.getLength("Hello Lamdas"));
		System.out.println("Length: " + lam2.getLength("Hello Lamdas"));
		System.out.println("Length: " + lam3.getLength("Hello Lamdas"));
	}
}


interface GreetingNew {
	int getLength(String s);
}
