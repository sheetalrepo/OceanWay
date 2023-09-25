package solutions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.yaml.snakeyaml.Yaml;

/**
 * Problem: Need to read a property file of Child1 project from Child2 project code
 * 
 * Solution: 
 * Child2 > pom.xml : Child1 is added as dependency
 * Child1 is added as dependency means Child1 code will be accessible in Child2 code base 
 *         mvn clean install will generate a jar and get saved in Child2 project
 * 
 * @author Sheetal_Singh
 */
public class ReadFileFromAnotherProject {

	@SuppressWarnings("unchecked")
	public static void readFilePaths() throws FileNotFoundException {
		Path currentRelativePath = Paths.get("");
		String absPath = currentRelativePath.toAbsolutePath().toString();

		//this will show current Child2 path
		System.out.println("Absolute Path: " + absPath); 

		//we are going one level up to parent project via \\..\\
		//then we move to child1 project
		String fileToBeRead = absPath + "\\..\\child1\\src\\main\\config\\abc.yaml";
		System.out.println("Other Prject Path: " + fileToBeRead);
		
		//Backslash for windows + fwd slash for Linux(jenkin) will be handled automatically
		String fileToBeReadConverted = FilenameUtils.separatorsToSystem(fileToBeRead);
		System.out.println("File Path Final: "+ fileToBeReadConverted);
		
		//Once file path is correct then Yaml can be read easily
		String keyPath = "MainKeyNode_childKeyNode";
		
		Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream(new File(fileToBeReadConverted));
        String key1 = keyPath.split("_")[0];
        String key2 = keyPath.split("_")[1];

        Map<String, Object> completeData = yaml.load(inputStream);
        Map<String, Object> authNode = (Map<String, Object>)completeData.get(key1);
        String countryCode = authNode.get(key2).toString();
        System.out.println(countryCode);
	}

	public static void main(String[] args) throws FileNotFoundException {
		ReadFileFromAnotherProject.readFilePaths();
	}

}
