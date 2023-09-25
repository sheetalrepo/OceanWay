package classes.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;

/**
 * String builder is better when too much string operation is required
 */
public class StringPerformanceTest {

	
	public void useString() throws IOException {
		String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\classes\\string\\bigstring.txt";
		File file = new File(filepath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		
		String oneline = null;
		String str;
		System.out.println("Start time: "+LocalTime.now());
		while((str = br.readLine())!=null) {
			oneline += str;
		}
		br.close();

		System.out.println("String Length: "+oneline.length());
		System.out.println("End time: "+LocalTime.now());
	}
	
	public void useStringBuilder() throws IOException {
		String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\classes\\string\\bigstring.txt";
		File file = new File(filepath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		
		StringBuilder sb = new StringBuilder();
		String str;
		System.out.println("SB Start time: "+LocalTime.now());
		while((str = br.readLine())!=null) {
			sb.append(str);
		}
		br.close();

		System.out.println("String length: "+sb.length());
		System.out.println("SB End time: "+LocalTime.now());
	}
	
	public static void main(String[] args) throws IOException {
		StringPerformanceTest obj = new StringPerformanceTest();
		obj.useString();
		System.out.println("-------------------------------");
		obj.useStringBuilder();
	}

}
