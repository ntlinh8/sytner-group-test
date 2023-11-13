package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePO;
import pageObjects.PageGeneratorManager;

public class HomePage_004_CarSearch_01 extends BaseTest{
	
	WebDriver driver;
	HomePO homePage;
	
	
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeTest(String browserName, String environment) {
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
	@Test
	public void CarSearch_001_CarSearchSetion() {
		
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	
	
}
