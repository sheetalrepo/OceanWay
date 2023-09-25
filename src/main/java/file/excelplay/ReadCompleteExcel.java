package file.excelplay;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DataInMultipleSheet.xls : primary key/test_case_id is present in main sheet and
 * respective single data is present in multiple sheets
 * 
 * DataInFullSingleSheet.xls : primary key/test_case_id is present in main sheet and
 * respective multiple data is present in single sheet
 * 
 * testdata3.xls : primary key/test_case_id is present in main sheet and
 * respective multiple data is present in multiple sheet
 * 
 *
 */
public class ReadCompleteExcel {

	//imp: for utility class, instance member are a bad idea, always create a local member refer ReadExcelGenericNew.java
	HashMap<String, HashMap<String, String>> entireTestData;
	private File file;
	final Logger logger = LoggerFactory.getLogger(ReadCompleteExcel.class);


	public static void main(String[] args) {
		ReadCompleteExcel obj = new ReadCompleteExcel();
		String dataFile = "\\src\\main\\java\\file\\excelplay\\DataInMultipleSheet.xls";
		String sheetToBeRead = "master_students_list"; // master_students_list,class_details
		String testCaseIdToBeRead = "tc5";

		Map<String, HashMap<String, String>> bigHashMap = obj
				.readCompleteExcelDataSheet(dataFile, sheetToBeRead);
		Map<String, String> smallHaspMap = obj.readSingleExcelRow(bigHashMap,testCaseIdToBeRead);
		obj.printSingleExcelRow(smallHaspMap);
	}



	/**
	 * { 1={student_id=1, last_name=sharma, middle_name=pink, first_name=sara},
	 * 2={student_id=2, last_name=ladka, middle_name=badmash, first_name=gondu},
	 * 3={student_id=3, last_name=baby, middle_name=yellow, first_name=gugu},
	 * 4={student_id=4, last_name=toddler, middle_name=badmash,
	 * first_name=chiku}, 5={student_id=5, last_name=rani, middle_name=catty,
	 * first_name=mato} }
	 **/

	/**
	 * Method will accept sheet name to be read and return all excel data with
	 * key as test case id(string) and small HashMap will be <title,value> pair
	 */
	public HashMap<String, HashMap<String, String>> readCompleteExcelDataSheet(
			String dataFile, String sheetName) {

		entireTestData = new HashMap<>();
		HashMap<String, String> contentHashMap;
		List<String> headerList = new ArrayList<>();
		file = new File(System.getProperty("user.dir") + dataFile);
		logger.info("File to be read: " + System.getProperty("user.dir")
				+ dataFile);

		Sheet excelSheet;

		//try with resources used here, no need to close resources opened
		try (
			FileInputStream inputStream = new FileInputStream(file);
			HSSFWorkbook excelWB = new HSSFWorkbook(inputStream))
			{

			excelSheet = excelWB.getSheet(sheetName);
			logger.info("Sheet Name to be read:" + excelSheet.getSheetName());

			int rowCount = excelSheet.getLastRowNum();
			//logger.info("Row count in sheet: " + rowCount);

			// read title and add into a list
			Row headerRow = excelSheet.getRow(0);
			int columnCount = headerRow.getLastCellNum();
			//logger.info("Column count in sheet: " + columnCount);

			for (int i = 0; i < columnCount; i++) {
				headerList.add(i, headerRow.getCell(i).getStringCellValue());
			}

			// read content and add into HM as <header,content> for all rows
			for (int i = 1; i <= rowCount; i++) {
				contentHashMap = new HashMap<>();
				Row row = excelSheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					// issue: dont work in case of blank cell value
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING); 
					if (!(row.getCell(j) == null || row.getCell(j)
							.getStringCellValue().equals(""))) {
						contentHashMap.put(headerList.get(j), row.getCell(j)
								.getStringCellValue());
					} else {
						contentHashMap.put(headerList.get(j), "");
					}

				}

				HashMap<String, String> tempMap = contentHashMap; // why ???
				entireTestData.put(row.getCell(0).getStringCellValue(), tempMap);
			}

		} catch (Exception e) {
			logger.info(e.getMessage()+ e);
			return null;
		}
		logger.info("Excel sheet has been read and stored into a HashMap");
		return entireTestData;
	}


	/**
	 * @param bigHashMap it will accept complete data from excel sheet
	 * @param testCaseIdToBeRead row id which need to be fetched from big hash map
	 * @return small hash map which contains single row <heading, value> pair
	 */
	public Map<String, String> readSingleExcelRow(Map<String, HashMap<String, String>> bigHashMap, String testCaseIdToBeRead) {
		Map<String, String> map;
		map = bigHashMap.get(testCaseIdToBeRead);
		return map;
	}


	/**
	 * method will print single test case data from big hash map
	 */
	public void printSingleExcelRow(Map<String, String> map) {
		for (String key : map.keySet()) {
			logger.info(key + "	 =	"+map.get(key));
		}
	}

}
