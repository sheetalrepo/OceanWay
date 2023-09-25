package file.opencsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BDDSearchFeatureStepFile {

	static HashMap<String, String> csvHashMap = new HashMap<String, String>();

	public static void beforeClassMethod() throws IOException {
		String path = System.getProperty("user.dir")
				+ "\\src\\main\\java\\file\\opencsv\\bdd_test_data_searchfeature.csv";
		// File file = new File(path);

		String line;
		BufferedReader reader = new BufferedReader(new FileReader(path));
		while ((line = reader.readLine()) != null) {
			String testCaseName = line.split(",")[0];
			String rawCSVData = line.split(",")[1];
			csvHashMap.put(testCaseName, rawCSVData);
		}
		reader.close();

	}


	public static HashMap<Integer, HashMap<String, String>>  readAndFetchScenarioOutlineData(String rawData) {
		String [] totalRecords = rawData.split("&");
		int length = totalRecords.length;
		System.out.println(length);

		
		HashMap<Integer, HashMap<String, String>> bigHashMap = new HashMap<>();
		int counter = 0;
		for(String record : totalRecords) {
			counter++;
			HashMap<String, String> singleData =  new HashMap<>();
			
			String[] keyValPairs = record.split("#");
			for(String keyVal : keyValPairs) {
				String key = keyVal.split(":")[0];
				String val = keyVal.split(":")[1];
				singleData.put(key,val);
			}
			bigHashMap.put(counter,singleData );
		}
		
		return bigHashMap;
	}

	public static void runFirstScenario() {
		String rawData = csvHashMap.get("sc1");
		String[] keywords = rawData.split("&");
		for (String keyword : keywords) {
			System.out.println(keyword);
		}
	}

	public static void runSecondScenario() {
		String rawData = csvHashMap.get("sc2");
		HashMap<Integer, HashMap<String, String>> keywordHashMap = readAndFetchScenarioOutlineData(rawData);
		System.out.println(keywordHashMap);
	
	}

	public static void runThirdScenario() {
		String rawData = csvHashMap.get("sc3");
		HashMap<Integer, HashMap<String, String>> keywordHashMap = readAndFetchScenarioOutlineData(rawData);
		System.out.println(keywordHashMap);
	}

	public static void main(String[] args) throws IOException {
		beforeClassMethod();
		//runFirstScenario();
		runSecondScenario();
		//runThirdScenario();
	}

}

