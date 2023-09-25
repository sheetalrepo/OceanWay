package java8.lambdas.methodref;

/**
 * Ref: https://www.youtube.com/watch?v=svQKKg3aFzo
 *
 * Method Reference:
 *  ClassName::staticMethodName
 *  objName::normalMethodName
 */

interface Parser {
	String parseMyString(String s);
}

class MyPrinter {
	public void printMe(String str, Parser parser) {
		str = parser.parseMyString(str);
		System.out.println(str);
	}
}

class StringCaseModifierClass {
	//static method
	public static String upperCase(String str) {
		return str.toUpperCase();
	}

	//normal method
	public String lowerCase(String str){
		return str.toUpperCase();
	}

}


public class MethodRef2 {
	public static void main(String[] args) {
		//Case 1
		String a = "Abc";
		MyPrinter myPrinter1 = new MyPrinter();
		myPrinter1.printMe(a, str -> StringCaseModifierClass.upperCase(a)); // using lambadas
		myPrinter1.printMe(a, StringCaseModifierClass::upperCase); // using method ref


		//Case 2
		StringCaseModifierClass obj = new StringCaseModifierClass();

		String b = "Xyz";
		MyPrinter myPrinter2 = new MyPrinter();
		myPrinter2.printMe(b, str -> obj.lowerCase(b)); // using lambadas
		myPrinter2.printMe(b, obj::lowerCase); // using method ref
	}
}
