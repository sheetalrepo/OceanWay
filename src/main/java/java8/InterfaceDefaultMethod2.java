package java8;

/**
 * Prob: What happen if I1, I2 interfaces have same method
 * 1. If two interfaces have same defined method then
 *    implementing class has to override method and give its own definition
 *    
 */

interface mango{
    default void commonName(){
        System.out.println("Mango Method");
    }
}

interface orange{
    default void commonName(){
        System.out.println("Orange Method");
    }
}


public class InterfaceDefaultMethod2 implements mango, orange{


    @Override
    public void commonName() {
        System.out.println("New Mix Fruit Method");
    }

    public static void main(String [] args){
        InterfaceDefaultMethod2 obj = new InterfaceDefaultMethod2();
        obj.commonName();
    }

}
