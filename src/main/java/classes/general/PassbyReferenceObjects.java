package classes.general;

/*
 * Whenever we pass an object i.e. we are passing simply reference(memory location address) 
 * of an actual physical object on the heap. Any change will directly impact actual object on heap
 * hence all object pass are pass by reference
 * 
 * https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
 */
class Modify {
	int a, b;
	Modify(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void change(Modify obj) {
		obj.a = 100;
		obj.b = 200;
	}
}

public class PassbyReferenceObjects {
	public static void main(String[] args) {
		Modify obj = new Modify(10, 20);
		System.out.println("Initial values: " + obj.a + ", " + obj.b); 
		obj.change(obj); // passing reference
		System.out.println("After values: " + obj.a + ", " + obj.b); 	
	}
}

//Initial values: 10, 20
//After values: 100, 200