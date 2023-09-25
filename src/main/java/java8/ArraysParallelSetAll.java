package java8;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/**
 * Access in parallel
 * Fast if element is very high
 *
 */
public class ArraysParallelSetAll {
	
	
	public static void test1(){
		int [] arr = new int[10];
		Arrays.parallelSetAll(arr, (index) -> index);       //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Arrays.parallelSetAll(arr, (index) -> 2*index);     //[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		System.out.println("test1: "+Arrays.toString(arr));
	}
	
	public static void test2(){
		int [] arr = new int[10];
		
		IntUnaryOperator g = e-> 
	    { 
	        if (e % 2 == 0) 
	            return e * e; 
	        else
	            return e; 
	    }; 
	    Arrays.parallelSetAll(arr, g); 
	    
		
		System.out.println("test2: "+Arrays.toString(arr));
	}
	
	public static void test3(){
		int [] arr = new int[10];
		
		Arrays.parallelSetAll(arr, e -> {
			if (e % 2 == 0)
				return e * e;
			else
				return e;
		});
		
		//print
		System.out.println("test3: "+Arrays.toString(arr));
		Arrays.stream(arr).forEach(e->System.out.print(e + ", ")); 
	}
	
    
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

}
