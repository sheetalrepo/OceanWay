package b_collections.a_basics;

import java.util.*;
import java.util.Map.Entry;

/**
 * HashMap - unique key only, one null key allowed, multiple null value allowed, unsorted + unordered
 */
public class HashMapIteration1 {

	public void iterateOnEntries(){
		Map<String, String> hm = new HashMap<>();
		hm.put("A", "Apple");
		hm.put("B", "Ball");
		hm.put("C", "Cat");
		
		for(Map.Entry<String,String> entry:hm.entrySet()){
			System.out.print(entry.getKey()+":"+entry.getValue()+"  "); 
		}

		System.out.println("\n=========================================");
	}
	
	public void iterateOnKeysSet(){
		Map<String, String> hm = new HashMap<>();
		hm.put("A", "Apple");
		hm.put("B", "Ball");
		hm.put("C", "Cat");

		for(String key:hm.keySet()){
			System.out.print(key+":"+hm.get(key)+"  ");
		}
		System.out.println("\n=========================================");
	}

	public void iterateOnValues(){
		Map<String, String> hm = new HashMap<>();
		hm.put("A", "Apple");
		hm.put("B", "Ball");
		hm.put("C", "Cat");
		
		for (String value : hm.values()) {
			System.out.println(value);
		}
		System.out.println("\n=========================================");
	}
   
   
   public static void main(String [] args){
      HashMapIteration1 obj=new HashMapIteration1();
	  obj.iterateOnEntries();
	  obj.iterateOnKeysSet();
	  obj.iterateOnValues();
   }
	

}