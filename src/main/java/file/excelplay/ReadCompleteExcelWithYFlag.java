package file.excelplay;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadCompleteExcelWithYFlag {

    final Logger logger = LoggerFactory.getLogger(ReadCompleteExcelWithYFlag.class);
    HashMap<String, HashMap<String, String>> entireTestData;
    private File file;

    public static void main(String[] args) {
        ReadCompleteExcelWithYFlag obj = new ReadCompleteExcelWithYFlag();
        String dataFile = "\\src\\main\\java\\file\\excelplay\\DataInFullSingleSheet.xls";
        String sheetToBeRead = "swift";

        HashMap<Integer, HashMap<String, String>> bigHashMap = obj.readCompleteExcelDataWithYFlag(dataFile, sheetToBeRead);
        obj.printIntegerBigHaspMap(bigHashMap);

    }

    /**
     * Read all data from sheet which have 'Y' flag as first column
     * key will be counter(int) and value will be small Hashmap with <title,value> pair
     */
    public HashMap<Integer, HashMap<String, String>> readCompleteExcelDataWithYFlag(
            String dataFile, String sheetName) {

        HashMap<Integer, HashMap<String, String>> entireTestDataWithYFlag;

        entireTestDataWithYFlag = new HashMap<Integer, HashMap<String, String>>();
        HashMap<String, String> singleRowHashMap;
        List<String> strHeaders = new ArrayList<String>();

        file = new File(System.getProperty("user.dir") + dataFile);
        logger.info("File to be read: " + System.getProperty("user.dir") + dataFile);

        Sheet excelSheet;

        try (FileInputStream inputStream = new FileInputStream(file);
             HSSFWorkbook excelWB = new HSSFWorkbook(inputStream)) {

            excelSheet = excelWB.getSheet(sheetName);
            logger.info("Sheet Name to be read:" + excelSheet.getSheetName());

            int rowCount = excelSheet.getLastRowNum();
            Row headerRow = excelSheet.getRow(0);
            int counter = 1;

            for (int j = 0; j < headerRow.getLastCellNum(); j++) {
                strHeaders.add(j, headerRow.getCell(j)
                        .getStringCellValue());
            }

            for (int i = 1; i <= rowCount; i++) {

                singleRowHashMap = new HashMap<String, String>();
                Row row = excelSheet.getRow(i);
                if (row.getCell(0).getStringCellValue()
                        .equalsIgnoreCase("yes")) {
                    for (int j = 1; j < row.getLastCellNum(); j++) {
                        row.getCell(j).setCellType(
                                Cell.CELL_TYPE_STRING);

                        if (!(row.getCell(j) == null || row.getCell(j)
                                .getStringCellValue().equals("")))
                            singleRowHashMap
                                    .put(strHeaders.get(j), row
                                            .getCell(j)
                                            .getStringCellValue());
                    }

                    HashMap<String, String> tempMap = singleRowHashMap;
                    entireTestDataWithYFlag.put(counter, tempMap);
                    counter++;

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return entireTestDataWithYFlag;
    }



    public void printIntegerBigHaspMap(HashMap<Integer, HashMap<String, String>> bigHashMap) {

        Map<String, String> smallHashMap = new HashMap<String, String>();

        for (int i = 1; i <= bigHashMap.size(); i++) {
            smallHashMap = bigHashMap.get(i);
            for (String key : smallHashMap.keySet()) {
                logger.info(i + " " + key + " : " + smallHashMap.get(key));
            }
            logger.info("");
        }
    }

}
