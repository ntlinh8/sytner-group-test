package pageObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		SleepInSecond(2);
	}

	public boolean isSortByPrice(String sortedOption) throws Exception {
		List<Integer> expectedPriceList = new ArrayList<Integer>();
		List<Integer> actualPriceList = new ArrayList<Integer>();
		List<WebElement> elementList = getWebElements(driver, SearchUI.Search_text_AllPrice);
		for (WebElement element : elementList) {
			String text = element.getText().replace("Vehicle price:", "").replace(",", "").replace("£", "").replace(" + VAT", "").trim();
			actualPriceList.add(Integer.valueOf(text));
			expectedPriceList.add(Integer.valueOf(text));
		}
		switch (sortedOption) {
		case "Low to High":
			Collections.sort(expectedPriceList);
			break;
		case "High to Low":
			Collections.sort(expectedPriceList);
			Collections.reverse(expectedPriceList);
			break;
		default:
			throw new Exception("Please enter the valid sorted option");
		}
		return expectedPriceList.equals(actualPriceList);
	}
	
	public boolean isSortByMonthlyPayment(String sortedOption) throws Exception {
		List<Integer> expectedPaymentList = new ArrayList<Integer>();
		List<Integer> actualPaymentList = new ArrayList<Integer>();
		List<WebElement> elementList = getWebElements(driver, SearchUI.Search_text_AllMonthlyPayment);
		for (WebElement element : elementList) {
			String text = element.getText().split("£")[1].replace(",", "").trim();
			actualPaymentList.add(Integer.valueOf(text));
			expectedPaymentList.add(Integer.valueOf(text));
		}
		switch (sortedOption) {
		case "Low to High":
			Collections.sort(expectedPaymentList);
			break;
		case "High to Low":
			Collections.sort(expectedPaymentList);
			Collections.reverse(expectedPaymentList);
			break;
		default:
			throw new Exception("Please enter the valid sorted option");
		}
		return expectedPaymentList.equals(actualPaymentList);
	}
	
	
}
