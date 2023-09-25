package file;

import org.apache.commons.io.FilenameUtils;

/**
 * This apache library is very useful in handling file path on diff OS Code will
 * run irrespective of Mac, Win or Linux
 */
public class FilenameUtil {

	public void getFileNameFromPath() {
		String absolutePath1 = "C:/Users/Documents/myworkspace/OceanWay/src/main/java/file/one.dat";
		String absolutePath2 = "C:\\Users\\Documents\\myworkspace\\OceanWay\\src\\main\\java\\file\\two.txt";

		// path will have according to system OS
		System.out.println(">>>" + FilenameUtils.separatorsToSystem(absolutePath1));
		System.out.println(">>>" + FilenameUtils.separatorsToSystem(absolutePath2));

		// path will have only fwd slash
		System.out.println(">>>" + FilenameUtils.separatorsToUnix(absolutePath1));
		System.out.println(">>>" + FilenameUtils.separatorsToUnix(absolutePath2));

		// path will have only back slash
		System.out.println(">>>" + FilenameUtils.separatorsToWindows(absolutePath1));
		System.out.println(">>>" + FilenameUtils.separatorsToWindows(absolutePath2));

		// only filename will be returned
		System.out.println("File1:	" + FilenameUtils.getName(absolutePath1));
		System.out.println("File2:	" + FilenameUtils.getName(absolutePath2));

		// get extension
		String oneExt = FilenameUtils.getExtension(absolutePath1);
		System.out.println("File1 Ext:	" + oneExt);
	}

	public static void main(String[] args) {
		FilenameUtil obj = new FilenameUtil();
		obj.getFileNameFromPath();
	}

}
