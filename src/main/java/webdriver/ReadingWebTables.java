package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadingWebTables {

	WebDriver driver;
	protected By tableLocator = By.xpath("//*[@class = 'abc']/tbody");

	public List<List<String>> getWebTablesData() {
		WebElement tableRow = driver.findElement(tableLocator);
		List<List<String>> rowsList = new ArrayList<>();
		List<WebElement> allRows = tableRow.findElements(By.tagName("tr"));

		for (WebElement singleRow : allRows) {
			List<String> columnsValueList = new ArrayList<>();
			List<WebElement> columnsInSingleRow = singleRow.findElements(By.tagName("td"));

			for (WebElement cell : columnsInSingleRow) {
				columnsValueList.add(cell.getText());
			}
			rowsList.add(columnsValueList);
		}
		return rowsList;
	}
	
	//To fetch particular column from a web table
	public List<String> getSingleColumnFromWebTablesData() {
		//get complete table values
		List<List<String>> rows = getWebTablesData();
		List<String> amountList = new ArrayList<>();
		
		for (int i = 1; i <= rows.size(); i++) {
			String amountColumnValue = driver.findElement(By.xpath("//*[@class = 'abc' ]/tbody/tr["+ i + "]/td[8]/span")).getText().trim();
			amountColumnValue = Double.toString(Double.parseDouble(amountColumnValue));
			if (amountColumnValue != null)
				amountList.add(amountColumnValue);
		}
		
		return amountList;
	}	
		
		
		
	

}