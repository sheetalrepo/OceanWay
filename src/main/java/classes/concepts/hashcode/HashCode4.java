package classes.concepts.hashcode;

import java.util.*; 

class Geek{ 
	String name; 
	int id; 
 
	Geek(String name, int id){	 
     	this.name = name; 
     	this.id = id; 
	} 
 
	@Override
	public boolean equals(Object obj){ 
		System.out.println("Inside Equals ======");
     	// if both the object references are referring to the same object. 
		if(this == obj) 
			return true; 
     
		if(obj == null || obj.getClass()!= this.getClass()) 
			return false; 
     
		Geek geek = (Geek) obj; 
		return (geek.name.equals(this.name)  && geek.id == this.id); 
	} 
 
	@Override
	public int hashCode(){ 
		System.out.println("Inside HashCode #####");
		return 10;
	} 
} 


public class HashCode4{ 	
	
	/**
	 * In this case a LinkedList will be created internally at bucket id 10 i.e. hashcode
	 * LL format:     |g1|CSE|->| ---  |g2|IT|->|   
	 */
	public static void test1(){
		Geek g1 = new Geek("aditya", 1); 
		Geek g2 = new Geek("aditya", 2); 
	 
		System.out.println("Obj initialized");
		
		Map<Geek, String> map = new HashMap<Geek, String>(); 
		map.put(g1, "CSE");   // HC method will be called to find the first bucket id i.e. 10
		map.put(g2, "IT");     // HC method will be called; as HC is same here (10), hence equals called to chk equality
		
		//In abv stmt equals failed because we are checking 'name and id' both in equals and id is diff for both obj
		System.out.println("\nMap Size:"+map.size());  //2
		
		System.out.println("\nFor loop abt to start...");
		
		for(Geek key : map.keySet()) 
			System.out.println("for loop: "+map.get(key).toString());
	}
	
	
	
	
	/**
	 * In this case when map.put(g2,"IT") get called then
	 * g2 hashcode() will be called, it will return 10 i.e. same as g1, then
	 * g1.equals(g2) i.e. oldkey.equals(newkey) will be called internally which will return true and g2 will replace g1
	 */
	public static void test2(){
		Geek g1 = new Geek("aditya", 1); 
		Geek g2 = new Geek("aditya", 1); 
	 
		Map<Geek, String> map = new HashMap<Geek, String>(); 
		map.put(g1, "CSE");   // HC called and it will return 10
		map.put(g2, "IT");    // HC called and it will return 10 + equals will be called as this is second time + equals return true
	 
		//In abv stmt equals return true because 'name and id' are both same and both key will be treated as same
		System.out.println("\nMap Size:"+map.size()); // 1 , second val will override first
		
		System.out.println("\nFor loop abt to start...");
		
		for(Geek key : map.keySet()) 
			System.out.println("for loop: "+map.get(key).toString());
	}
	
	public static void main(String[] args){ 
    	test1();
    	System.out.println("\n\n***********************************************\n\n");
    	test2();
 
	} 
} 
