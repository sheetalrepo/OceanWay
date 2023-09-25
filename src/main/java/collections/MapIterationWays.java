package collections;

import java.util.Collection; 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.Set;

public class MapIterationWays {

	public void differentWaysToIterate(){
		Map<String, Integer> priceMap = new HashMap<>(); 
		priceMap.put("TV", 500); 
		priceMap.put("Phone", 200); 
		priceMap.put("Car", 20000); 
		priceMap.put("Bike", 6000); 
		priceMap.put("Furniture", 700); 
		
		System.out.println("price map: " + priceMap); 
		
		Set<String> keys = priceMap.keySet(); 
		Collection<Integer> values = priceMap.values(); 
		Set<Entry<String, Integer>> entries = priceMap.entrySet(); 
		
		System.out.println("keys of Map : " + keys); 
		System.out.println("values from Map :" + values); 
		System.out.println("entries from Map :" + entries); 
	}
		

	public static void main(String[] args) {
		MapIterationWays obj = new MapIterationWays();
		obj.differentWaysToIterate();
	}
}

//price map: {TV=500, Car=20000, Phone=200, Furniture=700, Bike=6000}
//keys of Map : [TV, Car, Phone, Furniture, Bike]
//values from Map :[500, 20000, 200, 700, 6000]
//entries from Map :[TV=500, Car=20000, Phone=200, Furniture=700, Bike=6000]
