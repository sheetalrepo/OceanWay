package classes.date;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * This class is used to format monetary amounts 
 * Default round off rule: round off if number is 6 or above e.g. 10.16 = 10.20
 * 
 * src: http://tutorials.jenkov.com/java-internationalization/decimalformat.html
 */
public class DecimalFormatExamples {

	
	public static void basicTest(double d){
		System.out.println("----------------------------Basic Test------------------------------------------");
		String pattern = "###,###.###";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String formatOrig = decimalFormat.format(d);
		System.out.println(formatOrig);  // 123,456,789.126
		
		//pattern updated in between
		decimalFormat.applyPattern("##.##");
		String formatUpdated = decimalFormat.format(d);
		System.out.println(formatUpdated);  // 123456789.13  <- v.imp  xxx.1256 started round off from right most digit
	}
	
	
	
	public static void localeTest(String language, String country){
		System.out.println("----------------------------Locale Test------------------------------------------");
		Locale locale  = new Locale(language, country);
		String pattern = "###.##";

		DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getNumberInstance(locale);
		decimalFormat.applyPattern(pattern);

		String format = decimalFormat.format(123456789.123);
		System.out.println(format);
	}
	
	
	
	
	public static void understandingPatterns(){
		System.out.println("----------------------------Different Patterns------------------------------------------");
		DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
		System.out.println("round off till 3 digit and comma: "+decimalFormat.format(123456.55677));
		
		decimalFormat.applyPattern("#.#");
		System.out.println("round of till 1 digit: "+decimalFormat.format(88.56));  //88.6
		System.out.println("padding with zeros: "+decimalFormat.format(.56)); //088.6

		
		decimalFormat.applyPattern("000.#");  //append 0 if left of decimal is less
		System.out.println("padding with zeros: "+decimalFormat.format(88.56)); //088.6
		System.out.println("padding with zeros: "+decimalFormat.format(.56)); //088.6
		
		
	}
	
	
	
	public static void understandingImportantMethods(){
		System.out.println("----------------------------Imp Methods------------------------------------------");
		
		//grouping
		DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
		System.out.println("before grouping: "+decimalFormat.format(123456.55677));   //123,456.557
		decimalFormat.setGroupingSize(1);
		System.out.println("after grouping: "+decimalFormat.format(123456.55677));  //1,2,3,4,5,6.557
		

		
		
		
		
	}
	
	
	
	
	
	public static void numberFormattingAsPerDecimal(String num, int decposition)
	{
		double d = Double.parseDouble(num);
		DecimalFormat decimalFormatter = new DecimalFormat("#,##.##");
		//decimalFormatter.setRoundingMode(RoundingMode.CEILING); //>>8,78,67.510
		//decimalFormatter.setRoundingMode(RoundingMode.DOWN); //>>8,78,67.509
		decimalFormatter.setRoundingMode(RoundingMode.UP); //>>8,78,67.510
		decimalFormatter.setMaximumFractionDigits(decposition);
		decimalFormatter.setMinimumFractionDigits(decposition);
		String result = decimalFormatter.format(d);
		System.out.println(">>"+result);
	}
	
	
	public static void main(String[] args) {
		
		DecimalFormatExamples.basicTest(123456789.1256);
		DecimalFormatExamples.localeTest("en", "UK");
		DecimalFormatExamples.localeTest("da", "DK");  // see comma in output
		DecimalFormatExamples.understandingPatterns();
		DecimalFormatExamples.understandingImportantMethods();
		
		//DecimalFormatExamples.numberFormattingAsPerDecimal("87867.5099", 3);
	

	}

}
