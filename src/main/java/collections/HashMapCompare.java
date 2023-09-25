package collections;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class HashMapCompare {

	static Logger logger = LoggerFactory.getLogger(HashMapCompare.class);
	
	/**
	 * Requirement: 
	 * all values of map1 should present in map2
	 * map2 is bigger map than map1
	 */
	public boolean compareMap1PresentIntoMap2() {

		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "Apple");
		map1.put("C", "Cat");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("A", "Apple");
		map2.put("B", "Boy");
		map2.put("C", "Cat");
		
		boolean flag = true;
		int failCount = 0;
		logger.info("Map1 Size: {}",map1.size());
		logger.info("Map2 Size: {}",map2.size());
		
		Assert.assertTrue(map2.size()>=map1.size(),"Map2 size shd be greater or equal else stop here");

		// check that all keys in map 1 shd present in map2
		for (String key : map1.keySet()) {
			try {
				if (!map2.containsKey(key)) {
					logger.error("map2 does not contains key:{}", key);
					flag = false;
					failCount++;
				} else {
					if (map1.get(key).equals(map2.get(key))) {
						flag = true;
					} else {
						System.out.println("Key:"+key+", Value in Map1:"+map1.get(key)+", Value in Map2:"+map2.get(key));
						flag = false;
						failCount++;
					}
				}
			} catch (NullPointerException e) {
				logger.error("NullPointerException  " + e + e.getMessage());
				logger.error("Value mismatch in both maps");
			}
		}
		if (failCount > 0) {
			flag = false;
		}
		return flag;
	}
	
	
	
	
	
	
	public static void main(String [] args){
		HashMapCompare obj = new HashMapCompare();
		boolean flag = obj.compareMap1PresentIntoMap2();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> "+flag);
		
	}
	
	
}
