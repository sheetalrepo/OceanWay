package java8;

/**
 * 
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
