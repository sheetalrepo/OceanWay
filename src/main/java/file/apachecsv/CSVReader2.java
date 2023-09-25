package file.apachecsv;


import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * This class will read by column name rather index
 */
public class CSVReader2 {
    private static final String SAMPLE_CSV_FILE_PATH = System.getProperty("user.dir")+"\\src\\main\\java\\file\\apachecsv\\csv_reader_2.csv";

    public static void main(String[] args) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    //.withHeader("SrNo","Name", "Designation", "Country", "Mobile")  //this is also correct
            		.withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim())
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by the names assigned to each column
                String id = csvRecord.get("SrNo");
            	String name = csvRecord.get("Name");
                String mobile = csvRecord.get("Mobile");
                String email = csvRecord.get("Designation");
                String country = csvRecord.get("Country");

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("SrNo : " + id);
                System.out.println("Name : " + name);
                System.out.println("Mobile : " + mobile);
                System.out.println("Desig : " + email);
                System.out.println("Country : " + country);
                System.out.println("---------------\n\n");
            }
        }
    }
}