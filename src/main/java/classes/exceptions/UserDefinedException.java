package classes.exceptions;



public class UserDefinedException {

	//use default constructor exception
	public void mango(String colour) throws MyOwnException  {
		if(!colour.equalsIgnoreCase("yellow")){
			throw new MyOwnException(); 
		}else{
			System.out.println("mango has rippened with colour: "+ colour);
		}
	}

	//use single param constructor exception	
	public void apple(int price) throws MyOwnException  {
		if(price < 0){
			throw new MyOwnException(price); 
		}else{
			System.out.println("price is: "+ price);
		}
	}
	

	public static void main(String[] args) throws MyOwnException {
		UserDefinedException obj = new UserDefinedException();
		//obj.mango("yellow");
		//obj.mango("red");
		
		//obj.apple(100);
		//obj.apple(-10);
				
	}
}

