package interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * We need to find max occurrence of a character
 *
 */
public class CharMaxOccurence {

	public static void main(String[] args) {
		String str = "hello world";
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i< str.length();i++){
			char ch = str.charAt(i);
			
//			if(!map.containsKey(ch)){
//				map.put(ch, 1);
//			}else{
//				map.put(ch, map.get(ch)+1);
//			}	
			map.put(ch, map.containsKey(ch)? map.get(ch)+1:1);
		}
		
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		//TODO
		Collection<Integer> cll = map.values();
		
	}

}
