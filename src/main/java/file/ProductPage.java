package file;

import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.util.List;
import java.io.File;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * java -jar fkmoznew.jar https://www.flipkart.com/ shoes
 * /Users/sheetalsingh/Documents/abc.csv
 * 
 * tried to run jmeter script using java jar
 * java jar will give me new href(in a file) of fk search page at run time
 * then jmeter will hit each href and do performance  testing
 * 
 * not successful 
 * 
 */
public class ProductPage {

	static WebDriver driver;
	static List<WebElement> products;
	static String domainName, keyword, productsPath;

	public static void main(String args[]) throws InterruptedException, FileNotFoundException {

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/sheetalsingh/Downloads/chromedriver");
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		domainName = args[0];
		keyword = args[1];
		productsPath = args[2];
		System.out.println("Entered Values: " + domainName + " " + keyword + " " + productsPath);

		driver.get(domainName);
		driver.findElement(By.name("q")).sendKeys(keyword);
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(2000);

		System.out.println("Finding elements on search page ...");

		products = driver.findElements(By.xpath("//a[@class='_2cLu-l']"));
		System.out.println("No. of items on page: " + products.size());

		PrintWriter pw = new PrintWriter(new File(productsPath));
		StringBuilder sb = new StringBuilder();

		int i = 1;
		for (WebElement element : products) {
			System.out.println(i);
			String href = element.getAttribute("href").replaceAll("https://www.flipkart.com", "");
			sb.append(href);
			sb.append('\n');
			i++;
		}

		System.out.println("Writing to file ...");
		pw.write(sb.toString());
		pw.close();
		driver.quit();

	}

}
