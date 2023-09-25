package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * code not working, writing junk char
 */
public class FileInputOutputStream {

	public void readandwritefile() throws FileNotFoundException, IOException {

		FileInputStream fin = new FileInputStream(
				System.getProperty("user.dir")
						+ "/src/main/java/file/inputstream.dat");

		FileOutputStream fout = new FileOutputStream(
				System.getProperty("user.dir")
						+ "/src/main/java/file/outputstream.dat");
		
		int i = 0;
		int c = 1;
		while ((i = fin.read()) != 1) {
			c++;
			fout.write( i);
			if (c > 100) {
				break;
			}
		}
		fin.close();
		fout.close();
	}

	public static void main(String[] args) {

		FileInputOutputStream obj = new FileInputOutputStream();
		try {
			obj.readandwritefile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
