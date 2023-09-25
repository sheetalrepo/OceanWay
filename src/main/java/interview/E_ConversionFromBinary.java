package interview;

import java.util.Scanner;

/**
 * ref: http://www.thecrazyprogrammer.com/2015/11/program-to-convert-binary-to-decimal-in-java.html
 *
 */
public class E_ConversionFromBinary {

	
	public void binaryToOthers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number:");
		String binaryStr = sc.nextLine();
		
		//First convert Binary to Decimal
		int dec = Integer.parseInt(binaryStr, 2);
		System.out.println("Decimal: " + dec);
		System.out.println("Octal: " + Integer.toOctalString(dec));
		System.out.println("Hexa: " + Integer.toHexString(dec));
	}
	
	/**
	 * 
	 * 1 1 0 = 6
	 * 1(index=2)  1(index=1)  0(index=0)
	 * 
	 * logic:  (1*2^2)+(1*2^1)+(0*2^0)
	 * 
	 * every digit multiply with 2 power (index value)
	 * 
	 */
	public void binaryToDecimalLogic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number:");

		int binaryInt = sc.nextInt();
		System.out.println("Next Int: " + binaryInt);

		int decimal = 0, p = 0;

		while (binaryInt != 0) {
			decimal += ((binaryInt % 10) * Math.pow(2, p));
			binaryInt = binaryInt / 10;
			p++;
		}
		System.out.println(decimal);
	}
	

	public static void main(String args[]) {
		E_ConversionFromBinary obj = new E_ConversionFromBinary();
		obj.binaryToOthers();
		obj.binaryToDecimalLogic();
	}
}
