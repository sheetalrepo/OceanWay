package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BizrateSearchPageObjects {
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='minPriceBox']")
	WebElement minPrice;

	@FindBy(xpath = ".//*[@id='maxPriceBox']")
	WebElement maxPrice;

	@FindBy(id = "update-go-button")
	WebElement priceButton;

	public BizrateSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public void applyPriceFilter(String min, String max) {
		minPrice.clear();
		minPrice.sendKeys(min);
		maxPrice.clear();
		maxPrice.sendKeys(max);
		priceButton.click();
	}
}
