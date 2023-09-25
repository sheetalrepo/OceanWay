package classes.general;

/*
 * method returns obj reference
 */
public class ThisExamples2 {
	
	int i = 0;
	
	/**
	 * return same object ref who access it
	 */
	public ThisExamples2 abc(){
		i++;
		return this;
	}
	

	public void print(){
		System.out.println(i);  // 4
	}
	
	
	
	public static void main(String[] args) {
		ThisExamples2 obj = new ThisExamples2();
		obj.abc().abc().abc().abc();   // obj can call multiple time same method only if method return obj reference
		obj.print();  // cannot be accessed in same way as above
	}
}
