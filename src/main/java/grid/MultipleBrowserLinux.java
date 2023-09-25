package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 * Here we have to use @BeforeMethod rather @BeforeClass else getting "Error communicating with the remote browser. It may have died."
 */
public class MultipleBrowserLinux {

	WebDriver driver;

	@Parameters({ "browserType" })
	@BeforeMethod
	public void setUp(String browserType) throws MalformedURLException {
		URL hubUrl = null;
		DesiredCapabilities capabilities = null;

		if (browserType.equalsIgnoreCase("firefox")) {
			System.out.println("firefox:" + Thread.currentThread().getId());
			hubUrl = new URL("http://localhost:4444/wd/hub");
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.LINUX);
		} else if (browserType.equalsIgnoreCase("chrome")) {
			System.out.println("chrome:" + Thread.currentThread().getId());
			hubUrl = new URL("http://localhost:4444/wd/hub");
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.LINUX);
		} else {
			System.out.println("Browser not selected");
		}

		driver = new RemoteWebDriver(hubUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

//	 @Test
	 public void test1() throws MalformedURLException, InterruptedException {
	 driver.navigate().to("https://xebialabs.com/");
	 driver.findElement(By.id("search")).sendKeys("Hello Xebia");
	 Thread.sleep(15000);
	 System.out.println("Test1:" + Thread.currentThread().getId());
	 driver.close();
	 }

	@Test
	public void test2() throws MalformedURLException, InterruptedException {
		driver.navigate().to("https://www.google.co.in");
//		driver.findElement(By.id("UHSearchBox")).sendKeys("Hello Yahoo");
		 Thread.sleep(10000);
		System.out.println("Test2:" + Thread.currentThread().getId());
		driver.close();
	}

	@Test
	public void test3() throws MalformedURLException, InterruptedException {
		driver.navigate().to("http://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(
				"Hello Amazon");
		 Thread.sleep(10000);
		System.out.println("Test3:" + Thread.currentThread().getId());
		driver.close();
	}
}
