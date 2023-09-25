package classes.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Epoch time : time since 01 01 1970
 * @author Sheetal_Singh
 *
 */
public class EpochTime {

	public static void getCurrentEpochTime(){
		long ut1 = Instant.now().getEpochSecond();
		long ut2 = System.currentTimeMillis() / 1000L;
		Date now = new Date();
	    long ut3 = now.getTime() / 1000L;
	    
		System.out.println(ut1);
	    System.out.println(ut2);
	    System.out.println(ut3);
	}
	
	public static void epochTimeToLocalDateTimeCalculations(){
		long epochTimeInSeconds1 = 1622025802;
        long epochTimeInSeconds2 = 1623235402;
        long epocTimeInSecondsNow = Instant.now().getEpochSecond();
        
        LocalDateTime startTime = Instant.ofEpochSecond(epochTimeInSeconds1).atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime endTime = Instant.ofEpochSecond(epochTimeInSeconds2).atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime now = Instant.ofEpochSecond(epocTimeInSecondsNow).atZone(ZoneId.systemDefault()).toLocalDateTime();
        
           
        System.out.println("Start Time: "+startTime);
        System.out.println("End Time: "+endTime);
        System.out.println("Current Time: "+now);     

        long timeDiffInHours = ChronoUnit.MINUTES.between(startTime, endTime);
        System.out.println("Minutes between start and end time: " +timeDiffInHours);  // 5 Hrs
        
        long timeDiffInSeconds = ChronoUnit.SECONDS.between(startTime, now);
        System.out.println(timeDiffInSeconds); 
	}
	
	public static void epochTimeToLocalDate(){
		long epocTimeInSecondsNow = Instant.now().getEpochSecond();
		LocalDate date1 = Instant.ofEpochSecond(epocTimeInSecondsNow).atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate date2 = Instant.ofEpochMilli(epocTimeInSecondsNow * 1000L).atZone(ZoneId.systemDefault()).toLocalDate();

		System.out.println(date1);        
        System.out.println(date2);
	}
	
	
	public static void main(String[] args) {
		//getCurrentEpochTime();
		epochTimeToLocalDateTimeCalculations();
		//epochTimeToLocalDate();
	}

}
