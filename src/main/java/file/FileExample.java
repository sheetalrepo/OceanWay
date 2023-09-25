package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

	public static void fileBasicOperations() throws FileNotFoundException {
		// better way than using string inside FIS
		File f = new File("student.ser");
		FileInputStream fis = new FileInputStream(f);

		// make a dir
		File dir = new File("FDIR");
		boolean flag = dir.mkdir();

		// 'true' if 'dir' is not present and mkdir actually make a directory
		System.out.println(flag);

		// get path
		System.out.println(dir.getAbsolutePath()); // path: /Users/sheetalsingh/Documents/workspace/OceanWay/FDIR

		// delete a dir
		System.out.println(dir.delete());
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		FileExample.fileBasicOperations();
	}
}
