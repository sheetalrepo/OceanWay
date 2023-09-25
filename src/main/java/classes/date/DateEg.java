package classes.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateEg {

	static Logger logger = LoggerFactory.getLogger(DateEg.class);
	
	
	public static void abc() {
		Date date = new Date();
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // yyMMdd
		String formattedDate = sdf.format(date);
		logger.info(formattedDate);  			//	2018/01/05 12:57:48
	}
	
	@SuppressWarnings("deprecation")
	public static void getAge() {
		Date birth = new Date(1985,1,23);
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		
		System.out.println(currentDate.getYear()+1900);
		System.out.println(birth.getYear());
		
		
		int s = currentDate.getYear() - birth.getYear();
		System.out.println(s+1900);
		
	}
	
	
	
	public static void getAgeNew() {
		Date birth = new Date(85,1,23);
		LocalDate birthDate = birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(birthDate);

		
		LocalDate currentDate = LocalDate.now();
		
		
		Period period = Period.between(birthDate, currentDate);
		int years = period.getYears();
		
		System.out.println(years);
		
	}
	
	
	public static void main(String[] args) {
		//abc();	
		//getAge();
		
		getAgeNew();
		
	}
	
	
	
	
	
}
