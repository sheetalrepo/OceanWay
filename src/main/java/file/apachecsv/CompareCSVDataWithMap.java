package file.apachecsv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.testng.Assert;

public class CompareCSVDataWithMap {

	
	public static void main(String[] args) throws IOException {
	
		//Expected Data Created Manually
		Map<String, String> AUTHOR_BOOK_MAP = Stream.of(new Object[][] { 
			    { "author1", "book-title1" }, 
			    { "author2", "book-title2" }, 
			}).collect(Collectors.toMap(data -> (String) data[0], data -> (String) data[1]));
		
		
		//Actual Data Coming from CSV
		Reader in = new FileReader(new File(System.getProperty("user.dir")+"\\src\\main\\java\\file\\apachecsv\\compare_data.csv"));

	    String[] HEADERS = { "author", "title"};
	    Iterable<CSVRecord> records = CSVFormat.DEFAULT
	      .withHeader(HEADERS)
	      .withFirstRecordAsHeader()
	      .parse(in);
	    
	    
	    //Compare data
	    for (CSVRecord record : records) {
	        String csvauthor = record.get("author");
	        String csvtitle = record.get("title");
	        
	        System.out.println(record);				//CSVRecord [comment=null, mapping={author=0, title=1}, recordNumber=1, values=[author1, book-title1]]
	        System.out.println(csvauthor);
	        System.out.println(csvtitle);
	        
	        Assert.assertEquals(AUTHOR_BOOK_MAP.get(csvauthor), csvtitle);
	        System.out.println("");
	    }
	}

}
