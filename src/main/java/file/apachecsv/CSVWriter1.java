package file.apachecsv;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class CSVWriter1 {
    private static final String SAMPLE_CSV_FILE = System.getProperty("user.dir")+"\\src\\main\\java\\file\\apachecsv\\csv_writer_1.csv";

    public static void main(String[] args) throws IOException {
        try (
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("ID", "Name", "Designation", "Company"))
        ) {
            csvPrinter.printRecord("1", "Sundar Pichai", "CEO", "Google");
            csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft");
            csvPrinter.printRecord("3", "Tim cook", "CEO", "Apple");
            csvPrinter.printRecord(Arrays.asList("4", "Mark Zuckerberg", "CEO", "Facebook"));

            csvPrinter.flush();            
        }
        
        System.out.println("Done");
    }
}
