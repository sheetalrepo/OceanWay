package grid;

import io.appium.java_client.remote.MobileCapabilityType;

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

public class MultipleBrowser {

	WebDriver driver;

	@Parameters({ "browserType" })
	@BeforeMethod
	public void setUp(String browserType) throws MalformedURLException {
		URL hubUrl=null;
		DesiredCapabilities capabilities=null;

		if(browserType.equalsIgnoreCase("firefox")){
			hubUrl = new URL("http://localhost:4444/wd/hub");
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);			
		}else if(browserType.equalsIgnoreCase("chrome")){
			hubUrl = new URL("http://localhost:4444/wd/hub");
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);			
		}else if(browserType.equalsIgnoreCase("ie")){
			hubUrl = new URL("http://localhost:4444/wd/hub");
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("internet explorer");
			capabilities.setPlatform(Platform.WINDOWS);
		}else if(browserType.equalsIgnoreCase("android")){
		    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				    "4.4");
			    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				    "Android");
			    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				    "LG Nexus 4 Emulator");
			    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
				    "Chrome");
			    // capabilities.setCapability("avd", "AndroidPhone");
			    // capabilities.setCapability(
			    // MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10 * 60);

		}else{
			System.out.println("Browser not selected");
		}

		driver = new RemoteWebDriver(hubUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	   public void tearDown() {
	      driver.quit();
	}

	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		driver.navigate().to("https://xebialabs.com/");
		driver.findElement(By.id("search")).sendKeys("Hello Xebia");
		Thread.sleep(15000);
		System.out.println("Test1:"+Thread.currentThread().getId());
		driver.close();
	}

	
	@Test
	public void test2() throws MalformedURLException, InterruptedException {
		driver.navigate().to("https://in.yahoo.com/?p=us");
		driver.findElement(By.id("UHSearchBox")).sendKeys("Hello Yahoo");
//		Thread.sleep(10000);
		System.out.println("Test2:"+Thread.currentThread().getId());
		driver.close();
	}
	
	
	@Test
	public void test3() throws MalformedURLException, InterruptedException {
		driver.navigate().to("http://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hello Amazon");
//		Thread.sleep(10000);
		System.out.println("Test3:"+Thread.currentThread().getId());
		driver.close();
	}
	
}