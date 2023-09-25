package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import com.google.common.base.Throwables;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class GetLatestDownloadedFile {

	/**
	 * This method will return latest downloaded file(with given extension) in
	 * given folder String : *.pdf, *.xls etc
	 */
	public String getTheNewestFilePath(String typeOfFile) {
		try {
			String filePath = getUserDownloadPath();
			Thread.sleep(30000);
			File latestFile;
			String absolutePath = "";
			File dir = new File(filePath);
			FileFilter fileFilter = new WildcardFileFilter(typeOfFile);
			File[] files = dir.listFiles(fileFilter);

			if (files.length > 0) {
				Arrays.sort(files,
						LastModifiedFileComparator.LASTMODIFIED_REVERSE);
				latestFile = files[0];
				absolutePath = latestFile.getAbsolutePath();
			}
			return absolutePath;
		} catch (Exception e) {
			throw Throwables.propagate(e);
		}
	}

	public static String getUserDownloadPath() {
		return System.getProperty("user.home") + "\\Downloads";
	}

	
	public String locateLastestDownloadedFileFromBrowser(String fileExtension) throws InterruptedException, JsonIOException, JsonSyntaxException, FileNotFoundException {
		String newFileName;
		String fileLocation = null;

		String userOS = System.getProperty("os.name");
		String loginUser = System.getProperty("user.name");
		String browserName = System.getProperty("platform");
		Thread.sleep(5000);

		if (browserName.contains("firefox")) {
			try {
				fileLocation = "C:/Users/" + loginUser + "/Downloads";
			} catch (Exception e) {
				e.printStackTrace();
			}
			newFileName = getTheNewestFilePath(fileExtension).toString();
			return newFileName;
		} else if (browserName.contains("chrome")) {
			JsonParser parser = new JsonParser();
			JsonElement pathToDownloadDirectoryInJasonFile;
			JsonObject jsonObj;
			String actualPathOfFileDownloaded;
			Object parserObj;

			if (userOS.contains("Win")) {
				File f = new File("C://Users//"+ loginUser+ "//AppData//Local//Google//Chrome//USERDA~1//Default//Preferences");
				parserObj = parser.parse(new FileReader(f));
			} else {
				File f = new File("/USER_HOME_FOLDER/.config/chromium/Default/Preferences");
				parserObj = parser.parse(new FileReader(f));
			}
			JsonObject jsonObject = (JsonObject) parserObj;
			pathToDownloadDirectoryInJasonFile = jsonObject.get("download");
			jsonObj = pathToDownloadDirectoryInJasonFile.getAsJsonObject();
			actualPathOfFileDownloaded = jsonObj.get("default_directory")
					.toString().replace('"', ' ').trim();
			fileLocation = actualPathOfFileDownloaded;

		}
		newFileName = getTheNewestFilePath(fileLocation).toString();
		return newFileName;
	}

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException, InterruptedException {
		GetLatestDownloadedFile obj = new GetLatestDownloadedFile();
		String fileName = obj.getTheNewestFilePath("*.pdf");
		System.out.println("Latest File downloaded in Download folder: "+ fileName);

		obj.locateLastestDownloadedFileFromBrowser("xls");

	}

}
