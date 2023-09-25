package classes.initialization;

public class Constructor2 {

	int x, y;

	// setter initializing variable, can be replaced by constructor
	public void set(int m, int n) {
		x = m;
		y = n;
	}

	public int add() {
		return x + y;
	}

	public static void main(String[] args) {
		Constructor2 obj = new Constructor2(); // obj is useless as of now
		obj.set(10, 20); // obj now become functional
		System.out.println("Sum is: " + obj.add()); // Sum is: 30

		obj.set(100, 200);
		System.out.println("Sum is: " + obj.add()); // Sum is: 300
	}
}

/*
Here unnecessary we have to call setter and then initialize class variable
and then object become use-full
*/