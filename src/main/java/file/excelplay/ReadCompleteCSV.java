package file.excelplay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;

public class ReadCompleteCSV {

    final Logger logger = LoggerFactory.getLogger(ReadCompleteCSV.class);

    public HashMap<String, HashMap<String, String>> getBigHashMapFromCSV(){
        String dataFile = "\\src\\main\\java\\file\\excelplay\\csv_main_testsheet.csv";
        File file = new File(System.getProperty("user.dir") + dataFile);
        //logger.info("File to be read: " + System.getProperty("user.dir") + dataFile);
        String line;
        int counter = 0;
        HashMap<String, HashMap<String,String>> bigHashMap = new HashMap<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> headerList = null;


            while ((line = bufferedReader.readLine()) != null){
                counter++;

                if(counter != 1){
                    HashMap<String,String> smallHashMap = new HashMap<>();
                    String [] arr = line.split(",");
                    List<String> bodyList = Arrays.asList(arr);
                    //System.out.println("Body List: "+counter+"  "+ bodyList);

                    //creating small hashMap with <title,value>
                    for(int i=0; i < headerList.size(); i++) {
                        smallHashMap.put(headerList.get(i), bodyList.get(i));
                    }

                    //creating bigHashMap with <TestCaseId,smallHashMap>
                    bigHashMap.put(bodyList.get(0),smallHashMap);
                    //System.out.println("Body Map: "+counter+" : "+smallHashMap);
                }else {
                    String [] arr = line.split(",");
                    headerList = Arrays.asList(arr);
                    //System.out.println("Headers List: "+ headerList);
                }
        }

        //System.out.println(bigHashMap);

        } catch (FileNotFoundException e) {
            logger.error("Missing File: ",e);
        } catch (IOException e) {
            logger.error("I/O Exception: ",e);
        }

        return bigHashMap;
    }


    public void printBigHaspMap(HashMap<String, HashMap<String,String>> bigHashMap){
        for(Map.Entry<String, HashMap<String, String>> entry: bigHashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }


    public static void main(String [] args){
        ReadCompleteCSV obj = new ReadCompleteCSV();
        //obj.getBigHashMapFromCSV();
        obj.printBigHaspMap(obj.getBigHashMapFromCSV());

    }
}
