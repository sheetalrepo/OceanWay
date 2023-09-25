package classes.initialization;

/*
 * static block execute once when class loads i.e. before any block and constructor
 * normal block executes when any obj get created before constructor
 */
public class InitBlock {
	//once
	static {
		System.out.println("Static Block");
	}

	
	//multiple times
	{
		System.out.println("Normal Block");
	}

	//multiple times	
	public InitBlock() {
		System.out.println("Default Constructor");
	}
	

	public static void main(String[] args) {
		InitBlock obj1 = new InitBlock();
		InitBlock obj2 = new InitBlock();
	}

}

/*
Static Block

Normal Block
Default Constructor

Normal Block
Default Constructor
*/