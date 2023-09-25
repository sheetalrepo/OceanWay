package file.opencsv;

import com.opencsv.CSVWriter;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class WriteCSV {

	public void writeLineByLine() throws IOException {
		// setting up file to be written
		String path = System.getProperty("user.dir")+ "\\src\\main\\java\\file\\opencsv\\writecsv.txt";

		//setting up writer
		try (
				Writer writer = Files.newBufferedWriter(Paths.get(path));
				CSVWriter csvWriter = new CSVWriter(writer,
						CSVWriter.DEFAULT_SEPARATOR,
						CSVWriter.NO_QUOTE_CHARACTER,
						CSVWriter.DEFAULT_ESCAPE_CHARACTER,
						CSVWriter.DEFAULT_LINE_END))
			{
				//setting up data to be written
				String[] headerRecord = { "TCName", "Title", "Description","Result" };
            	csvWriter.writeNext(headerRecord);
            	csvWriter.writeNext(new String[]{"TC-001","Addition","Adding two numbers","pass"});
            	csvWriter.writeNext(new String[]{"TC-002","Multiplication","Mult two numbers","pass"});
            	csvWriter.writeNext(new String[]{"TC-003","Division","Divide two numbers","pass"});

			}
		System.out.println("File written succesfully @ "+ path);
	}

	
	
	public void writeLineInOneGo() throws IOException{
		// setting up file to be written
		String path = System.getProperty("user.dir")+ "\\src\\main\\java\\file\\opencsv\\writecsv_in_one_go.txt";

		//setting up writer
		try (
				Writer writer = Files.newBufferedWriter(Paths.get(path));
				CSVWriter csvWriter = new CSVWriter(writer,
						CSVWriter.DEFAULT_SEPARATOR,
						CSVWriter.NO_QUOTE_CHARACTER,
						CSVWriter.DEFAULT_ESCAPE_CHARACTER,
						CSVWriter.DEFAULT_LINE_END))
			{
				//setting up data to be written
				String [] strArrHeader = new String []{"TCName","Title","Description","Result"};
				String [] strArrData1 = new String []{"TC_001","Jan","1st Month","1 pass"};
				String [] strArrData2 = new String []{"TC_002","Feb","2nd Month","2 pass"};
				String [] strArrData3 = new String []{"TC_003","Mar","3rd Month","3 pass"};

				
				//adding all string array into one list
				List<String[]> ls = new ArrayList<>();
				ls.add(strArrHeader);
				ls.add(strArrData1);
				ls.add(strArrData2);
				ls.add(strArrData3);
				
				//writing ls in one go
				csvWriter.writeAll(ls);
				
			}
		System.out.println("File written succesfully @ "+ path);

	}
	
	
	public static void main(String [] args) throws IOException {
		WriteCSV obj = new WriteCSV();
		//obj.writeLineByLine();
		obj.writeLineInOneGo();
	}

}
