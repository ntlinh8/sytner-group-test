package pageObjects;

import org.openqa.selenium.WebDriver;

import pageUI.HomeUI;

public class HomePO extends CommonPO{
	WebDriver driver;
	
	HomePO(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isImageScrollDisplay(WebDriver driver) {
		waitForElementVisible(driver, HomeUI.Home_image_ImageScroll);
		return isElementDisplayed(driver, HomeUI.Home_image_ImageScroll);
	}

	public SearchPO clickToSearchButton(WebDriver driver) {
		waitForElementClickable(driver, HomeUI.Home_button_Search);
		clickToElement(driver, HomeUI.Home_button_Search);
		return PageGeneratorManager.getSearchPage(driver);
	}
	
}
