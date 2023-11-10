package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.CommonUI;

public class CommonPO extends BasePage{
	
	public void clickToOpenMenuButton(WebDriver driver) {
		waitForElementClickable(driver, CommonUI.COMMON_BUTTON_OPENMENU);
		clickToElement(driver, CommonUI.COMMON_BUTTON_OPENMENU);
	}
	
	public void clickToHeaderOption(WebDriver driver, String headerOption) {
		waitForElementClickable(driver, CommonUI.COMMON_BUTTON_OPENMENU);
		clickToElement(driver, CommonUI.COMMON_BUTTON_OPENMENU);
	}
}
