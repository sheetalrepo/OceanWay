package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * this is character stream classes
 * 
 * FileWrite/Reader is a connection stream which connect to a actual file
 * BufferedWriter/Reader is a chain stream which connect to FileWriter/Reader stream
 * 
 * FileWriter used when reader is a non java application like spread sheet, .net etc
 * else if both ends are JVM based then use FileOutputstream, ObjectOutputStream, see Student class example
 */
public class FileReaderWriter {
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		
		//write a file
		File f = new File("file.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("first line");
		bw.write("\n");
		bw.write("second line");
		bw.write("\n");
		bw.write("third line");
		
		bw.close();
		
		//read a file
		File fl = new File("file.txt");
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}
}
