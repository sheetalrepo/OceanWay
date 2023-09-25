package java8.lambdas.methodref;

import java.util.Arrays;
import java.util.List;

public class MethodRef1 {

	public static void basicLambadaMethod() {
		List<String> list = Arrays.asList("A","B","C","D","E");
		list.forEach(s -> System.out.print(s));
	}
	
	public static void basicMethodReference() {
		List<String> list = Arrays.asList("A","B","C","D","E");
		list.forEach(System.out::print);
	}
	
	
	public static void main(String[] args) {
		basicLambadaMethod();
		System.out.println("");
		basicMethodReference();
	}


}
