package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * This way we can reuse code as well
 */
class MyForEach implements Consumer<Integer>{

    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}



public class ForEachIteratorUsingInterface {

    //java 8
    public void forEachIterator(){
        //Create a list
        List<Integer> ls = new ArrayList<>();
        for(int i = 1; i <=10; i++){
            ls.add(i);
        }


        //Iterating on list using Java 8
        MyForEach myobj = new MyForEach();
        ls.forEach(myobj);

    }


    public static void main(String [] args){
        ForEachIteratorUsingInterface obj = new ForEachIteratorUsingInterface();
        obj.forEachIterator();
    }
}








