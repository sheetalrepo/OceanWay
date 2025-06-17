package c_java8;


/**
 * Static Concrete Method: 
 *      1. Can be called with Interface name only
 *      2. Cannot be overridden by Class
 *      
 * Introduce to avoid poor implementation of following classes     
 */

interface statically{

    void normalAbsMethod(); //public

    static void staticMethodWithBody(){
        System.out.println("This is new method introduced in Java");
    }
}


public class InterfaceStaticMethod implements statically{

	@Override
	public void normalAbsMethod() {
		System.out.println("I am normal old java method");
	}

	
    public static void main(String [] args){
        InterfaceStaticMethod obj = new InterfaceStaticMethod();
        obj.normalAbsMethod();
        
        //calling statically
        statically.staticMethodWithBody();
    }


}
