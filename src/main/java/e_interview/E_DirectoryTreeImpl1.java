package e_interview;

import java.io.File;

public class E_DirectoryTreeImpl1 {
	public static void printFirstLevelOfDirectoryTree(String startingDirName) {
		File directory = new File(startingDirName);
		if (directory.exists() && directory.isDirectory()) {
			File[] entries = directory.listFiles();
			if (entries != null) {
				for (File entry : entries) {
					System.out.println(entry.getName()); // Print file or directory name
				}
			}
		} else {
			System.out.println("Invalid directory path!");
		}
	}

	public static void main(String[] args) {
		printFirstLevelOfDirectoryTree("somewhere"); // Replace with actual path
	}
}
