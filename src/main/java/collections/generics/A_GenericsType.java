package collections.generics;

/**
 * Generic Type can be defined at class level
 * 
 * From main we can create any type of object
 * @author Sheetal_Singh
 */
public class A_GenericsType<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		//good use of generics
		A_GenericsType<String> objStr = new A_GenericsType<String>();
		objStr.setT("hello");
		System.out.println(objStr.getT());
		
		
		//bad use of generics
		@SuppressWarnings("rawtypes")
		A_GenericsType obj = new A_GenericsType();
		obj.setT("abc");
		obj.setT(10);
		System.out.println(obj.getT());
	}

}
