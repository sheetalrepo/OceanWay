package file.excelplay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ReadExcelGenericNew {

		
	/**
	 * @param filePath : excel file path to be read
	 * @param sheetName : excel sheet name to be read
	 * @param headerRowNum: row number where header is present, generally its val is 0
	 * @param keyColNum: column number of sheet which is going to be big hashmap 'key' i.e. Map<key, Map<String, String>> 
	 * @return : this method will return complete excel without filtering anything
	 */
	public static Map<String, Map<String, String>> readCompleteExcelSheetData(
			String filePath, String sheetName, int headerRowNumber,
			int keyColumnNumber) throws IOException {

		String msg = String.format("Reading content from given sheet(%s) "+ "with Header Column as (%s) and BigHashMapKey Column number as (%s)",sheetName, headerRowNumber, keyColumnNumber);
		System.out.println(msg);

		Map<String, Map<String, String>> sheetBigMapData = new LinkedHashMap<>();

		
		File file = new File(filePath);
		HSSFWorkbook excelWB = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			excelWB = new HSSFWorkbook(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(String.format("File not found @ path(%s)", filePath), e);
		}
		
		Sheet sheet = excelWB.getSheet(sheetName);
		excelWB.close();
		int rowCount = sheet.getLastRowNum();
		Row headerRow = sheet.getRow(headerRowNumber);
		
		for (int i = headerRowNumber + 1; i <= rowCount; i++) {
			Map<String, String> singleRowContent = new LinkedHashMap<>();
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {
				try {
					if (row.getCell(j) != null) {
						row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
						singleRowContent.put(headerRow.getCell(j).getStringCellValue(), row.getCell(j).getStringCellValue());
					} else
						singleRowContent.put(headerRow.getCell(j).getStringCellValue(), " ");
				} catch (Exception ex) {
					String exceptionMsg = String.format("Exception at row no (%s) and Column no (%s) ", i,j);
					throw new RuntimeException(exceptionMsg, ex);
				}
			}

			String key = row.getCell(keyColumnNumber).getStringCellValue();
			sheetBigMapData.put(key, singleRowContent);
		}

		return sheetBigMapData;
	}

	/**
	 *
	 * @param filePath : excel file path to be read
	 * @param sheetName : excel sheet name to be read
	 * @param headerRowNum: row number where header is present, generally its val is 0
	 * @param keyColNum: column number of sheet which is going to be big hashmap 'key' i.e. Map<key, Map<String, String>> 
	 * @param yesNoFlagColumnName : column header name which has 'yes/no' data. Based on 'yes' flag, new map will be created
	 * @return : this method will return complete excel without filtering anything
	 */
	public static Map<String, Map<String, String>> readExcelSheetWithYesFlag(
			String filePath, String sheetName, int headerRowNumber,
			int keyColumnNumber, String yesNoFlagColumnName) throws IOException {

		Map<String, Map<String, String>> bigHashMap = readCompleteExcelSheetData(filePath, sheetName, headerRowNumber, keyColumnNumber);
		Map<String, Map<String, String>> bigFlaggedHashMap = new LinkedHashMap<>();

		for (String key : bigHashMap.keySet()) {
			Map<String, String> dataMap = bigHashMap.get(key);
			if ("Yes".equalsIgnoreCase(dataMap.get(yesNoFlagColumnName)))
				bigFlaggedHashMap.put(key, dataMap);
		}
		return bigFlaggedHashMap;
	}



	public static void main(String[] args) throws IOException {
		String dataFile = "\\src\\main\\java\\file\\excelplay\\TestDataFlag2.xls";
		String file = System.getProperty("user.dir") + dataFile;


		Map<String, Map<String, String>> bigmap1 = readCompleteExcelSheetData(file, "One", 0, 1);
		System.out.println(bigmap1);
		
		Map<String, Map<String, String>> bigmap2 = readExcelSheetWithYesFlag(file, "One", 0, 1, "Run");
		System.out.println(bigmap2);
	}

}
