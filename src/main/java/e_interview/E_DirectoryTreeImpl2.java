package e_interview;

import java.io.File;

public class E_DirectoryTreeImpl2 {
	public static void printDirectoryTree(String startingDirName) {
		File directory = new File(startingDirName);
		if (directory.exists() && directory.isDirectory()) {
			printRecursively(directory, 0);
		} else {
			System.out.println("Invalid directory path!");
		}
	}

	private static void printRecursively(File dir, int level) {
		File[] entries = dir.listFiles();
		if (entries != null) {
			for (File entry : entries) {
				System.out.println("  ".repeat(level) + entry.getName()); // Indentation for depth
				if (entry.isDirectory()) {
					printRecursively(entry, level + 1); // Recursively process subdirectories
				}
			}
		}
	}

	public static void main(String[] args) {
		printDirectoryTree("somewhere"); // Replace with actual path
	}	

}
