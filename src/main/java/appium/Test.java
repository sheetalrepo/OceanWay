package appium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	WebDriver driver;

	public Test() {
		// driver = new FirefoxDriver();
	}

	public void abc() {
		driver.findElement(By.linkText("Profiles")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("New Profile")).click();
	}

	public void def() {
		// String timeStamp = new
		// SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		// System.out.println(timeStamp);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, 4);
		String timeStr = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
		System.out.println(timeStr);

	}

	
	public void xyz(int a){
		System.out.println("Int *****");
	}

	
	public void xyz(short a){
		System.out.println("long ******");
	}

	
	
	public static void main(String args[]) {
		Test obj = new Test();
		// obj.abc();
		//obj.def();
		byte a=10;
		obj.xyz(a);
	}

}
