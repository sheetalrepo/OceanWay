package solutions.obj_comparision;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * Problem Stmt: we want to compare two objects of different class Bollywood and hollywood
 * 
 * Sol 1: we can override equals method and compare two objects data one by one
 * Sol 2: we can create two diff hashmap and then compare two maps key by key
 * 
 * Here we try sol 2
 * 
 */
public class CompareObjUsingMap {
	//key constants
	final String AUDIENCE = "AUDIENCE";
	final String GENRE = "GENRE";
	final String HIT_MOVIEW_COUNT = "HIT_MOVIEW_COUNT";
	final String REVENUE = "REVENUE";
	

	/**
	 * create obj of one type
	 */
	public Bollywood getObjectBollywood(){
		Bollywood bollywood = new Bollywood();
		bollywood.setTopActor("aamir");
		bollywood.setAudience("multi-lang");
		bollywood.setGenre("all");
		bollywood.setHitMoviewCount(100);
		bollywood.setRevenue(1000);
		return bollywood;
	}
	
		
	/**
	 * create obj of another type 
	 */
	public Hollywood getObjectHollywood(){
		Hollywood hollywood = new Hollywood();
		hollywood.setAudience("multi-lang");
		hollywood.setGenre("all");
		hollywood.setHitMoviewCount(100);
		hollywood.setRevenue(1000);
		return hollywood;
	}
	
	
	
	/**
	 * create a hashmap with common key and value from respective class obj 
	 */
	public List<String> compareTwoObjectsUsingMaps(Bollywood exObj,Hollywood acObj ){
		Map<String, String> expectedMap = new TreeMap<>();
		Map<String, String> actualMap = new TreeMap<>();
		
		expectedMap.put(AUDIENCE, exObj.getAudience());
		actualMap.put(AUDIENCE, acObj.getAudience());
		
		expectedMap.put(GENRE, exObj.getGenre());
		actualMap.put(GENRE, acObj.getGenre());
		
		expectedMap.put(HIT_MOVIEW_COUNT, String.valueOf(exObj.getHitMoviewCount()));
		actualMap.put(HIT_MOVIEW_COUNT, String.valueOf(acObj.getHitMoviewCount()));
		
		expectedMap.put(REVENUE, String.valueOf(exObj.getRevenue()));
		actualMap.put(REVENUE, String.valueOf(acObj.getRevenue()));
		
		return compare(expectedMap, actualMap);
	}
	
	
	/**
	 * Compare two Map and create a mismatch list, if any
	 */
	public List<String> compare(Map<String, String> expMap, Map<String, String> actMap){
		List<String> errorList = new ArrayList<>();
		Map<String, String> expTreeMap = new TreeMap<>(expMap);
		Map<String, String> actTreeMap = new TreeMap<>(actMap);

		for (Entry<String, String> entry : expTreeMap.entrySet()) {
			String expValue=expTreeMap.get(entry.getKey());
			String actValue=actTreeMap.get(entry.getKey());
			
			//System.out.println("Key: "+entry.getKey()+ "\t\t Exp Value: "+ expValue+" && Actual Value:"+actValue);
			if(expValue == null && actValue == null)
				continue;
			else if (!expValue.equalsIgnoreCase(actValue)){
				errorList.add("Error Key: "+entry.getKey()+" Exp Value: "+expValue+" && Act Value: "+actValue);
			}
		}
		return errorList ;
	}
	
	
	
	public static void main(String[] args) {
		//create objects
		CompareObjUsingMap obj = new CompareObjUsingMap();
		Bollywood expectedBollywood = obj.getObjectBollywood();
		Hollywood actualHollywood = obj.getObjectHollywood();
		System.out.println("Bollywood Obj: "+ expectedBollywood );
		System.out.println("Hollywood Obj: "+ actualHollywood );
		
		//compare objects
		List<String> errorList = obj.compareTwoObjectsUsingMaps(expectedBollywood, actualHollywood );
		System.out.println("Size: "+ errorList.size());
		
		//print error list if present
		for(String str: errorList){
			System.out.println(str);
		}
	}

}
