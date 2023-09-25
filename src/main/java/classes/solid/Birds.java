package classes.solid;

/**
 * Bad design : Breaks Liskov principle
 * 
 * Subtype Ostric cant replace Birds as it cant fly
 * @author Sheetal_Singh
 */
class Birds {
	public void fly() {
	}

	public void eat() {
	}
}

class Crow extends Birds {
}

class Ostrich extends Birds {
	public void fly(){
	    throw new UnsupportedOperationException();
	  }
}
