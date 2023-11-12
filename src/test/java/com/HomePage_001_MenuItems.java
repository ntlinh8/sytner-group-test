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

	WebDriver driver;
	private HomePO homePage;
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeClass(String browserName, String environment) {
		log.info("Start Before Test");
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition 01: Accept Cookie");
		homePage.clickToAcceptCookie(driver);
		
		log.info("Pre-condition 02: Verify the page title is 'Sytner Group: UK Prestige Car Dealerships'. ");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Group: UK Prestige Car Dealerships");
	}
	
	@Test
	public void  MenuItems_001_AboutUs() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to About us button");
		homePage.clickToHeaderMenuByLabel(driver, "About Us");
		
		log.info("Step 03: Verify the About Us page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "About Us | Sytner Group");
	}
	
	@Test
	public void  MenuItems_002_LatestNews() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Latest News button");
		homePage.clickToHeaderMenuByLabel(driver, "Latest News");
		
		log.info("Step 03: Verify the Latest News page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Latest News | Sytner Group");
	}
	
	@Test
	public void  MenuItems_003_CustomerService() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Customer Services button");
		homePage.clickToHeaderMenuByLabel(driver, "Customer Services");
		
		log.info("Step 03: Verify the Customer Services page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Customer Service ");
	}
	
//	@Test
//	public void  MenuItems_004_Careers() {
//		log.info("Step 01: Click to Open Menu button");
//		homePage.clickToOpenMenuButton(driver);
//		
//		log.info("Step 02: Click to Careers button");
//		homePage.clickToHeaderMenuByLabel(driver, "Careers");
//		
//		log.info("Step 03: Verify the Careers page displays in the screen");
//		verifyEquals(homePage.getPageTitle(driver), "CareerZone - home");
//	}
	
	@Test
	public void  MenuItems_004_Finance() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Finance button");
		homePage.clickToHeaderMenuByLabel(driver, "Finance");
		
		log.info("Step 03: Verify the Finance page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Finance | Sytner Group");
	}
	
	@Test
	public void  MenuItems_005_ValueMyVehicle() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Value my Vehicle button");
		homePage.clickToHeaderMenuByLabel(driver, "Value my Vehicle");
		
		log.info("Step 03: Verify the Value my Vehicle page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Value Your Car | Sytner Group");
	}
	
	@Test
	public void  MenuItems_006_ElectricVehicles() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Electric Vehicles button");
		homePage.clickToHeaderMenuByLabel(driver, "Electric Vehicles");
		
		log.info("Step 03: Verify the Electric Vehicles page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Electric & Hybrid Cars | Sytner Group");
	}
	
	@Test
	public void  MenuItems_007_Motability() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Motability button");
		homePage.clickToHeaderMenuByLabel(driver, "Motability");
		
		log.info("Step 03: Verify the Motability page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Motability | Sytner Group");
	}
	
	@Test
	public void  MenuItems_008_Service() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Service, MOT & Repair button");
		homePage.clickToHeaderMenuByLabel(driver, "Service, MOT & Repair");
		
		log.info("Step 03: Verify the Service, MOT & Repair page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Car Servicing & Maintenance | Sytner Group");
	}
	
	@Test
	public void  MenuItems_009_ProtectionServices() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Protection Services button");
		homePage.clickToHeaderMenuByLabel(driver, "Protection Services");
		
		log.info("Step 03: Verify the Protection Services page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Insurance & Protection Products | Sytner Group");
	}
	
	@Test
	public void  MenuItems_010_BusinessUsers() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Business Users button");
		homePage.clickToHeaderMenuByLabel(driver, "Business Users");
		
		log.info("Step 03: Verify the Business Users page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Corporate for Business Users");
	}
	
	@Test
	public void  MenuItems_011_Sustainability() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Sustainability button");
		homePage.clickToHeaderMenuByLabel(driver, "Sustainability");
		
		log.info("Step 03: Verify the Sustainability page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sustainability | Sytner Group");
	}
	
	@Test
	public void  MenuItems_012_Goodwood() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Goodwood 2023 button");
		homePage.clickToHeaderMenuByLabel(driver, "Goodwood 2023");
		
		log.info("Step 03: Verify the Goodwood 2023 page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Group announces official partnership with Goodwood Festival of Speed 2023 | Sytner Group");
	}
	
	@Test
	public void  MenuItems_013_Careers() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Careers button");
		homePage.clickToHeaderMenuByLabel(driver, "Careers");
		
		log.info("Step 03: Accept Cookie");
		homePage.clickToAcceptCookie(driver);
		
		log.info("Step 04: Verify the Careers page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "CareerZone - home");
	}
	
	
	@AfterTest
	public void afterClass() {
		closeBrowserDriver();
	}
}
