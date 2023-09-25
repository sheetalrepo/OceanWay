package file.opencsv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadCSVAsHashMap {

	/**
	 * This method will read complete test data present in csv file and create a big hashmap
	 * big hash map contains test case id as key & val as <title heading,title value>
	 */
	public HashMap<String, HashMap<String, String>> readCompleteCSVFile(File file) throws IOException{
		FileReader fr = new FileReader(file);

		//CSVReader csvReader = new CSVReaderBuilder(fr).withSkipLines(1).build();  //it will skip top given lines
		CSVReader csvReader = new CSVReader(fr);
		List<String []> allCSVData = csvReader.readAll();
		csvReader.close();
		
		HashMap<String, HashMap<String, String>> bigHashMap = new HashMap<>();
		
		String [] headersArray = allCSVData.get(0);
		List<String> headersList = Arrays.asList(headersArray);
		
		for (int i = 1; i < allCSVData.size(); i++) {			
			List<String> bodyRow = Arrays.asList(allCSVData.get(i));
			
			HashMap<String, String> smallHashMap = new HashMap<>();
			for (int j = 0; j < headersList.size(); j++) {
				smallHashMap.put(headersList.get(j), bodyRow.get(j));
			}
			bigHashMap.put(bodyRow.get(0), smallHashMap);							
		}
		return bigHashMap;	
	}


	/**
	 * This method will read complete test data present in csv file based on "yes or no" and create a big hashmap
	 * big hash map contains int counter as key & val as <title heading,title value>
	 */
	public HashMap<Integer, HashMap<String, String>> readCompleteCSVFileBasedOnFlag(File file) throws IOException {
		FileReader fr = new FileReader(file);
		
		CSVReader csvReader = new CSVReader(fr);
		List<String[]> allCSVData = csvReader.readAll();
		csvReader.close();
		
		HashMap<Integer, HashMap<String, String>> bigHashMap = new HashMap<>();

		String[] headerArray = allCSVData.get(0);
		List<String> headerList = Arrays.asList(headerArray);

		int counter = 1;
		for (int i = 1; i < allCSVData.size(); i++) {
			List<String> bodyRow = Arrays.asList(allCSVData.get(i));
			boolean flag = bodyRow.get(0).equalsIgnoreCase("yes"); //first column value
			
			if(flag){
				HashMap<String, String> smallHashMap = new HashMap<>();
				for (int j = 0; j < headerList.size(); j++) {
					smallHashMap.put(headerList.get(j), bodyRow.get(j));
				}
				bigHashMap.put(counter, smallHashMap);
				counter++;
			}
		}
		return bigHashMap;
	}
   
	
	
	
	public void printCompleteCSVData() throws IOException{
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\test_data.csv";
		File file = new File(path);

		HashMap<String, HashMap<String, String>> bigHashMap = readCompleteCSVFile(file);
		System.out.println("Test Data:");
		System.out.println(bigHashMap);

	}

	
	public void printCompleteCSVDataBasedOnFlag() throws IOException{
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\flagged_cases.csv";
		File file = new File(path);

		HashMap<Integer, HashMap<String, String>> bigFlaggedHashMap = readCompleteCSVFileBasedOnFlag(file);
		System.out.println("Flagged Cases:");
		System.out.println(bigFlaggedHashMap);
	}
	
	public static void main(String [] args) throws IOException{
		ReadCSVAsHashMap obj = new ReadCSVAsHashMap();
		obj.printCompleteCSVData();
		obj.printCompleteCSVDataBasedOnFlag();
	}
}
