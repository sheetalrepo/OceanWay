package classes.general;

/*
 * 'this' keyword always represent the current object accessing it. 
 * if arg/local variable is same as instance variable then 'this' needs to be used
 * static methods cannot use this as static method belong to class not objects/instances
 */
public class ThisExamples {
	int x, y; //instance variables

	public ThisExamples(int x, int yval) {
		this.x = x;  // to differentiate between instance var and arg variable 'this' is used
		y = yval;	 // arg and instance var are diff hence no need to use 'this' here
	}

	/**
	 * if 'this' is not used in constructor then x will be set to default int value i.e. 0
	 * and sum will be 50 rather 60
	 */
	public int add() {
		System.out.println(x+" ---- "+y);
		return x + y;
	}

	public static void main(String[] args) {
		ThisExamples obj1 = new ThisExamples(10, 50);
		System.out.println("Sum is: " + obj1.add()); // Sum is: 60

		
	}
}

