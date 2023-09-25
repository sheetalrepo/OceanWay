package collections.generics;

public class B_GenericMethod {
	
	//Generic method
	public static <T>boolean isEqualTest(A_GenericsType<T> obj1, A_GenericsType<T> obj2) {
		return obj1.getT().equals(obj2.getT());
	}
	
	
	public static void main(String[] args) {
		A_GenericsType<String> obj1 = new A_GenericsType<String>();
		obj1.setT("malaga");
		
		A_GenericsType<String> obj2 = new A_GenericsType<String>();
		obj2.setT("malaga");

		boolean bool = B_GenericMethod.isEqualTest(obj1, obj2);
		System.out.println(bool);
		
		
		//Set 2: With Integer
		A_GenericsType<Integer> obj3 = new A_GenericsType<Integer>();
		obj3.setT(10);
		
		A_GenericsType<Integer> obj4 = new A_GenericsType<Integer>();
		obj4.setT(10);

		boolean bool2 = B_GenericMethod.isEqualTest(obj3, obj4);
		System.out.println(bool2);

		
	}

}
