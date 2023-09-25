package classes.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Julian date started from January 1, 4713 BC and end on Jan 1 ,AD 3268 i.e set of 7980 years
 * 
 * For programming we generally count days from Jan 1 of current year
 * So 32 means Feb 1, 365 means 31 Dec of same year
 * 
 * 18032 means 2018, 1 Feb
 *
 */
public class JulianDateConversion {

	public void convertJulianDateIntoNormalDate(String julianDate, String requiredDateFormat){
		DateFormat sdfInput = new SimpleDateFormat("yyDDD");
		Date date;
		try {
			date = sdfInput.parse(julianDate);
		}
		catch (ParseException e) 
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		DateFormat sdfRequired = new SimpleDateFormat(requiredDateFormat);
		String output = sdfRequired.format(date);
		System.out.println(output);
		
		
		int a = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		JulianDateConversion obj = new JulianDateConversion();
		obj.convertJulianDateIntoNormalDate("18032", "dd-MM-yyyy");  // yyddd
		obj.convertJulianDateIntoNormalDate("18365", "dd/MM/yyyy");  // yyddd
		obj.convertJulianDateIntoNormalDate("18365", "yyyy-MM-dd");
		obj.convertJulianDateIntoNormalDate("18365", "yyyy.MM.dd");
		
		
	}

}
