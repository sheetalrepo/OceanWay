package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * used to read and write primitive data from and to stream
 */
public class DataInputOutputStream {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		FileOutputStream fout = new FileOutputStream("datastream.dat");
		DataOutputStream dout = new DataOutputStream(fout);
		dout.writeDouble(10.50);
		dout.writeBoolean(true);
		dout.close();

		FileInputStream fin = new FileInputStream("datastream.dat");
		DataInputStream din = new DataInputStream(fin);

		double d = din.readDouble();
		boolean b = din.readBoolean();

		System.out.println(d + "  -  " + b); // 10.5 - true
		din.close();
	}
}
