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

public class HomePage_003_CarSearch_01 extends BaseTest{
	
	private WebDriver driver;
	private HomePO homePage;
	private SearchPO searchPage;
	private String product1, product2;
	private String model1, model2;
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeTest(String browserName, String environment) {
		product1 = "BMW";
		product2 = "AUDI";
		model1 = "5 SERIES";
		model2 = "BOXSTER";
		
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition 01: Accept Cookie");
		homePage.clickToAcceptCookie(driver);
	}
	
	@Test
	public void CarSearch_001_GoToSearchPage() {
		log.info("Step 01: Click to Search button");
		searchPage = homePage.clickToSearchButton(driver);
		
		log.info("Step 02: Verify the title of page");
		verifyEquals(searchPage.getPageTitle(driver), "Sytner New and Used Vehicle Search");
	}
	
	@Test
	public void CarSearch_002_SearchMakesWithOneProduct() {
		log.info("Step 01: Input to Search Makes textbox");
		searchPage.inputTextToDynamicTextboxByPlaceholder(driver, product1, "Search Makes");
		
		log.info("Step 02: Get the matched product in searched list");
		int productNumber = searchPage.getMatchedProductByLabel(driver, product1);
		
		log.info("Step 03: Click To " + product1 + " option");
		searchPage.clickToSearchedOptionByLabel(driver, product1);
		
		log.info("Step 04: Verify the filter is " + product1);
		verifyTrue(searchPage.isSelectedOptionDisplayByLabel(driver, product1));
		
		log.info("Step 05: Verify the matched product is + " + String.valueOf(productNumber));
		verifyEquals(searchPage.getShowedProduct(driver), String.valueOf(productNumber));
	}
	
	@Test
	public void CarSearch_003_SearchMakesWithMultipleProduct() {
		log.info("Step 01: Click Clear all button");
		searchPage.clickClearAllButton(driver);
		
		log.info("Step 02: Input to Search Makes textbox");
		searchPage.inputTextToDynamicTextboxByPlaceholder(driver, product1, "Search Makes");
		
		log.info("Step 03: Get the matched product in searched list");
		int productNumber1 = searchPage.getMatchedProductByLabel(driver, product1);
		
		log.info("Step 04: Click To " + product1 + " option");
		searchPage.clickToSearchedOptionByLabel(driver, product1);
		
		log.info("Step 05: Verify the filter is " + product1);
		verifyTrue(searchPage.isSelectedOptionDisplayByLabel(driver, product1));
		
		log.info("Step 06: Input to Search Makes textbox");
		searchPage.inputTextToDynamicTextboxByPlaceholder(driver, product2, "Search Makes");
		
		log.info("Step 07: Get the matched product in searched list");
		int productNumber2 = searchPage.getMatchedProductByLabel(driver, product2);
		
		log.info("Step 08: Click To " + product2 + " option");
		searchPage.clickToSearchedOptionByLabel(driver, product2);
		
		log.info("Step 09: Verify the filter is " + product2);
		verifyTrue(searchPage.isSelectedOptionDisplayByLabel(driver, product2));
		
		log.info("Step 10: Verify the matched product is + " + String.valueOf(productNumber1 + productNumber2));
		verifyEquals(searchPage.getShowedProduct(driver), productNumber1 + productNumber2);
	}
	
	@Test
	public void CarSearch_004_SearchModelWithOneProduct() {
		log.info("Step 01: Click Clear all button");
		searchPage.clickClearAllButton(driver);
		
		log.info("Step 02: Collapse the Make menu");
		searchPage.collapseDynamicMenuByLabel(driver, "Make");
		
		log.info("Step 03: Expend the Model menu");
		searchPage.expandDynamicMenuByLabel(driver, "Model");
		
		log.info("Step 04: Input to Search Models textbox");
		searchPage.inputTextToDynamicTextboxByPlaceholder(driver, model1, "Search Models");
		
		log.info("Step 02: Get the matched product in searched list");
		int productNumber = searchPage.getMatchedProductByLabel(driver, model1);
		
		log.info("Step 03: Click To " + model1 + " option");
		searchPage.clickToSearchedOptionByLabel(driver, model1);
		
		log.info("Step 04: Verify the filter is " + model1);
		verifyTrue(searchPage.isSelectedOptionDisplayByLabel(driver, model1));
		
		log.info("Step 05: Verify the matched product is + " + String.valueOf(productNumber));
		verifyEquals(searchPage.getShowedProduct(driver), String.valueOf(productNumber));
	}
	
	@Test
	public void CarSearch_005_SearchModelWithMultipleProduct() {
		log.info("Step 01: Click Clear all button");
		searchPage.clickClearAllButton(driver);
		
		log.info("Step 02: Collapse the Make menu");
		searchPage.collapseDynamicMenuByLabel(driver, "Make");
		
		log.info("Step 03: Expend the Model menu");
		searchPage.expandDynamicMenuByLabel(driver, "Model");
		
		log.info("Step 04: Input to Search Models textbox with value: " + model1);
		searchPage.inputTextToDynamicTextboxByPlaceholder(driver, model1, "Search Models");
		
		log.info("Step 05: Get the matched product in searched list");
		int productNumber1 = searchPage.getMatchedProductByLabel(driver, model1);
		
		log.info("Step 06: Click To " + model1 + " option");
		searchPage.clickToSearchedOptionByLabel(driver, model1);
		
		log.info("Step 07: Verify the filter is " + model1);
		verifyTrue(searchPage.isSelectedOptionDisplayByLabel(driver, model1));
		
		log.info("Step 08: Input to Search Model textbox with value: " + model2);
		searchPage.inputTextToDynamicTextboxByPlaceholder(driver, model2, "Search Models");
		
		log.info("Step 09: Get the matched product in searched list");
		int productNumber2 = searchPage.getMatchedProductByLabel(driver, model2);
		
		log.info("Step 10: Click To " + model2 + " option");
		searchPage.clickToSearchedOptionByLabel(driver, model2);
		
		log.info("Step 11: Verify the filter is " + model2);
		verifyTrue(searchPage.isSelectedOptionDisplayByLabel(driver, model2));
		
		log.info("Step 12: Verify the matched product is + " + String.valueOf(productNumber1 + productNumber2));
		verifyEquals(searchPage.getShowedProduct(driver), productNumber1 + productNumber2);
	}
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void afterTest() {
		closeBrowserDriver();
	}
	
	
}
