package classes.general;

public class VarArgs1 {

	
	public void pick(Object... args ){
		for(Object o: args){
			System.out.print(o+", ");
		}
		System.out.println("");
	}
	
	
	public static void main(String [] args){
		VarArgs1 obj = new VarArgs1();
		
		//can take java 5 style individuals also
		obj.pick(10, 14.2, 20.10);
		obj.pick(10, 14.2, 20.10,"str", new Integer(10));
		
		//can take pre Java 5 style arrays
		obj.pick((Object [])new Integer[]{1,2,3,4,5});
		
		
		//empty list can be send
		obj.pick();   // nothing will print
	}
}



//10, 14.2, 20.1, 
//10, 14.2, 20.1, str, 10, 
//1, 2, 3, 4, 5, 

