package collections;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Hashtable - unique key, no null key or value allowed, synchronized
 * It implements Map interface + extends Dictionary class , unsorted + unordered
 * All Maps e.g. Hashtable, HashMap etc are not collections as they don't implement collection interface, hence standard
 * iterate process like iterate, adv for loop, listIterate can't be used.
 * to iterate we have other options - keySet, values and entrySet
 * Dictionary > Hashtable > Properties
 */
public class HashTableExamples {

	public void hashTableBasicOperations(){
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(10, "John");
		ht.put(11, "Bob");
		ht.put(12, "Dow");
		ht.put(13, "Mike");
		ht.put(14, "Jack"); // old duplicate value will be removed
		ht.put(14, "JackNew");
//		ht.put(15, null);  compiler error
//		ht.put(null, "Joe");  compiler error
		
		System.out.println(ht.size());  //5
		System.out.println("Val of key 12: "+ht.get(12));  //Val of key 12: Dow
		System.out.println(ht.containsKey(14));  // true
		System.out.println(ht.containsValue("Jack")); //true
		System.out.println(ht.contains("Jack")); // true  | same as above but expensive to use
		ht.remove(13);
		System.out.println(ht.size());  //4
		System.out.println(ht.isEmpty()); // false
		System.out.println(ht);  // {10=John, 14=JackNew, 12=Dow, 11=Bob}  | unsorted, unordered
//		ht.clear(); // remove all key value in hashtable
	}
	
	public void howToIterate(){
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1, "Jan");
		ht.put(2, "Feb");
		ht.put(3, "Mar");
		ht.put(4, "Apr");
		ht.put(5, "May");
		
				
		//Method 1: Using keySet() : iterating on keys  - best to use this
		Set<Integer> set=ht.keySet();
		for(Integer key:set){
			System.out.print(key+":"+ht.get(key)+" , ");//5:May , 4:Apr , 3:Mar , 2:Feb , 1:Jan ,
		}
		System.out.println("");

		
		//Method 2: Using values(): iterating on values
		Collection<String> c=ht.values();
		for(String str:c){
			System.out.print(str+ " -- " ); // May -- Apr -- Mar -- Feb -- Jan --
		}
		System.out.println("");
		
		
		//Method 3: Using enumuration
		Enumeration<Integer> element=ht.keys();
		while(element.hasMoreElements()){
			Integer key=element.nextElement();
			System.out.print(key+":"+ht.get(key)+" , ");//5:May , 4:Apr , 3:Mar , 2:Feb , 1:Jan ,
		}
		System.out.println("");

		
		//Method 4: Using Map.Entry
		Set<Entry<Integer,String>> entrySet=ht.entrySet();
		for(Map.Entry<Integer,String> me:entrySet){  
			System.out.print(me.getKey()+":"+me.getValue()+" , ");//5:May , 4:Apr , 3:Mar , 2:Feb , 1:Jan , 
		}  
		
		//Or use this simple format
		System.out.println("");
		for(Map.Entry<Integer,String> me:ht.entrySet()){
			System.out.print(me.getKey()+":"+me.getValue()+"  "); //5:May  4:Apr  3:Mar  2:Feb  1:Jan 
		}
	}
	
	
	public void copyHashMapIntoHashtable(){
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("1", "A");
		ht.put("2", "B");
		ht.put("3", "C");
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("10","Ten");
		hm.put("20","Twenty");
		
		ht.putAll(hm);
		System.out.println("");
		Set<String> set=ht.keySet();
		for(String key:set){
			System.out.print(key+":"+ht.get(key)+"  ");  //3:C  2:B  10:Ten  1:A  20:Twenty 
		}
	}
	
	
	public static void main(String [] args){
		HashTableExamples obj=new HashTableExamples();
		obj.hashTableBasicOperations();
		obj.howToIterate();
		obj.copyHashMapIntoHashtable();
	}
}
