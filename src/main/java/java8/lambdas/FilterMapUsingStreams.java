package java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * for parallel stream, stream() will be replaced by parallelStream() method
 * 
 * refer: https://www.mkyong.com/java8/java-8-filter-a-map-examples/
 */
public class FilterMapUsingStreams {

	/**
	 * Method to filter a Map based on some condition
	 */
	public void beforeJava8() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
			
		Map<Integer, String> filteredMap = new HashMap<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if(entry.getValue().contains("Ca")){
				filteredMap.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println(">>> Filtered Map Before Java8: "+ filteredMap);
	}
	
	
	
	/**
	 * Java8: Method to filter a Map based on some condition
	 * 
	 * //syntax:   
	 * newMap = map.entrySet().stream
	 * 						  .filter(condition)
	 * 						  .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()))  
	 */
	public void createMapfromMap1() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
	    
	    Map<Integer, String> filteredMap = map.entrySet().stream()
	    									.filter(x -> x.getValue().contains("Ca"))
	    									.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
 
	    
	    System.out.println("### Filtered Map After Java8: "+ filteredMap);
		
	}
	
	
	/**
	 * Java8: Method to filter a Map based on some condition
	 * 
	 * Here we just updated Collectors.toMap parameters style
	 */
	public void createMapfromMap2() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
	    
	    
	    Map<Integer, String> filteredMap = map.entrySet().stream()
	    									.filter(x -> x.getValue().contains("Ca"))
	    									.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	    
	    System.out.println("### Filtered Map After Java8: "+ filteredMap);
		
	}
	
	
	
	/**
	 * Java8: Here we fetch all the values based on some conditions and then concatenated them
	 * 
	 * filter can also be applied if required
	 */
	public void getStringFromMap() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
	    
	    
	    String result = map.entrySet().stream()
	    				//.filter(x -> x.getValue().contains("Ca"))
	    				.map(x->x.getValue())
	    				.collect(Collectors.joining(","));

	    
	    System.out.println("------->Fetch all values from a Map: "+result);
	}
	
	
	
	
	public void filterBigMap() {
		
		Map<String, Map<String, String>> bigMap = new LinkedHashMap<String, Map<String,String>>();
		
		Map<String, String> map1 = new HashMap<>();
	    map1.put("FirstName", "FN1");
	    map1.put("MiddleName", "MN1");
	    map1.put("LastName", "LN1");
	    map1.put("Company", "Visa");
	    map1.put("Tags", "one,two");
	    
	    Map<String, String> map2 = new HashMap<>();
	    map2.put("FirstName", "FN2");
	    map2.put("MiddleName", "MN2");
	    map2.put("LastName", "LN2");
	    map2.put("Company", "MC");
	    map2.put("Tags", "two");
	    
	    bigMap.put("TC1", map1);
	    bigMap.put("TC2", map2);
	    

	    System.out.println("Big Map: "+bigMap);
	    
	    
//	    //syntax:   newMap = map.entrySet().stream.filter(condition).collect()
	    Map<String, Map<String, String>> mcbigMap1 = bigMap.entrySet().stream()
	    									.filter(x -> x.getValue().get("Company").equalsIgnoreCase("MC"))
	    									.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
	    
	    Map<String, Map<String, String>> mcbigMap2 = bigMap.entrySet().stream()
				.filter(x -> x.getValue().containsValue("MC"))
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
	    
	    System.out.println(mcbigMap1);
	    System.out.println(mcbigMap2);

	    
	    //Req: filter big map based on input tag passed
	    List<String> inputTags = new ArrayList<String>();
	    inputTags.add("one");
	    inputTags.add("two");
	    
	    Map<String, Map<String, String>> mcbigMap3 =  bigMap.entrySet().stream()
	    		.filter(x ->{
	    			
	    			String [] tagsArray = x.getValue().get("Tags").split(",");
	    			List<String> tagsList = Arrays.stream(tagsArray).collect(Collectors.toList());
	    			return tagsList.stream().anyMatch(y -> inputTags.contains(y));
	    		})
	    		.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
	    
	    System.out.println("BigMap3:  "+ mcbigMap3);
		
	}
	
	
	public static void main(String [] args) {
		FilterMapUsingStreams obj = new FilterMapUsingStreams();
//		obj.beforeJava8();
//		obj.createMapfromMap1();
//		obj.createMapfromMap2();
//		obj.getStringFromMap();
		obj.filterBigMap();
	}
	
	
	
}
