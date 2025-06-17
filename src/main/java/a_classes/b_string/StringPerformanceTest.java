package a_classes.b_string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

/**
 * String builder is better when too much string operation is required
 */
public class StringPerformanceTest {

	
	public void useString() throws IOException {
		String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\a_classes\\b_string\\bigstring.txt";
		File file = new File(filepath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		
		String oneline = null;
		String str;
		LocalTime t1 = LocalTime.now();
		while((str = br.readLine())!=null) {
			oneline += str;
		}
		br.close();
		LocalTime t2 = LocalTime.now();
		Duration duration = Duration.between(t1, t2); // Compute difference
		System.out.println("String: Difference in Nano sec: " + duration.getNano());
	}
	
	public void useStringBuilder() throws IOException {
		String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\a_classes\\b_string\\bigstring.txt";
		File file = new File(filepath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		
		StringBuilder sb = new StringBuilder();
		String str;
		LocalTime t1 = LocalTime.now();
		while((str = br.readLine())!=null) {
			sb.append(str);
		}
		br.close();
		
		LocalTime t2 = LocalTime.now();
		Duration duration = Duration.between(t1, t2); // Compute difference
		System.out.println("SB    : Difference in Nano sec: " + duration.getNano());
	}
	
	public static void main(String[] args) throws IOException {
		StringPerformanceTest obj = new StringPerformanceTest();
		obj.useString();
		obj.useStringBuilder();
	}

}
