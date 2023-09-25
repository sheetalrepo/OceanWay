package java11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * Read Files Write Files Java 11
 *
 */
public class FileExamples {

	public static void readFile() throws IOException {
		FileReader fr = new FileReader("src//main//java//java11//Java11.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();

		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}

		br.close();
		System.out.println("===== * ===== * =====");
	}
	
	public static void readFileJava11() throws IOException {
		String str = "src//main//java//java11//Java11.txt";
		Path path = Paths.get(str);
		String content = Files.readString(path);
		System.out.println(content);
		System.out.println("===== * ===== * =====");
	}

	public static void writeFile() throws IOException {
		String str = "Hello World !!!";
		FileWriter fw = new FileWriter("src//main//java//java11//abc.txt");
		fw.write(str);
		fw.close();
		System.out.println("File Written Successfully ...");
		System.out.println("===== * ===== * =====");
	}

	public static void writeFileJava11() throws IOException {
		String str = "Hello World !!!";
		Path path = Paths.get("src//main//java//java11//abc.txt");
		Files.writeString(path, str, StandardOpenOption.CREATE);
		//Files.writeString(path, str, StandardOpenOption.APPEND);
		
		
		System.out.println("File Written Successfully ...");
		System.out.println("===== * ===== * =====");
	}
	
	public static void main(String[] args) throws IOException {
		readFile();
		//readFileJava11();
		//writeFile();
		//writeFileJava11();
	}

}
