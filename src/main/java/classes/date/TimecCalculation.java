package classes.date;
import java.time.Duration;
import java.time.Instant;

public class TimecCalculation {

	public static void main(String[] args) throws InterruptedException {
		
		
		boolean flag = true;
		
		Instant start = Instant.now();
		System.out.println("start time: "+start); 

		int i =0;
		while(flag){
			System.out.println(flag);
			
			i=i+10;
			Thread.sleep(10000);
			System.out.println("counter >>" +i);
			
			Instant end = Instant.now();
			Duration timeElapsed = Duration.between(start, end);
			long min = timeElapsed.toMinutes();
			System.out.println("Time elapsed till now: >>>"+min);
			

			if(min > 1){ //1 min
				System.out.println("more than 1 min");
				flag = false;
			}
			
		}
		//Working Fine
		
		Instant finish = Instant.now();
		Duration timeElapsed = Duration.between(start, finish);
		System.out.println("Total Finished Time: "+timeElapsed.toMillis());
		System.out.println("Total Finished Time: "+timeElapsed.toMinutes());
	}

}

//300000  = 5 min