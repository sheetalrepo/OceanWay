package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamParallelExample1 {

    public void filteringNumbersParallelly(){

        //Creating a list
        List<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i <= 100; i++ )
            ls.add(i);


        //Getting stream
        Stream<Integer> parSt = ls.parallelStream();

        //Filtering list 91 and above
        Stream<Integer> highNumberStream = parSt.filter(a -> a > 90);
        highNumberStream.forEach(a -> System.out.println("Only high number filtered: "+ a));
    }



    public static void main(String [] args){
         StreamParallelExample1 obj = new StreamParallelExample1();
         obj.filteringNumbersParallelly();
    }
}
