package classes.controlstmt;

public class IfElse {

	/*
	 * Only one sys out will get print
	 * else if will not get executed even it pass criteria
	 */
	public void testElseIf(){
		String abc = "Apple";
		
		if(abc.startsWith("A"))
			System.out.println("Starts with A");
		else if(abc.endsWith("e"))
			System.out.println("Ends with e");
		else{
			System.out.println("Last loop");
		}
	}
	
	
	public static void main(String[] args) {
		IfElse obj = new IfElse();
		obj.testElseIf();
		
	}

}
