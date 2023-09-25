package interview.compare_list_change;

import java.util.ArrayList;
import java.util.List;

public class OrderChecker {
	static OrderService orderservice;
	
	public static List<Order> getOrder() {
		List<Order> list = new ArrayList<>();
		list.add(new Order(10L, 100.00, "INR"));
		list.add(new Order(20L, 200.00, "USD"));
		return list;
	}
	
	
	public static boolean isOrderChanged(List<Order> actList){
	    List<Order> expList = getOrder();
	    System.out.println("Expected List: "+expList);
	    System.out.println("Actual List: "+actList);
	    
	    //check 1
	    if(!(actList.size() == expList.size()))
	    		return false;
		
	    //check 2 - compare all element
	   boolean flagAll = expList.stream().allMatch(x -> actList.contains(x));
	   boolean flagNone = expList.stream().noneMatch(x -> actList.contains(x));
	   boolean flagAnyOne = expList.stream().anyMatch(x -> actList.contains(x));
	   
	   System.out.println(flagAll+" "+flagNone + " "+ flagAnyOne);
	   return flagAnyOne;
	}
	
}
