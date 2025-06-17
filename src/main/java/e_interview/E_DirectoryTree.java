package e_interview;

/**
 * Psuedo Code Only:
 * You need to print all entries in a directory tree, but in two different ways:
 * 	1. First-Level Directory → Only display files and directories in the top level.
 * 	2. Full Directory Tree → Display all files and directories recursively, no matter how deep the structure goes.
 */



/**

You're given three functions to work with:

1. list_dir(path) → Returns a list of all files & directories in the given path.
 		Example: list_dir("somewhere") → ["a.xml", "b", "c", "d"]

2. is_dir(path) → Returns true if the path is a directory, otherwise false.
 		Example: is_dir("b") → true
 		Example: is_dir("a.xml") → false
3. print(path) → Displays the single path entry.
 		Example: print("1.txt") → Prints: 1.txt

*/

public class E_DirectoryTree {
/**
	function printFirstLevelOfDirectoryTree(startingDirName)
	{
		entries = list_dir(startingDirName)  // Get list of files & directories

		for entry in entries
		  print(entry)  // Print each file and directory name
	}


	function printDirectoryTree(startingDirName)
	{
		entries = list_dir(startingDirName)  // Get all entries

		for entry in entries
		   print(entry)  // Print entry name

		   if is_dir(entry)  // If entry is a directory, recursively process it
		       printDirectoryTree(entry)
	}
*/
}
