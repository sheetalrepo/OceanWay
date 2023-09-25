package classes.differentuserinput;

import java.util.Scanner;

public class ScannerKeyboardReading {

	public void getAverage() {
		Scanner sc = new Scanner(System.in);
		int sum = 0, counter = 0;
		System.out
				.println("Enter nos, space sepatated and to get average press: r");
		while (sc.hasNextInt()) {
			counter++;
			sum = sum + sc.nextInt();
		}
		System.out.println("Avg:" + sum / counter);
		sc.close();
	}

	
	public static void main(String[] args) {
		ScannerKeyboardReading obj = new ScannerKeyboardReading();
		obj.getAverage();
	}
}
