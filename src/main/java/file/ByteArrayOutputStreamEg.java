package file;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * not working
 */
public class ByteArrayOutputStreamEg {

	public static void main(String[] args) {
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(100);

			FileOutputStream fout1 = new FileOutputStream(
					"/home/xebia/workspace/OceanWay/src/main/java/file/byteoutstream1.dat");
			FileOutputStream fout2 = new FileOutputStream(
					"/home/xebia/workspace/OceanWay/src/main/java/file/byteoutstream2.dat");

			bout.writeTo(fout1);
			bout.writeTo(fout2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
