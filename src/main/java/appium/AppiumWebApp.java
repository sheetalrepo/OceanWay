package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * https://discuss.appium.io/t/not-able-to-open-the-chrome-browser-in-android-emulator/3940/2
 * https://www.youtube.com/watch?v=b9fmf9Ka6Zw
 */
public class AppiumWebApp {

	AppiumDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		File appDir = new File("/path/to/apk/qa/appium/apkdir");
		File app = new File(appDir, "Chrome.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "Chrome");
//		capabilities.setCapability("browserName", "Browser");
//		capabilities.setCapability("device", "Android");
		capabilities.setCapability("device", "android");
//		capabilities.setCapability("deviceName", "10.0.0.3:5554"); // ???
		capabilities.setCapability("deviceName", "emulator-5554");
//		capabilities.setCapability("deviceName", "Emulator");
		
//		AVD_for_Nexus_5_by_Google
		capabilities.setCapability("platformVersion", "6.0"); // ???
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
		
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
//		driver = new AndroidDriver(new URL("http://0.0.0.0:9515/wd/hub"),capabilities);
		driver.get("https://www.google.co.in/");
	}

	@Test
	public void abc() throws InterruptedException{
		System.out.println("********************************************");
		Thread.sleep(10000);
		driver.context("");
//		driver.get("https://www.google.co.in/");
	}

	@AfterMethod
	public void a() {
//		driver.quit();
	}

}
