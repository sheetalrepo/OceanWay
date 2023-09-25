package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {

	WebDriver driver;
	BizrateHomePageObjects homepage;
	BizrateSearchPageObjects pricepage;
	Helper helper;

	@BeforeClass
	public void setup() {
		helper=new Helper();
		helper.getProperties();
		driver=helper.getDriver();
	}

	@AfterClass
	public void tearDown() {
		driver.quit(); // closes all opened browser instances
		// driver.close(); //close only current opened browser instance
	}

	@Test
	public void verifyPriceFilter() {
		driver.get(helper.server);
		homepage = PageFactory.initElements(driver,
				BizrateHomePageObjects.class);
		pricepage = homepage.searchForKeyword("dell");

		(new WebDriverWait(driver, 20)).until(ExpectedConditions
				.presenceOfElementLocated(By.id("minPriceBox")));

		pricepage.applyPriceFilter("100", "200");
		Assert.assertTrue(
				driver.getCurrentUrl().contains("maxPrice--200__minPrice--100"),
				"price filter not applied");
	}
}
