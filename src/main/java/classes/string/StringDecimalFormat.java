package classes.string;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringDecimalFormat {

	private static final Logger logger = LoggerFactory.getLogger(StringDecimalFormat.class);
	
	
	/**
	 * decimal digits 6 and above will be added in previous number for round off rule
	 */
	public static void convertStringToGivenDecimalPlaces(String amt, int position) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(position);
		String str = df.format(Float.parseFloat(amt)).trim();
		logger.info("String with given decimal places >>"+ str);
    }
	
	
	public static void convertStringToGivenDecimalPlaces2(String amt, int position) {
		double d = Double.parseDouble(amt);
		DecimalFormat decimalFormatter = new DecimalFormat("###.##");
		decimalFormatter.setRoundingMode(RoundingMode.DOWN);
		decimalFormatter.setMaximumFractionDigits(position);
		decimalFormatter.setMinimumFractionDigits(position);
	
		String str = decimalFormatter.format(d);
		System.out.println("String with given decimal places >>"+ str);
    }
	

	
	public static void main(String[] args) {
		convertStringToGivenDecimalPlaces("100.50635", 4);
		//convertStringToGivenDecimalPlaces2("89.956",5);

	}

}
