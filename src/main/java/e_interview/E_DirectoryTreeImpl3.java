package e_interview;
import java.io.File;

public class E_DirectoryTreeImpl3 {

	public static void processFilesRecursively(File directory) {
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					processFilesRecursively(file); // Recursive call for subdirectories
				} else {
					handleFile(file); // Process individual files
				}
			}
		}
	}

	public static void handleFile(File file) {
		if (!file.canRead()) {
			System.out.println("Permission Denied: " + file.getName());
		} else if (!file.getName().matches(".*\\.(csv|xml|txt|pdf|png)")) { // Validate extension
			System.out.println("Invalid File Type: " + file.getName());
		} else {
			System.out.println("Processing File: " + file.getName());
			// Apply transformation or business logic
		}
	}

	public static void main(String[] args) {
		File rootDir = new File("path of folder"); // Change path as needed
		processFilesRecursively(rootDir);
	}
}
