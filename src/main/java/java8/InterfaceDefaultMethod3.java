package java8;

/**
 * Prob: What happen if I1, I2 and parent class have same method
 * Sol: In case two interface I1, I2 and parent have same method name
 *    then child don't need to define own method (like we done in previous case). 
 *    By default parent method will be called 
 *    as class has higher priority over interfaces  
 */

interface one{
    default void duke(){
        System.out.println("One");
    }
}

interface two{
    default void duke(){
        System.out.println("Two");
    }
}

class Three{
	 public void duke(){
        System.out.println("Three");
    }
}

public class InterfaceDefaultMethod3 extends Three implements one, two{

    public static void main(String [] args){
        InterfaceDefaultMethod3 obj = new InterfaceDefaultMethod3();
        obj.duke();
    }

}
