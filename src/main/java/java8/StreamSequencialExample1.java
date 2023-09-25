package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSequencialExample1 {

    public void filteringNumbers(){

        //Creating a list
        List<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i <= 100; i++ )
            ls.add(i);


        //Getting stream
        Stream<Integer> seqSt = ls.stream();

        //Filtering list 91 and above
        Stream<Integer> highNumberStream = seqSt.filter(a -> a > 90);
        highNumberStream.forEach(a -> System.out.println("Only high number filtered: "+ a));
    }



    public static void main(String [] args){
         StreamSequencialExample1 obj = new StreamSequencialExample1();
         obj.filteringNumbers();

    }
}
