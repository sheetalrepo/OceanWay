package classes.oops;
/*
 * oops concept: inheritance
 * 
 * Rule 1. Compiler always check Reference class type (i.e. Animal a) before calling a method; method should have visibility to reference class.
 * Rule 2.  JVM at runtime check Object (i.e. new Dog()) class to decide which method to call
 */

class Box {

	private int l, b, h;

	Box(int length, int breadth, int height) {
		l = length;
		b = breadth;
		h = height;
	}

	public int getVolume() {
		return l * b * h;
	}
}

class BoxWeight extends Box {
	int wt;

	BoxWeight(int l, int b, int h, int w) {
		super(l, b, h);
		wt = w;
	}

	public int getWeight() {
		return wt;
	}
}

public class OopsInheritance {

	public static void main(String[] args) {
		BoxWeight bw = new BoxWeight(10, 10, 10, 200);
		System.out.println("Volume is: " + bw.getVolume());  //Volume is: 1000 | no over-riding simply used super class version
		System.out.println("Weight is: " + bw.getWeight());  //Weight is: 200
		
		Box b = new BoxWeight(10, 10, 10, 10);
		//b.getWeight();    // Rule 1: It will not compile as during compile time compiler check ref class i.e. Box & Box has no idea what is getWeight()
		((BoxWeight) b).getWeight(); // Rule 2: Casting help compiler to see BoxWeight rather Box. And JVM will call child method
		
	}
}