package file.excelplay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


/**
 * This class will print HashMap containing all data from different sheets for
 * a particular given test case
 */
public class TestMultipleSheetData {
    static final Logger logger = LoggerFactory.getLogger(TestMultipleSheetData.class);

    public static void main(String[] args) {
        String dataFile = "\\src\\main\\java\\file\\excelplay\\DataInMultipleSheet.xls";
        String sheetToBeRead = "master_students_list"; // master_students_list,class_details
        String testCaseIdToBeRead = "tc1";

        ReadCompleteExcel rceObj = new ReadCompleteExcel();
        Map<String, HashMap<String, String>> bigHashMap = rceObj.readCompleteExcelDataSheet(dataFile, sheetToBeRead);
        Map<String, String> singleRowHashMap = rceObj.readSingleExcelRow(bigHashMap, testCaseIdToBeRead);

        Map<String, String > singleStudentCompleteData = new HashMap<>();
        singleStudentCompleteData.putAll(singleRowHashMap);

        String [] sheetNameList = {"class_details","contact_details","address_details"};

        //Iterating on all sheet and add data in singleStudentCompleteData HashMap
        for(String sheet : sheetNameList){
            Map<String, HashMap<String, String>> bigHashMapFromSheet = rceObj.readCompleteExcelDataSheet(dataFile,sheet );
            Map<String, String> singleRowHashMapFromSheet = rceObj.readSingleExcelRow(bigHashMapFromSheet, testCaseIdToBeRead);
            singleStudentCompleteData.putAll(singleRowHashMapFromSheet);
        }

        logger.info("*****************   Complete HashMap Size: "+singleStudentCompleteData.size());
        for (String key : singleStudentCompleteData.keySet()) {
            logger.info("-------------   "+key + " = " + singleStudentCompleteData.get(key));
        }
    }


}
