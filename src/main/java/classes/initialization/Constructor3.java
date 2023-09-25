package classes.initialization;

public class Constructor3 {
	int x, y;

	public Constructor3(int m, int n) {
		x = m;
		y = n;
	}

	public int add() {
		return x + y;
	}

	public static void main(String[] args) {
		Constructor3 obj1 = new Constructor3(10, 20);
		Constructor3 obj2 = new Constructor3(100, 200);

		System.out.println("Sum is: " + obj1.add()); // Sum is: 30
		System.out.println("Sum is: " + obj2.add()); // Sum is: 300
	}
}

/*
-constructor used to initialize class variables, so that object become use-full as soon as they get created
-PlainClassWithConst obj1: initially obj1 set to null
-new PlainClassWithConst(10, 20) : allocate physical memory to object on the Heap
-PlainClassWithConst obj1 = new PlainClassWithConst(10, 20) : now obj1 reference variable actually refer to  WithConst class object on the Heap
-obj1 simply contains memory locations e.g. h#@12det
-obj1 and obj2: will have separate copy of class member variables or instance variable x, y
-static x,y: in this case both object will share common copy of class member variables
-instance is same as object and can be used interchangeably
-instance variable = class variable = object variable : same meaning
*/