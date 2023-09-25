package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {

	WebDriver driver;

	@Parameters({ "browserType" })
	@BeforeMethod
	public void setUp(String browserType) throws MalformedURLException {
		DesiredCapabilities capabilities = null;

		if (browserType.equalsIgnoreCase("android")) {
			System.out.println("android");

			capabilities = new DesiredCapabilities();
			capabilities.setCapability("appium-version", "1.4.13");
			
			capabilities.setCapability("platformName", "Android");
			
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("deviceName",
					"AVD_for_Nexus_5_by_Google");
			// capabilities.setCapability("app", userDir +
			// "/src/test/resources/fixtures/Grindr_Android_Debug_668.apk")
			// capabilities.setCapability("appPackage",
			// "com.grindrapp.android");

			AndroidDriver driver = new AndroidDriver(new URL(
					"http://0.0.0.0:4723/wd/hub"), capabilities);
			
			
			
/*
			File appDir = new File("{pathApk file}");
			File app = new File(appDir, "{APK file Name}"); // my case
															// �demo1.apk�
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("device", "Android");
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability(CapabilityType.VERSION, "4.2");
			capabilities.setCapability(CapabilityType.PLATFORM, "WINDOW");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("app-package", "{app package name}"); // my
																				// case
																				// com.gorillalogic.monkeytalk.demo1
			capabilities
					.setCapability("app-activity", ".{main activity class}"); // my
																				// case
																				// RootActivity
			driver = new RemoteWebDriver(
					new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

			capabilities = new DesiredCapabilities();
			// capabilities.setCapability("BROWSER_NAME", "Android");
			capabilities.setCapability("VERSION", "4.4.2");
			capabilities.setCapability("deviceName", "Emulator");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPakage", "com.android.calculator2");
			capabilities.setCapability("appActivity",
					"com.android.calculator2.Calculator");
			driver = new RemoteWebDriver(
					new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			// driver = new RemoteWebDriver(new
			// URL("http://192.168.2.102:4723/wd/hub"), capabilities);

			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
					"4.4.2");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
					"Android");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
					"AndroidPhone");

			// capabilities.setCapability(
			// MobileCapabilityType.BROWSER_NAME, "Chrome");
			// capabilities.setCapability("avd", "AndroidPhone");
			// capabilities.setCapability(
			// MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10 * 60);
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
					capabilities);
			((AppiumDriver) driver).context("NATIVE_APP");
			((AppiumDriver) driver).rotate(ScreenOrientation.PORTRAIT);
			((AppiumDriver) driver).context("WEBVIEW_1");
*/
		} else {
			System.out.println("Browser not selected");
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


	public void test1() throws MalformedURLException, InterruptedException {
		driver.navigate().to("https://xebialabs.com/");
		Thread.sleep(60000);
		driver.findElement(By.id("search")).sendKeys("Hello Xebia");
		System.out.println("Test1:" + Thread.currentThread().getId());
		driver.close();
	}

}