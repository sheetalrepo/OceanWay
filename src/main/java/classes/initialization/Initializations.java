package classes.initialization;

/**
 * Class Members get initialized(priority) before(over) Constructor
 * No matter where they are declared
 */

class Ora{

	//constructor
	Ora (int a){
		System.out.println("I am ora no: "+a);
	}
}



public class Initializations {
	//Class Member 1
	Ora a = new Ora(1);
	
	//Constructor
	public Initializations(){
		System.out.println("Default Constuctor");
		System.out.println(t);
	}
	
	//Class Member 2; declared after constructor
	int t = 10;
	Ora b = new Ora(2);
	
	public static void main(String [] args){
		new Initializations();
	}
	
}

/*

I am ora no: 1
I am ora no: 2
Default Constuctor
10

*/
