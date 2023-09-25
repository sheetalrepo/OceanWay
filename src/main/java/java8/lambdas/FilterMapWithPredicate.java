package java8.lambdas;



import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Predicate;

/**
 * 
 *  refer: https://www.mkyong.com/java8/java-8-filter-a-map-examples/
 *  https://mkyong.com/java8/java-8-predicate-examples/
 *  
 */
public class FilterMapWithPredicate {

	// Generic Map filterbyvalue, with predicate
    public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet()
                .stream()
                .filter(x -> predicate.test(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
	
	
    public void filterMapUsingPredicate() {
    	Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");

        
	    //syntax:   newMap = abc(map, condition);
	    
        Map<Integer, String> filteredMap = filterByValue(map, x -> x.contains("Apple"));
        System.out.println(filteredMap);

       
        Map<Integer, String> filteredMap2 = filterByValue(map, x -> (x.contains("Apple") || x.contains("Ball")));
        System.out.println(filteredMap2);

        
        Map<Integer, String> filteredMap3 = filterByValue(map, x -> (x.contains("Cat") && !x.contains("Ball")));
        System.out.println(filteredMap3);

        
        Map<Integer, String> filteredMap4 = filterByValue(map, x -> (x.length() <= 4));
        System.out.println(filteredMap4);

    }
    
    
	public static void main(String [] args) {
		FilterMapWithPredicate obj = new FilterMapWithPredicate();
		obj.filterMapUsingPredicate();
	}
	
}
