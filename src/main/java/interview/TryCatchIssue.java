package interview;

import java.io.FileNotFoundException;

public class TryCatchIssue {

	public void bug() throws FileNotFoundException  {
		System.out.println("Bug Start");
		throw new FileNotFoundException();
	}
	
	
	public void testFinally() {

		try{
			System.out.println("Try..");
			//int n = 100/0;
			bug();
		}catch(Exception e){
			System.out.println("Catch");
		}finally {
			System.out.println("Finally");
			try {
				bug();
			} catch (FileNotFoundException e) {
				
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		TryCatchIssue obj = new TryCatchIssue();
		obj.testFinally();
	}
}
