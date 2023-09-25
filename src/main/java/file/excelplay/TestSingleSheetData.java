package file.excelplay;

import java.util.HashMap;
import java.util.Map;


/**
 * This class will print HashMap containing all data from single sheets for
 * a particular given test case
 */
public class TestSingleSheetData {

    static String dataFile = "\\src\\main\\java\\file\\excelplay\\DataInFullSingleSheet.xls";
    static String sheetToBeRead = "car_list";
    static String testCaseIdToBeRead = "tc2";


    public static void main(String[] args) {
        ReadCompleteExcel rceObj = new ReadCompleteExcel();
        Map<String, HashMap<String, String>> bigHashMap = rceObj.readCompleteExcelDataSheet(dataFile,sheetToBeRead );
        Map<String, String> singleRowHashMap = rceObj.readSingleExcelRow(bigHashMap, testCaseIdToBeRead);
        String modelValue = null;
        for(String key : singleRowHashMap.keySet()){
            if(key.equalsIgnoreCase("model")){
                modelValue = singleRowHashMap.get(key);
                break;
            }
        }

        ReadCompleteExcelWithYFlag flagObj = new ReadCompleteExcelWithYFlag();
        HashMap<Integer, HashMap<String, String>> bigFlagHashMap = flagObj.readCompleteExcelDataWithYFlag(dataFile, modelValue );
        flagObj.printIntegerBigHaspMap(bigFlagHashMap);
    }


}
