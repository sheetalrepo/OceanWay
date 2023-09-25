package solutions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.yaml.snakeyaml.Yaml;


/**
 * refer:
 * https://www.programcreek.com/java-api-examples/?class=org.yaml.snakeyaml.Yaml&method=dump
 *
 */
public class DumpSomeDataForLaterUse {

	
	public static void dumpDataIntoFile(){
		List<String> ls = new ArrayList<>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		
		Yaml yaml = new Yaml();
		try {
			String dataFile = "\\src\\main\\java\\solutions\\testdump.yaml";
			String strFile = System.getProperty("user.dir") + dataFile;
			yaml.dump(ls, new FileWriter(new File(strFile)));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
	
	
	
	
	public static void main(String[] args) {
		dumpDataIntoFile();
	}

}
