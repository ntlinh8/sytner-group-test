package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static HomePO getHomePage(WebDriver driver) {
		return new HomePO(driver);
	}
	
	public static SearchPO getSearchPage(WebDriver driver) {
		return new SearchPO(driver);
	}
	
}
