package classes.general;

/**
 *  Var arg can also be used as optional trailing arguments
 *
 */
public class VarArgs2 {
	
	
	public void print(int a, String ... args){
		System.out.print(a+" ");
		
		for(String s: args){
			System.out.print(s+" ");
		}
		
		System.out.println("");
	}
	
	
	public static void main(String [] args){
		
		VarArgs2 obj = new VarArgs2();
		obj.print(10, "opt1");
		obj.print(20, "opt1","opt2");
		obj.print(30);
		
	}
}


//10 opt1 
//20 opt1 opt2 
//30 
