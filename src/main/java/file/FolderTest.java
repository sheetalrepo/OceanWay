package file;

import java.io.File;

public class FolderTest {
	
	public static void createFolderIfNotPresent(){
		String path = System.getProperty("user.dir");

		File dir = new File(path + "/src/main/java/file/testfolder");
		if (dir.exists()) {
			System.out.println("Folder already present");
		} else {
			dir.mkdir();
			System.out.println("New folder created");
		}
	}
	
	public static void main(String [] args){
		FolderTest.createFolderIfNotPresent();
	}

}
