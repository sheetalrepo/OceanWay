package classes.differentuserinput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDelimiter {

	public void stringPattern() {
		String path = System.getProperty("user.dir") + "/src/main/java/classes/reading/scannerdelimiter.txt";
		
		try {
			FileWriter fw = new FileWriter(path);
			fw.write("10,20,30,40,50");
			fw.close();

			FileReader fr = new FileReader(path);
			Scanner sc = new Scanner(fr);

			sc.useDelimiter(", *");

			int sum = 0, count = 0;
			while (sc.hasNext()) {
				if (sc.hasNextInt()) {
					count++;
					sum = sum + sc.nextInt();
				}
			}
			sc.close();
			System.out.println("Avg:" + sum / count);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ScannerDelimiter obj = new ScannerDelimiter();
		obj.stringPattern();
	}
}
