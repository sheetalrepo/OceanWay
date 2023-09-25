package java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import org.jetbrains.annotations.NotNull;

public class VarKeyword {

	/**
	 * var can automatically infer from RHS
	 */
	public static void varMethod() {
		var list = new ArrayList<String>();
		System.out.println("===== * ===== * =====");
	}
	
	public static void java8Method() {
		List<String> list = Arrays.asList("a", "b", "c");
		
		String result = list.stream()
				   		.map(x -> x.toUpperCase())
				   		.collect(Collectors.joining(","));
		System.out.println(result);
		System.out.println("===== * ===== * =====");
	}
	
	public static void java11Method() {
		List<String> list = Arrays.asList("a", "b", "c");
		
		String result = list.stream()
				   		.map((var x) -> x.toUpperCase())
				   		.collect(Collectors.joining(","));
		System.out.println(result);
		System.out.println("===== * ===== * =====");
	}
	
	public static void main(String[] args) {
		varMethod();
		java8Method();
		java11Method();
	}

}
