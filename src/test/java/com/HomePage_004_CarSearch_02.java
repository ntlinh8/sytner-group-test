package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePO;
import pageObjects.PageGeneratorManager;
import pageObjects.SearchPO;

public class HomePage_004_CarSearch_02 extends BaseTest{
	private WebDriver driver;
	private HomePO homePage;
	private SearchPO searchPage;
	
	@Parameters({"driver", "environment"})
	@BeforeTest
	public void beforeTest(String browserName, String environment) {
		log.info("Precondition 01: Open website");
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Precondition 02: Click Accept all cookies");
		homePage.clickToAcceptCookie(driver);
		
		log.info("Precondition 03: Go to Search page");
		searchPage = homePage.clickToSearchButton(driver);
		
	}
	
	@Test
	public void CarSearch_006_GenaralSearch() {
		log.info("Step 01: Input value to Search textbox");
		searchPage.inputTextToDynamicTextboxByPlaceholder(driver, "MD", "Search for your next vehicle");
		
		log.info("Step 02: Verify the filter is MD");
		verifyTrue(searchPage.isSelectedOptionDisplayByLabel(driver, "MD"));
		
		log.info("Step 03: Verify the matched product is 10");
		verifyEquals(searchPage.getShowedProduct(driver), "10");
	}
	
	@Test
	public void CarSearch_007_SortPriceLowToHigh() {
		log.info("Step 01: Select Price: Low to High option");
		searchPage.clickSortByLabel(driver, "Price: Low to High");
		
		log.info("Step 02: Verify the price order from Low to High");
		verifyTrue(searchPage.isSortedResultByOption("Name", "Price: Low to High"));
	}
	
	@Test
	public void CarSearch_008_SortPriceHighToLow() {
		log.info("Step 01: Select Price: High to Low");
		
		log.info("Step 02: Verify the price order from High to Low");
	}
	
	@Test
	public void CarSearch_009_MonthlyPaymentLowToHigh() {
		log.info("Step 01: Select Monthly Payment Low to High");
		
		log.info("Step 02: Verify the monthly Payment from Low to High");
		
	}
	
	@Test
	public void CarSearch_010_MonthlyPaymentHighToLow() {
		log.info("Step 01: Select Monthly Payment High to Low");
		
		log.info("Step 02: Verify the monthly Payment from High to Low");
	}
	
	@AfterTest
	public void afterTest() {
		closeBrowserDriver();
	}
}
