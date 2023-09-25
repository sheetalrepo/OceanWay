package java8;

/**
 *  #Functional interface
 *  1. Interface which contains only one abstract method
 *  2. Can have any no. of default methods
 *  3. Generally used with Lambdas expression
 *  4. @annotation compiler make sure no other abstract method added to interface
 *  
 */

@FunctionalInterface
interface runme{
    int iAmOnlyAbsMethod(int a);
    default void defaultMethod1(){ System.out.println("I am default method 1");}
    default void defaultMethod2(){System.out.println("I am default method 2");}
}

public class InterfaceFunctional{

 
    public static void main(String [] args){
    	runme obj = (int x)-> x*x;
    	
    	int a = obj.iAmOnlyAbsMethod(10);
    	int b = obj.iAmOnlyAbsMethod(20);
    	int c = obj.iAmOnlyAbsMethod(30);
    	
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	
    	
    	obj.defaultMethod1();
    	obj.defaultMethod2();
    }
}
