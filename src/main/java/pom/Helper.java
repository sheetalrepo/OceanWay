package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {

	String server, drv, username, password;
	Properties prop;
	WebDriver driver;

	public void getProperties() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream(
					"/Users/sheetal/Documents/workspace/OceanWay/src/main/java/pom/br.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		server = prop.getProperty("SERVER");
		drv = prop.getProperty("DRIVER");
	}

	public WebDriver getDriver() {
		if (drv.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/sheetalsingh/Downloads/geckodriver");
			return new FirefoxDriver();
		} else if (drv.equals("chrome")) {
			return new ChromeDriver();
		} else {
			System.out.println("Invalid driver");
			return null;
		}
	}
}
