package collections;

import java.util.*;
import java.util.Map.Entry;

/*
 * HashMap - unique key only, one null key allowed, multiple null value allowed, unsorted + unordered
 */
public class HashMapIteration {

	public void hashMapUnderstanding(){
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("1", "One");
		hm.put("2", "Two");
		hm.put("3", "Three");
		hm.put("4", null);
		hm.put("5", null);
		hm.put(null, "Small Joe");
		hm.put(null, "Big Joe");  //Small Joe will be removed as key is duplicate

		hm.remove("3");
		System.out.println(hm.containsKey("1"));     //true
		System.out.println(hm.containsValue("One")); //true

		HashMap<String,String> hm2=new HashMap<String,String>();
		hm2.put("A", "Apple");
		hm2.put("B", "Boy");

		hm.putAll(hm2);


	}



	/**
	 * If invalid key is asked to a Map then it will simply return null
	 */
	public void testInvalidKeysInHashMap(){
		Map<String,String> hm=new HashMap<String,String>();
		hm.put("1", "One");
		hm.put("2", "Two");
		hm.put("3", "Three");

		Map<Integer,String> hm2=new HashMap<Integer,String>();

		System.out.println(hm.get("4"));
		System.out.println(hm2.get(4));

		System.out.printf("Using printf formating: value is = %s", hm.get("1"));
	}





	public void impMethods(){
		Map<String,String> hm=new HashMap<String,String>();
		hm.put("1", "One");
		hm.put("2", "Two");
		hm.put("3", "Three");

		//Contains
		boolean flag1 = hm.containsKey("2");
		boolean flag2 = hm.containsValue("Two");
		System.out.printf("Contains function = %s and %s", flag1, flag2);
		System.out.println("");

		//Values
		Collection<String> list = hm.values();
		System.out.printf("Values function = %s", list);  //Values function = [One, Two, Three]
		System.out.println("");

		for(String key : list){
			System.out.println("val: "+ key);
		}


		//GetorDefault Value
		System.out.println("Get/Default: ");
		System.out.println(hm);
		String val1 = hm.getOrDefault("3","Mango");
		String val2 = hm.getOrDefault("random_key","Default Val if Key Not Found");
		System.out.println("Value1:"+ val1+ "   Value2:"+ val2);

	}




	/**
	 * Standard way to iterate HashMap
	 */
	public void iterateHashMap(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "One");
		hm.put("2", "Two");
		hm.put("3", "Three");

		//Using KeySet
		Set<String> set=hm.keySet();
		for(String key:set){
			System.out.print(key+":"+hm.get(key)+"  ");  // null:Big Joe  1:One  A:Apple  2:Two  B:Boy  4:null  5:null
		}


		//Using EntrySet type 1
		System.out.println("");
		for(Map.Entry<String,String> entry:hm.entrySet()){
			System.out.print(entry.getKey()+":"+entry.getValue()+"  "); // null:Big Joe  1:One  A:Apple  2:Two  B:Boy  4:null  5:null
		}


		//Using EntrySet type 2
		System.out.println("");
		Set<Entry<String, String>> entires = hm.entrySet();
		for(Entry<String,String> ent:entires){
			System.out.print(ent.getKey()+":"+ent.getValue()+"  "); // null:Big Joe  1:One  A:Apple  2:Two  B:Boy  4:null  5:null
		}

		//Using Values
		Collection<String> a = hm.values();


	}






	/**
	 * We can fetch only values from HashMap and if value itself is a HashMap then that can be iterated further
	 * Note: We need to use for loop to extract values else we get "Collection<String>" in return
	 */
	public void getHashMapValues() {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("A","Apple");
		hashMap.put("B","Ball");

		HashMap<String, String> hashMap2 = new HashMap<>();
		hashMap2.put("M","Mango");
		hashMap2.put("N","Nest");

		
		HashMap<String, HashMap<String, String>> bigHashMap = new HashMap<>();
		bigHashMap.put("set1",hashMap);
		bigHashMap.put("set2",hashMap2);
		
		for(HashMap<String, String> hm : bigHashMap.values()){
			for(Entry<String, String> entry : hm.entrySet()){
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
			System.out.println("");
		}

	}


	/**
	 * Following way Map can be iterate using Iterator way Map can't be
	 * iterated using iterator as they are not Collection
	 */
	public void iterateMapUsingIterator(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "One");
		hm.put("2", "Two");
		hm.put("3", "Three");

		System.out.println("");
		Iterator<Entry<String, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> pair = itr.next();
			System.out.print(pair.getKey() + ":" + pair.getValue() + "  ");
		}


   }
   
   
   public static void main(String [] args){
      HashMapIteration obj=new HashMapIteration();
      //obj.hashMapUnderstanding();
      //obj.testInvalidKeysInHashMap();
      obj.impMethods();

      //obj.iterateHashMap();
      //obj.getHashMapValues();
      //obj.iterateMapUsingIterator();
   }
	

}