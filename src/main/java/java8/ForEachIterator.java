package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * ForEach using Anonymous class
 */
public class ForEachIterator {

    //java 7 and below
    public void normalIterator(){
        //Create a list
        List<Integer> ls = new ArrayList<>();
        for(int i = 1; i <=10; i++){
            ls.add(i);
        }

        //Iterating on list using Iterator
        Iterator<Integer> itr = ls.iterator();
        while(itr.hasNext()){
            int i = itr.next();
            System.out.println(i);
        }
    }

    //java 8
    public void forEachAnonymousStyle(){
        //Create a list
        List<Integer> ls = new ArrayList<>();
        for(int i = 1; i <=10; i++){
            ls.add(i);
        }


        //Iterating on list using Java 8
        ls.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
    }


    public static void main(String [] args){
        ForEachIterator obj = new ForEachIterator();
        obj.normalIterator();
        obj.forEachAnonymousStyle();
    }
}




