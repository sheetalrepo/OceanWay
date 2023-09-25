package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Gecko driver: https://github.com/mozilla/geckodriver/releases
 *
 */
public enum DriverRepo {

	FIREFOX {
		public WebDriver getDriver() {
			String current_os = System.getProperty("os.name");
			System.out.println("FF Running on OS: "+current_os);
			System.out.println(current_os);
			if (current_os.equals("Mac OS X")) {
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/drivers/geckodriver");
			} else if (current_os.contains("Windows")) {
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.gecko.driver", path+"\\src\\test\\resources\\drivers\\gecko_driver_23_32bit.exe"); //ff browser v63
			} else {
			}
			return new FirefoxDriver();
		}

	},
	CHROME {
		public WebDriver getDriver() {
			System.out.println(">>>>>>>>>>>>>>>>>>1");
			String current_os = System.getProperty("os.name");
			System.out.println("Chrome Running on OS: "+current_os);
			if (current_os.equals("Mac OS X")) {
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver3");
				return new ChromeDriver();
			} else if (current_os.contains("Windows")) {
				System.out.println(">>>>>>>>>>>>>>>>>>2");
				
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\src\\test\\resources\\drivers\\chrome_driver_244_32bit.exe"); //chrome browser v70
			} else {
				System.out.println(">>>>>>>>>>>>>>>>>>3");
			}
			return new ChromeDriver();
		}
	};

	WebDriver driver;

	DriverRepo(WebDriver drv) {
		this.driver = drv;
	}

	DriverRepo() {}

	public WebDriver getDriver() {
		return driver;
	}

}