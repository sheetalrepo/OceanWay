package webdriver.image_comparsion;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webdriver.DriverRepo;

public class TakeWebElementScreenshot {

	
WebDriver driver = null;
	
	WebDriver getDriver(){
		if(driver == null){
			System.out.println("Driver is null, hence initializing ...");
			driver = DriverRepo.FIREFOX.getDriver();
			//driver = DriverRepo.CHROME.getDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public void openPage(String url){
		getDriver().get(url);
	}
	
	
	/**
	 * This method will take complete page screenshot
	 * 
	 * In both FF/CR only view port screenshot is captured
	 */
	public void takeCompletePageScreenShot(String screenshot_path) {
		System.out.println("Wait for page to get load");
		try {
			Thread.sleep(2000);

			File screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			BufferedImage completePageImage = ImageIO.read(screenshotFile);

			ImageIO.write(completePageImage, "png", screenshotFile);

			// copy screenshot to given file path
			File screenshotLocation = new File(screenshot_path);
			FileUtils.copyFile(screenshotFile, screenshotLocation);

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	/**
	 * This method will take specific element screenshot and return same
	 * 
	 * For future comparison output of this method will be sent to compare method 
	 * 
	 */
	public BufferedImage takeWebElementScreenshot(WebElement webelement, String screenshot_path)   {
		try {
			System.out.println("Wait for page to get load");
			Thread.sleep(5000);
			File screenshotFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			BufferedImage completePageImage = ImageIO.read(screenshotFile);

			//fetch element dimensions
			Point point = webelement.getLocation();
			int eleWidth = webelement.getSize().getWidth();
			int eleHeight = webelement.getSize().getHeight();
	
			BufferedImage weblementScreenshot= completePageImage.getSubimage(point.getX(), point.getY(),eleWidth, eleHeight);
			ImageIO.write(weblementScreenshot, "png", screenshotFile);
	
			//copy screenshot to given file path
			File screenshotLocation = new File(screenshot_path);
			FileUtils.copyFile(screenshotFile, screenshotLocation);

			return weblementScreenshot;
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

	public void closeDriver(){
		getDriver().close();
	}
	
	public static void main(String[] args) {
		TakeWebElementScreenshot obj = new TakeWebElementScreenshot();
		obj.openPage("https://en.wikipedia.org/wiki/Buddhism");
		
		String fullpath = ".\\src\\main\\java\\solutions\\image_comparsion\\full.png";
		obj.takeCompletePageScreenShot(fullpath);
		
		
		
		//div[@id='mw-content-text']   complete page
		//div[@id='p-logo']/a   logo , visible in view port
		//div[@id='mw-panel']/div[2]/div    left upper pod, visible in view port
		//div[@id='toc']  middle pod : partially visible in view port
		//div[@id='mw-content-text']/div/table  , not visible in view port
		//div[@id='mw-content-text']/div/table[5]  , not visible in view port
		
		
//		WebElement webelement = obj.getDriver().findElement(By.xpath("//div[@id='mw-content-text']/div/table[6]"));
//		String result_path = ".\\src\\main\\java\\webdriver\\image_comparsion\\end2end.png";
//		obj.takeWebElementScreenshot(webelement, result_path);
	
		
		obj.closeDriver();
		System.out.println("Done");
	}

}