package classes.general;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RoundOff {

	
	public static void convertStrToDecimalUsingCeiling(String amount) {
		DecimalFormat df = new DecimalFormat("###.##");
		df.setRoundingMode(RoundingMode.CEILING);
		String str = df.format(Float.parseFloat(amount)).trim();
		System.out.println(">>> "+str);
	}
	
	
	
	public static void getRoundOff(double value, int decimal, String initialFormat) {
		
		String inputNum = String.valueOf(value);
		System.out.println("Given Number:" + inputNum);
		String[] str = inputNum.split("\\.");
		DecimalFormat df;
		int loop;
		double roundoffValue;
		
		if (str[1].length() > 2) {
			loop = str[1].length() - decimal;
			String format = initialFormat;
			for (int i = 1; i <= loop; i++)
				format = format + "#";
			
			roundoffValue = value;
			
			for (int i = loop; i >= 1; i--) {
				format = format.substring(0, format.length() - 1);
				df = new DecimalFormat(format);
				df.setRoundingMode(RoundingMode.HALF_UP);
				roundoffValue = Double.parseDouble(df.format(roundoffValue));
				System.out.println("roundoff with [" + i + "] >> " + roundoffValue);
			}
		} else {
			roundoffValue = value;
		}
		
		System.out.println("Final RoundOff Amount:  "+roundoffValue);
	}
	
	public static void main(String[] args) {
		convertStrToDecimalUsingCeiling("40.3452");
		getRoundOff(50.5667, 2, "###.##");
		
		
	}

}
