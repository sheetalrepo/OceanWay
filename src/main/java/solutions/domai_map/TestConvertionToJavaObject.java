package solutions.domai_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestConvertionToJavaObject {

	/**
	 * Here we need to parse files or read excels and accordingly need to create big hashmap
	 * key will be some unique value which represents row
	 * key can be a counter if no such unique key present
	 */
	public static Map<String, Map<String, String>> createAndGetDummyData(){
		Map<String, Map<String, String>> bigMap = new LinkedHashMap<>();
		
		Map<String, String> rowMap1 = new LinkedHashMap<>();
		rowMap1.put("Employee ID", "101");
		rowMap1.put("Employee Name", "John");
		rowMap1.put("Employee Profile", "Auto QA");
		rowMap1.put("Employee Position", "Lead QA");
		rowMap1.put("Employee Experience", "12");
		bigMap.put("101", rowMap1);
		
		Map<String, String> rowMap2 = new LinkedHashMap<>();
		rowMap2.put("Employee ID", "102");
		rowMap2.put("Employee Name", "Bon");
		rowMap2.put("Employee Profile", "Dev");
		rowMap2.put("Employee Position", "Lead Dev");
		rowMap2.put("Employee Experience", "10");
		bigMap.put("102", rowMap2);
		
		Map<String, String> rowMap3 = new LinkedHashMap<>();
		rowMap3.put("Employee ID", "103");
		rowMap3.put("Employee Name", "Don");
		rowMap3.put("Employee Profile", "BA");
		rowMap3.put("Employee Position", "Jr BA");
		rowMap3.put("Employee Experience", "5");
		bigMap.put("103", rowMap3);
		
		return bigMap;
	}
	
	/**
	 * This method will map raw map to domain obj map
	 */
	public static Map<String, EmployeeDomain> mapDataToJavaObject(Map<String, Map<String, String>> bigMap){
		Map<String, EmployeeDomain> javadomainobj = new LinkedHashMap<>();

		for(String key : bigMap.keySet()){
			Map<String, String> smallmap = bigMap.get(key);
			EmployeeDomain singleEmployeeData = EmployeeDomain.getEmployeeDomainObject(smallmap);
			javadomainobj.put(key, singleEmployeeData);
		}
		
		return javadomainobj;
	}
	
	
	public static void verifyDomainMap(Map<String, EmployeeDomain> javadomainmap){
		String a = javadomainmap.get("101").getEmpName();
		String b = javadomainmap.get("102").getEmpName();
		String c = javadomainmap.get("103").getEmpName();
		
		System.out.println(a+" "+b+" "+c);
		
	}
	
	public static void main(String[] args) {
		
		Map<String, Map<String, String>> bigMap = createAndGetDummyData();
		System.out.println("Raw Data: "+bigMap);

		Map<String, EmployeeDomain> javadomainmap = mapDataToJavaObject(bigMap);
		System.out.println("Domain Map: "+javadomainmap);

		verifyDomainMap(javadomainmap);
		
	}

}
