package classes.generics;

class GenericTestClass<T> {
	T obj;

	GenericTestClass(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}
}


class GenericsClasses {
	public static void main(String[] args) {
		// instance of Integer type
		GenericTestClass<Integer> iObj = new GenericTestClass<Integer>(10);
		System.out.println(iObj.getObject());

		// instance of String type
		GenericTestClass<String> sObj = new GenericTestClass<String>("Hello Generics");
		System.out.println(sObj.getObject());
	}
}