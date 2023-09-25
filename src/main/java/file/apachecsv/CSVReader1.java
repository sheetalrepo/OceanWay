package file.apachecsv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * This class will read by column index
 */
public class CSVReader1 {
    private static final String SAMPLE_CSV_FILE_PATH = System.getProperty("user.dir")+"\\src\\main\\java\\file\\apachecsv\\csv_reader_1.csv";
    
    public static void main(String[] args) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String id = csvRecord.get(0);
                String name = csvRecord.get(1);
                String designation = csvRecord.get(2);
                String company = csvRecord.get(3);

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Disignation : " + designation);
                System.out.println("Company : " + company);
                System.out.println("---------------\n\n");
            }
        }
    }
}
