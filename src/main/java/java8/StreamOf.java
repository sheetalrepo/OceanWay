package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;import org.apache.poi.util.SystemOutLogger;


/**
 * Stream.of method can be used without creating any Collection 
 * classes like List, Set etc
 * 
 * https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 * 
 * @author Sheetal_Singh
 *
 */
public class StreamOf {

    public void printMe(){
    	Stream.of("one","two","three")
    	.forEach(x -> System.out.println(x));
    }

    public void filterMe(){
    	Stream.of("one","two","three")
    	.filter(x -> x.length() > 3)
    	.forEach(x -> System.out.println(x));
    }

    public void sortMe(){
    	Stream.of("cat","dog","apple","zebra")
    	//.filter(x -> x.length() > 3)
    	.sorted()
    	.forEach(x -> System.out.println(x));
    }

    public void compareMultipleStrings(){
    	String a = "apple";
    	String b = "Apple";
    	String c = "APPLE";
    	
    	boolean flag = Stream.of(a, b, c)
    				.allMatch("apple" :: equalsIgnoreCase);
    	System.out.print("All string matching : "+flag);
    }
    
    public static void main(String [] args){
         StreamOf obj = new StreamOf();
         //obj.printMe();
         //obj.filterMe();
         obj.sortMe();
         
    }
}
