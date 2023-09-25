package collections.generics;

/**
 * Generic Inheritance is not same as normal inheritance
 * Apple<String> is not child of Apple<Object> class.
 * Both above class are child of 'Object' class
 * 
 * @author Sheetal_Singh
 */
public class D_GenericInheritance {

	//"extends Object" 
	public static class MyClass<T> {
		//generic class
	}

	public static void main(String[] args) {
		String str = "abc";
		Object obj = new Object();
		obj = str; // works because String is-a Object, inheritance in java

		MyClass<String> myClass1 = new MyClass<String>();
		MyClass<Object> myClass2 = new MyClass<Object>();
		//myClass2= myClass1; //compilation error since MyClass<String> is not a MyClass<Object>
		obj = myClass1; // MyClass<T> parent is Object
	}

}
