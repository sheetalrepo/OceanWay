package java8;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/**
 * Access in sequence
 * Fast if element is low
 * Result of both setAll and parallelSetAll will be same
 *
 */
public class ArraysSetAll {

	
	public static void test1(){
		int [] arr = new int[10];
		Arrays.setAll(arr, (index) -> index);       //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Arrays.setAll(arr, (index) -> 2*index);     //[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		System.out.println("test1: "+Arrays.toString(arr));
	}
	
	public static void test1A(){
		int [] arr = {5,10,15,20,25,30};
		
		Arrays.setAll(arr, (i) -> arr[i]);       //test1A: [5, 10, 15, 20, 25, 30]
		System.out.println("test1A: "+Arrays.toString(arr));
		
		Arrays.setAll(arr, (i) -> arr[i]*arr[i]);     //test1A: [25, 100, 225, 400, 625, 900]
		System.out.println("test1A: "+Arrays.toString(arr));
	}
	
	public static void test2(){
		int [] arr = {5,10,15,20,25,30};
		
		IntUnaryOperator g = i -> 
	    { 
	        if (arr[i] % 2 == 0) 
	            return arr[i] * arr[i]; 
	        else
	            return arr[i]; 
	    }; 
	    Arrays.setAll(arr, g); 
	    
		
		System.out.println("test2: "+Arrays.toString(arr));
	}
	
	public static void test3(){
		int [] arr = new int[10];
		
		Arrays.setAll(arr, e -> {
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
		//test1();
		test1A();
		//test2();
		//test3();
	}

}
