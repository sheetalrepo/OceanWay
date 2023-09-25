package collections.adv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapToAL {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("eBay", 4444);
		hm.put("Paypal", 5555);
		hm.put("IBM", 6666);
		hm.put("Google", 7777);
		hm.put("Yahoo", 8888);

		List<Entry> entryList = new ArrayList<Entry>(hm.entrySet());
		System.out.println("\n==> Size of Entry list: " + entryList.size());
		for (Entry entry : entryList) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println();
		
		
		// Converting HashMap keys into ArrayList
		List<String> keyList = new ArrayList<String>(hm.keySet()); //hm.keyValues() can also be used
		for (String key : keyList) {	
			System.out.println(key);
		}

	}
}
