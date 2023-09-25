package file.opencsv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * 
 * Converting CSV to Bean using Annotations in POJO(SoceityDetails) class
 * 
 */
public class ReadCSVAsBeanUsingAnnotations {
	
	@SuppressWarnings("unchecked")
	public void usingIteratorForBigCSV() throws IOException{
		
		//setting up file to be read
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\soceity_details.txt";
		
		try (
	            Reader reader = Files.newBufferedReader(Paths.get(path))
        ) {
			
				//setting up CSV Bean
				@SuppressWarnings("rawtypes")
	            CsvToBean<SocietyDetails> csvToBean = new CsvToBeanBuilder(reader)
	                    .withType(SocietyDetails.class)
	                    .withIgnoreLeadingWhiteSpace(true)
	                    .build();
				
				//Iterator saving objects
	            Iterator<SocietyDetails> csvUserIterator = csvToBean.iterator();


	            //Print each object
	            while (csvUserIterator.hasNext()) {
	            	SocietyDetails soceityDetails = csvUserIterator.next();
	                System.out.println("S Name : " + soceityDetails.getSoceityName());
	                System.out.println("S Age : " + soceityDetails.getSoceityAge());
	                System.out.println("S Flat Count : " + soceityDetails.getSoceityFlatCount());
	                System.out.println("S City : " + soceityDetails.getSoceityCity());
	                System.out.println("==========================");
	            }
	        }	
	}
	
	
	
	
	

	@SuppressWarnings("unchecked")
	public void usingListForSmallCSV() throws IOException{
	
		//setting up file to be read
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\soceity_details.txt";
		Reader reader = Files.newBufferedReader(Paths.get(path));
		
		//setting up CSV Bean
		CsvToBean<SocietyDetails> csvToBean = new CsvToBeanBuilder(reader)
        .withType(SocietyDetails.class)
        .withIgnoreLeadingWhiteSpace(true)
        .build();
		
		//Saving objects in Memory i.e. List of objects
		List<SocietyDetails> csvUsers = csvToBean.parse();

		//print objects
	    for(SocietyDetails soceityDetails: csvUsers) {
               System.out.println("S Name : " + soceityDetails.getSoceityName());
               System.out.println("S Age : " + soceityDetails.getSoceityAge());
               System.out.println("S Flat Count : " + soceityDetails.getSoceityFlatCount());
               System.out.println("S City : " + soceityDetails.getSoceityCity());
               System.out.println("=============X=============");
	    }
	}
	
	
	
	public static void main(String [] args) throws IOException{
		ReadCSVAsBeanUsingAnnotations obj = new ReadCSVAsBeanUsingAnnotations();
		obj.usingIteratorForBigCSV();
		obj.usingListForSmallCSV();
	}
}
