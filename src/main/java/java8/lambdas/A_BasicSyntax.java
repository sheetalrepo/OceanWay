package java8.lambdas;

/**
 *  lambda work with functional interface i.e. interface with one method
 *  
 */


//interface
interface Greeting {
	int getLength(String s);
}


//standard class implementing interface
class Greet implements Greeting {

	@Override
	public int getLength(String s) {
		return s.length();
	}

}


//Test Class using interface
public class A_BasicSyntax {

	public static void main(String[] args) {
		Greet g = new Greet();
		System.out.println("Length: "+g.getLength("Hello Lamdas"));
    }

}



