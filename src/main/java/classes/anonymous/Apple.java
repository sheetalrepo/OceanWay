package classes.anonymous;

/**
 * Other class to access inner class of NonStaticInnerClass.java
 * 
 */

public class Apple {
	
	public static void main(String [] args){
		
		//create outer class object
		OuterClass1 obj = new OuterClass1();
		
		//create inner class object 
		OuterClass1.InnerClass1 innerObj = obj.new InnerClass1();
		
		//access inner class members
		innerObj.abc();  // I can access outer class easily: 10
		
	}
	
}
