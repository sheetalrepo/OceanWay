package classes.anonymous;


/**
 * Any interface which has only one method is called as Functional Interface
 * 
 * interface object cannot be instantiated with "new" keyword for that we have to use
 * create a class and implement interface and only then we can create class object with interface reference
 * 
 * Here to use walk() method we have to create a new class, implements interface and then make class object 
 * All this task can be avoided using anonymous inner classes
 */



@FunctionalInterface
interface walkable{
	void walk();
}


class Walky implements walkable{
	@Override
	public void walk() {
		System.out.println("I am walking");
	}
}




public class WhyAnonymousForInterface {

	public static void main(String [] args){
		//walkable w = new walkable();  -- error
		walkable w = new Walky();
		w.walk();
	}
}

