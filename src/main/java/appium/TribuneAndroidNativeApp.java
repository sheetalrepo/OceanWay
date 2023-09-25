package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TribuneAndroidNativeApp {
	AndroidDriver driver;
	WebDriverWait waitvar;
	DesiredCapabilities caps;

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {
		final File classpathRoot = new File(System.getProperty("user.dir"));
		final File appDir = new File(classpathRoot, "src/main/java/appium/apk");
		final File app = new File(appDir, "apps-ct-release.apk");

		caps = new DesiredCapabilities();
		caps.setCapability("browserName", "");
		caps.setCapability("platform", "ANDROID");
		caps.setCapability("deviceName", "AndroidPhone");
		caps.setCapability("platformVersion", "5.0");
		caps.setCapability("autoWebview", "true");

		caps.setCapability("appPackage", "com.apptivateme.next.ct");
		caps.setCapability("appActivity", "com.tribune.universalnews.onboarding.OnboardingActivity");
		caps.setCapability("app", app.getAbsolutePath());

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		WebDriverWait waitvar = new WebDriverWait(driver, 30);
		Thread.sleep(5000);

		waitvar.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']")));
		driver.findElement(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']"))
				.click();
		waitvar.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']")));
		driver.findElement(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']"))
				.click();
		waitvar.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']")));
		driver.findElement(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']"))
				.click();
		waitvar.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']")));
		driver.findElement(
				By.xpath("//android.widget.Button[@resource-id='com.apptivateme.next.ct:id/btn_special_next']"))
				.click();
		waitvar.until(ExpectedConditions.elementToBeClickable(By.id("com.apptivateme.next.ct:id/card_view")));
	}

	@Test
	public void verifyScrollDown() throws IOException, InterruptedException {
		swipeRightToLeft();
		swipeRightToLeft();
		swipeBottomToTop();
		swipeBottomToTop();
		searchForText("US election");
		changeOrientation();
	}

	/*
	 * (0,0) points is top left corner of mobile
	 */
	public void swipeBottomToTop() {
		try {
			driver.context("NATIVE_APP");
			org.openqa.selenium.Dimension size;
			size = driver.manage().window().getSize();
			int fixX = size.width / 2;
			int startY = (int) (size.height * 0.90);
			int endY = (int) (size.height * 0.10);
			driver.swipe(fixX, startY, fixX, endY, 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void swipeRightToLeft() {
		try {
			driver.context("NATIVE_APP");
			org.openqa.selenium.Dimension size;
			size = driver.manage().window().getSize();
			int fixY = size.height / 2;
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.10);
			driver.swipe(startX, fixY, endX, fixY, 200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void changeOrientation() {
		driver.rotate(ScreenOrientation.LANDSCAPE);
		// ((AppiumDriver) driver).rotate(ScreenOrientation.PORTRAIT);
	}

	public void searchForText(String strg) throws IOException, InterruptedException {
		driver.findElement(By.id("com.apptivateme.next.ct:id/search")).click();
		driver.findElement(By.id("com.apptivateme.next.ct:id/search_src_text")).sendKeys(strg + "\n");
		// Process pr = Runtime.getRuntime().exec("adb -s input keyevent
		// KEYCODE_SEARCH");
		// pr.waitFor();
	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}

}
