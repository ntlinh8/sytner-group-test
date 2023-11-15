package pageObjects;

import org.openqa.selenium.WebDriver;

import pageUI.SearchUI;

public class SearchPO extends CommonPO{
	WebDriver driver;
	
	SearchPO(WebDriver driver){
		this.driver = driver;
	}

	public void clickToSearchedOptionByLabel(WebDriver driver, String label) {
		waitForElementClickable(driver, SearchUI.Search_button_DynamicSearchedOptionByLabel, label);
		clickToElement(driver, SearchUI.Search_button_DynamicSearchedOptionByLabel, label);
	}

	public int getMatchedProductByLabel(WebDriver driver, String label) {
		waitForElementVisible(driver, SearchUI.Search_text_DynamicMatchedProductByLabel, label);
		return Integer.valueOf(getElementText(driver, SearchUI.Search_text_DynamicMatchedProductByLabel, label));
	}

	public boolean isSelectedOptionDisplayByLabel(WebDriver driver, String label) {
		waitForElementVisible(driver, SearchUI.Search_text_DynamicSelectedOptionByLabel, label);
		return isElementDisplayed(driver, SearchUI.Search_text_DynamicSelectedOptionByLabel, label);
	}

	public int getShowedProduct(WebDriver driver) {
		waitForElementVisible(driver, SearchUI.Search_text_ShowedProductNumber);
		String showedProduct = getElementText(driver, SearchUI.Search_text_ShowedProductNumber).replace("vehicles", "").replace("-", "").replace(",", "").trim();
		return Integer.valueOf(showedProduct);
	}

	public void clickClearAllButton(WebDriver driver) {
		waitForElementVisible(driver, SearchUI.Search_button_ClearAll);
		clickToElement(driver, SearchUI.Search_button_ClearAll);
	}

	public void collapseDynamicMenuByLabel(WebDriver driver, String label) {
		waitForElementVisible(driver, SearchUI.Search_menu_DynamicLeftMenuByLabel, label);
		boolean isExpand = Boolean.valueOf(getElementAttribute(driver, SearchUI.Search_menu_DynamicLeftMenuByLabel, "aria-expanded", label));
		if(isExpand) {
			clickToElement(driver, SearchUI.Search_menu_DynamicLeftMenuByLabel, label);
		}
	}

	public void expandDynamicMenuByLabel(WebDriver driver, String label) {
		waitForElementVisible(driver, SearchUI.Search_menu_DynamicLeftMenuByLabel, label);
		boolean isExpand = Boolean.valueOf(getElementAttribute(driver, SearchUI.Search_menu_DynamicLeftMenuByLabel, "aria-expanded", label));
		if(!isExpand) {
			clickToElement(driver, SearchUI.Search_menu_DynamicLeftMenuByLabel, label);
		}
		
	}

	public void clickSortByLabel(WebDriver driver, String label) {
		waitForElementVisible(driver, SearchUI.Search_button_SortBy);
		clickToElement(driver, SearchUI.Search_button_SortBy);
		SleepInSecond(2);
		waitForElementVisible(driver, SearchUI.Search_option_DynamicSortOptionByLabel, label);
		clickToElement(driver, SearchUI.Search_option_DynamicSortOptionByLabel, label);
	}

	public boolean isSortedResultByOption(String sortedObject, String sortedOption) {
		// TODO Auto-generated method stub
		return false;
	}

}
