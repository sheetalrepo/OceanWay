package file.apachecsv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

//todo: to write multiple coulmn, currently in map we have only 
public class CSVWriter2 {

	public static void main(String[] args) throws IOException {

		//Data Created Manually
		Map<String, String> AUTHOR_BOOK_MAP = Stream.of(new Object[][] { 
			    { "Alb", "Pinto"}, 
			    { "Albert", "Brown"}, 
			    { "Robert", "Decosta"}, 
			}).collect(Collectors.toMap(data -> (String) data[0], data -> (String) data[1]));
		
		FileWriter out = new FileWriter(new File(System.getProperty("user.dir")+"\\src\\main\\java\\file\\apachecsv\\csv_writer_2.csv"));

		String[] HEADERS = { "First-Name", "Last-Name"};
		try (CSVPrinter printer = new CSVPrinter(out,
				CSVFormat.DEFAULT.withHeader(HEADERS))) {
			AUTHOR_BOOK_MAP.forEach((f, l) -> {
				try {
					printer.printRecord(f, l);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

		
		System.out.println("File written succesfully: create_csv.csv ");
		
	}
}
