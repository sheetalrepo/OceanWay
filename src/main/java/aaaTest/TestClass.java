package aaaTest;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.stream.Stream;

import org.apache.commons.lang3.time.FastDateFormat;
import org.joda.time.DateTime;

public class TestClass {

	public void abc() {
		LocalDateTime d1 = LocalDateTime.now().withDayOfMonth(1).minusDays(63);
		System.out.println(d1);
		
		LocalDateTime d2 = LocalDateTime.now().withDayOfMonth(1).minusMonths(2);
		System.out.println(d2);
	
		LocalDateTime d3 = LocalDateTime.now().minusMonths(2);
		System.out.println(d3);
		
		LocalDate d4 = LocalDate.of(2021, Month.FEBRUARY, 15);
		LocalDate d5 = d4.minusMonths(2);
		System.out.println(">>>"+d5);
		
		
		LocalDateTime.now();
		
		
	}

	
	public void xyz() throws ParseException {
		DateTime now = new DateTime();
		Date d1 = now.minusMonths(2).toDate();
		System.out.println(d1);
		
		//DateTime now = new DateTime();
		Date d2 = now.minusDays(2).toDate();
		System.out.println(d2);
		
		
//		FastDateFormat DATE_FORMAT = FastDateFormat.getInstance("dd-MM-yy HH:mm");
//		Date parsedDate = DATE_FORMAT.parse("28-07-21 10:55");
//		System.out.println(parsedDate);
	}
	
	
	 private int extractNumeric(String dateStr) {
	        return Integer.parseInt(dateStr.replaceAll("[^0-9]", ""));
	    }
	 
	 
	 public void stringMatch() {
		 String str = "112";
		 String val2 = "112";
		 String val3 = "112";
		 String val1 = "113";
		 
		 if (Stream.of("112", "112", "113").allMatch(str::equalsIgnoreCase)) {
			 System.out.println("i...");
		}
		 
		 if (str.matches("val1|val2|val3")) {
			 System.out.println("Hi");
		 }
		 System.out.println("H2i");
	 }
	 
	public static void main(String[] args) throws ParseException {
		TestClass obj = new TestClass();
//		obj.abc();
//		obj.xyz();
		obj.stringMatch();
	}

}

/*

27 Jul - 2month == May



*/