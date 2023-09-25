package file.opencsv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * 
 * Converting CSV to Bean without using Annotations in POJO(EmployeeDetails) class
 * 
 * https://www.callicoder.com/java-read-write-csv-file-opencsv/
 */
public class ReadCSVAsBeanWithoutAnnotations {
	
	@SuppressWarnings("unchecked")
	public void readCSVAsAJavaBean() throws IOException{
		//setting up file to be read
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\employee_details.txt";
		Reader reader = Files.newBufferedReader(Paths.get(path));

		
		@SuppressWarnings("rawtypes")
		ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(EmployeeDetails.class);
        
        String[] memberFieldsToBindTo = {"eID", "eName", "eAge", "eDept"};
        strategy.setColumnMapping(memberFieldsToBindTo);

        @SuppressWarnings("rawtypes")
		CsvToBean<EmployeeDetails> csvToBean = new CsvToBeanBuilder(reader)
                    .withMappingStrategy(strategy)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        
        Iterator<EmployeeDetails> itr = csvToBean.iterator();
        while(itr.hasNext()){
        	EmployeeDetails obj = itr.next();
        	System.out.println(obj);
        }
        
	}
	
	public static void main(String [] args) throws IOException{
		
		ReadCSVAsBeanWithoutAnnotations obj = new ReadCSVAsBeanWithoutAnnotations();
		obj.readCSVAsAJavaBean();
		
	}

}
