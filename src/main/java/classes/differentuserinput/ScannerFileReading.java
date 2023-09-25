package classes.differentuserinput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerFileReading {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader(System.getProperty("user.dir")
					+ "/src/main/java/classes/reading/scanner.txt");

			Scanner sc = new Scanner(fr);
			int sum = 0, counter = 0;
			while (sc.hasNextInt()) {
				counter++;
				sum = sum + sc.nextInt();
			}
			System.out.println("Avg:" + sum / counter);
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
