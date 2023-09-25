package classes.date;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * java.time.* is new Java 8 feature
 */
public class Java8_LocalDate {
	
	static Logger logger = LoggerFactory.getLogger(Java8_LocalDate.class);
	
	public static void main(String[] args) {
		//Eg 1
		LocalDate localDate = LocalDate.now();
		logger.info("local date: "+localDate);  //2018-02-04
		String formattedDate = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate);
		logger.info("formatted date: "+formattedDate); //2018/02/04
		
		
	
		//Eg 2A
		String futureDate = LocalDate.now().plusDays(10).toString();
		String backDate = LocalDate.now().minusDays(10).toString();

		boolean futureFlag = LocalDate.parse(futureDate).isAfter(LocalDate.now());
		boolean backFlag = LocalDate.parse(backDate).isBefore(LocalDate.now());
		
		logger.info("Future: "+futureFlag);
		logger.info("Back: "+backFlag);

		
		//Eg 2B
		LocalDateTime d1 = LocalDateTime.now().withDayOfMonth(1).minusDays(10);
		System.out.println("Current date set to 1st of Month:"+d1);
		
		LocalDateTime d2 = LocalDateTime.now().minusMonths(2);
		System.out.println("Months Minus: "+d2);
	
		LocalDate d3 = LocalDate.of(2021, Month.APRIL, 30).minusMonths(2);
		System.out.println("It will automatically handle edge cases like 29 Feb etc: "+d3);
		

		//Eg 3
		LocalDate firstDay_2018 = LocalDate.of(2018, Month.JANUARY, 1);
		logger.info("Specific Date: "+firstDay_2018); //2018-01-01


		//Eg 4
		try{
			LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
		}catch (DateTimeException e){
			logger.error(e.getMessage()+e);
		}


		//Eg 5
		LocalDate hundredthDayOfYear2014 = LocalDate.ofYearDay(2014, 100);
		logger.info("100th day of 2014="+hundredthDayOfYear2014);  // 2014-04-10

		
				
		//Eg 6
		String strDate=LocalDate.now().toString();
		logger.info("Date in string: {} ",strDate);		
		
		
		//Eg 7 : Convert String to LocalDate obj
		String strDateEg = "2018-03-23";
		LocalDate ld1 = LocalDate.parse(strDateEg);
		logger.info(">>> ="+ ld1);
		
		
		//Eg 8 : Convert String to LocalDate obj using Formatter
		String strDateEg2 = "23-Mar-2018";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate ld2 = LocalDate.parse(strDateEg2,formatter);
		logger.info(">>>>>>>> ="+ ld2);
		
	}

}
