package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestIFrame {

	static WebDriver driver;

	
	public TestIFrame() {
		driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/tinymce");
	}

	public static void runInsidePopup(String popupTitle, Runnable action) {
		By byXpath = By.xpath(String.format("//h3[text()='%s']/following::iframe", popupTitle));
		
		//verify if some frame is present or not in screen
		WebElement currentFrame = executeJavascript(driver,"return self.frameElement;");
		
		try {
			driver.switchTo().defaultContent();
			WebDriverWait wait = new WebDriverWait(driver, 30000);
			WebElement myFrame = wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(myFrame));
			action.run();

		} finally {
			if (currentFrame == null) {
				System.out.println("IF...");
				driver.switchTo().defaultContent(); 
			} else {
				System.out.println("ELSE...");
				driver.switchTo().defaultContent();
				//driver.switchTo().frame(currentFrame); // doubt
			}
		}

	}

	public static <T> T executeJavascript(WebDriver driver, String jsCode) {
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		return (T) exec.executeScript(jsCode);
	}
	
	public void testFrames(){
		String popupTitle = "An iFrame containing the TinyMCE WYSIWYG Editor";

		runInsidePopup(popupTitle, () -> {
			//stuff to do inside frame
			System.out.println("Write...");
			WebElement textArea = driver.findElement(By.id("tinymce"));
			textArea.clear();
			textArea.sendKeys("Hi Frames");
		});
		
		System.out.println("Outside Frame");
		
		WebElement file = driver.findElement(By.id("mceu_15-open"));
		file.click();
		
	}

	public static void main(String[] args) {
		TestIFrame obj = new TestIFrame();
		obj.testFrames();
	}

}
