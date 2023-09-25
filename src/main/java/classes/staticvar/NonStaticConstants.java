package classes.staticvar;

/**
 * Final method cannot be overridden in subclass
 * Final class cannot be extended

 * Constant never get a default value (be an instance or static constant)
 * Constant cannot be used before initialization (be an instance or static constant) 
 * Either initialized at declaration time or in constructor
 */


class Animal{

	final void fix(){
		System.out.println("Dont try to override me");
	}
}

final class Cannine extends Animal{
	
	//@Override
	//void fix(){}
	
}

//class Dog extends Cannine{
//  cannot extends final class
//}


public class NonStaticConstants {

	// public final int JAN;
	public final int FEB = 2;
	public final int FIN;

	public NonStaticConstants() {
		// System.out.println(FIN);
		FIN = 100;
	}

	// final argument cannot be changed
	public void arg(final int X) {
		// X = 20; //cant change value
	}

	//final local variable cannot be changed
	public void local() {
		final int Y = 60;
		//Y = 70;
	}

	public static void main(String[] args) {
		NonStaticConstants obj = new NonStaticConstants();
		obj.arg(10);
	}
}
