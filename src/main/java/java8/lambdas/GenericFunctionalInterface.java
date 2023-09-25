package java8.lambdas;

// https://medium.freecodecamp.org/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc

interface MyGeneric<T> {
	T compute(T t);
}

public class GenericFunctionalInterface {

	
	
	public static void main(String args[]) {

		// String version of MyGenericInteface
		MyGeneric<String> reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Integer version of MyGeneric
		MyGeneric<Integer> factorial = (Integer n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++)
				result = i * result;

			return result;
		};

		
		
		System.out.println(reverse.compute("Hello Lambada"));
		System.out.println(factorial.compute(5));
	}
}