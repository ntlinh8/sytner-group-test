package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePO;
import pageObjects.PageGeneratorManager;


public class HomePage_001_MenuItems extends BaseTest{

	public WebDriver driver;
	private HomePO homePage;
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeClass(String browserName, String environment) {
		log.info("Start Before Test");
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
	@Test
	public void  MenuItems_001_AboutUs() {
		log.info("Verify that the page title is correct");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Group: UK Prestige Car Dealerships");
		
		log.info("Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Click to About us button");
		
		log.info("Verify the About us page displays in the screen");
	}
	
	
	
	@AfterTest
	public void afterClass() {
		closeBrowserDriver();
	}
}
