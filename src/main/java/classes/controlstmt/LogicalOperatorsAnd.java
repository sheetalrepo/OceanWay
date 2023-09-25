package classes.controlstmt;

public class LogicalOperatorsAnd {

	//Both should be true to go inside IF loop
	//Both condition will be evaluated even if First cond is False
	public void simpleSingleAnd(){
		
		boolean a = true;
		boolean b = false;
		
		if(a & b){
			System.out.println("Hello");
		}else{
			System.out.println("Else");
		}
		
	}

	
	
	//Both should be true to go inside IF loop
	//Second condition will only evaluate if first is True
	//If first condition is False then second will not be evaluated which saves time and NPE
	public void simpleDoubleAnd(){
		
		boolean a = false;
		boolean b = false;
		
		if(a && b){
			System.out.println("Hello");
		}else{
			System.out.println("Else");
		}
		
	}
	
	
	
	//Will get NPE in single & case
	public void exceptionInSingleAnd(){
		
		String str = null;
		
		if(str!=null & str.length()> 0){
			System.out.println("Bad If Implementation");
		}else{
			System.out.println("Bad Else Implementation");
		}
		
	}

	
	
	//Will not get NPE in && case as str.length() never evaluated
	public void noExceptionInDoubleAnd(){
			
		String str = null;
			
		if(str!=null && str.length()> 0){
			System.out.println("Bad If Implementation");
		}else{
			System.out.println("Bad Else Implementation");
		}
			
	}
	
	
	public static void main(String [] args){
		LogicalOperatorsAnd obj = new LogicalOperatorsAnd();
		//obj.simpleSingleAnd();
		//obj.simpleDoubleAnd();
		
		//obj.exceptionInSingleAnd();
		obj.noExceptionInDoubleAnd();
	}

}
