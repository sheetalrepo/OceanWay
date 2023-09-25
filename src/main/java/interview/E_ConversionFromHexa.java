package interview;

import java.util.Scanner;

public class E_ConversionFromHexa {

	public void hexaToOthers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexa:");

		String hexa = sc.nextLine();
		int dec = Integer.parseInt(hexa, 16);
		System.out.println("Decimal: " + dec);
		System.out.println("Binary: " + Integer.toBinaryString(dec));
		System.out.println("Octa: " + Integer.toOctalString(dec));
	}

	public static void main(String[] args) {
		E_ConversionFromHexa obj = new E_ConversionFromHexa();
		obj.hexaToOthers();
	}
}

//Enter Hexa: a
//Decimal: 10
//Binary: 1010
//Octa: 12
