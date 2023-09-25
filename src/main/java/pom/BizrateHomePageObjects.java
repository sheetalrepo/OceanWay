package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Page Factory is a concept of Page Object Model where WebElements are dynamically get initialized. 
 * id and name are default i.e. no need to use @FindBy tag, we can use them directly if we wish.
 */
public class BizrateHomePageObjects {

	WebDriver driver;
	
	@CacheLookup
	WebElement searchTerm; // id is directly used

	@CacheLookup
	@FindBy(name = "SEARCH_GO")
	WebElement searchButton;
	// WebElement SEARCH_GO; | this can also be used

	public BizrateHomePageObjects(WebDriver driver) {
//		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public BizrateSearchPageObjects searchForKeyword(String keyword) {
		searchTerm.clear();
		searchTerm.sendKeys(keyword);
		searchButton.click();
		return PageFactory.initElements(driver, BizrateSearchPageObjects.class);
	}
}
