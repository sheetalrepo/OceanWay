package classes.anonymous;

/**
 * Using anonymous inner class we able to create interface object w/o creating a new class, implementing interface etc
 *
 *	class:  AnonymousClassForInterface.class, joggable.class, AnonymousClassForInterface$1.class
 * 	
 *  using lambda expression we can improve the performance + some clean code (less code)
 *
 */
public class WhyAnonymousForInterfaceSolution {

	
	//interface obj = new interface(){};
	public static void main(String [] args){
		joggable obj = new joggable() {
			
			@Override
			public void jog() {
				System.out.println("I am jogging");
			}
		};
		
		
		obj.jog();  // I am jogging

	}
	
}


@FunctionalInterface
interface joggable{
	void jog();
}
