package interview;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurences {
		
	/*
	 * find sum of all the numbers which comes before first occurrence of x and after last occurrence of x 
	 * [10, 20, 50, 20, 20, 30, 80] and if x= 20 then sum of [10,30,80]
	 */
	public static void firstFirstAndLastOccurences(){
		
		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(20);//1
		ls.add(50);
		ls.add(20);
		ls.add(20);//4
		ls.add(30);
		ls.add(50);
		
		System.out.println(ls); //[10, 20, 50, 20, 20, 30, 80]
		System.out.println("Inpute number is:"+ 20);
		int first = ls.indexOf(20);
		System.out.println("First Occurrences Index: "+first);
		
		int last = ls.lastIndexOf(20);
		System.out.println("Last Occurrences Index: "+last);
		int sum = 0;
		for(int i=0; i < ls.size();i++){
			
			if(i<first)
				sum=sum+ ls.get(i);
			
			if(i>last)
				sum=sum+ ls.get(i);
		}
		System.out.println("Sum is: "+sum);
	}
	
	
	public static void main(String[] args) {
		firstFirstAndLastOccurences();
	}

}
