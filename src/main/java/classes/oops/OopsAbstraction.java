package classes.oops;


/**
 * Oops principle : Abstraction don't confuse it with Abstract class
 * 
 * Abstraction can be achieved by using
 * - abstract classes, interfaces and compositions (HAS-A relationship)
 * - API are best eg of abstraction where internal details has been hided 
 * - Car internal details has been abstracted and we can use it using steering, brakes, gear etc
 * 
 * todo: explain all this with examples
 * imp interview questions:
 * 1. Abstract class may or may not have abstract method as both are different concept
 * 2. Abstract class means it cannot be instantiated, thats it
 * 3. Abstract method means it will be defined in subclass
 * 4. Abstract class can have main method and can instantiate other classes
 * 5. Abstract class can have constructor https://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor
 */

abstract class VehicleAbstract {
	public abstract void start();

	public void stop() {
		System.out.println("Stopping Vehicle in abstract class");
	}
	
	public VehicleAbstract() {
		//i am a constructor
	}
}

class TwoWheeler extends VehicleAbstract {
	@Override
	public void start() {
		System.out.println("Starting Two Wheeler");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Two Wheeler");
	}

}

class FourWheeler extends VehicleAbstract {
	@Override
	public void start() {
		System.out.println("Starting Four Wheeler");
	}
}

public class OopsAbstraction {
	public static void main(String[] args) {
		VehicleAbstract my2Wheeler = new TwoWheeler();
		VehicleAbstract my4Wheeler = new FourWheeler();
		my2Wheeler.start();	//Starting Two Wheeler
		my2Wheeler.stop();	//Stopping Two Wheeler
		
		my4Wheeler.start();	//Starting Four Wheeler
		my4Wheeler.stop();	//Stopping Vehicle in abstract class
	}
}

