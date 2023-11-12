package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePO;
import pageObjects.PageGeneratorManager;

public class HomePage_002_JumpPoints extends BaseTest{
	
	WebDriver driver;
	private HomePO homePage;
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeTest(String browserName, String environment) {
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition 01: Accept Cookie");
		homePage.clickToAcceptCookie(driver);
	}
	
	@Test
	public void JumpPoints_001_Alpina() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Alpina button");
		homePage.clickToHeaderMenuByLabel(driver, "Alpina");
		
		log.info("Step 03: Verify the Alpina page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "ALPINA Cars | Sytner Alpina ");
	}
	
	@Test
	public void JumpPoints_002_Audi() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Audi button");
		homePage.clickToHeaderMenuByLabel(driver, "Audi");
		
		log.info("Step 03: Verify the Alpina page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Audi | UK Audi Dealerships");
	}
	
	@Test
	public void JumpPoints_003_Bentley() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Bentley button");
		homePage.clickToHeaderMenuByLabel(driver, "Bentley");
		
		log.info("Step 03: Verify the Bentley page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Bentley Home | Sytner Bentley");
	}
	
	@Test
	public void JumpPoints_004_BMW() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to BMW button");
		homePage.clickToHeaderMenuByLabel(driver, "BMW");
		
		log.info("Step 03: Verify the Sytner BMW page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner BMW");
	}
	
	@Test
	public void JumpPoints_005_Ferrari() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Ferrari button");
		homePage.clickToHeaderMenuByLabel(driver, "Ferrari");
		
		log.info("Step 03: Verify the Sytner Ferrari page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Ferrari | Ferrari Dealerships");
	}
	
	@Test
	public void JumpPoints_006_Jaguar() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Jaguar button");
		homePage.clickToHeaderMenuByLabel(driver, "Jaguar");
		
		log.info("Step 03: Verify the Jaguar | Sytner Jaguar page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Jaguar | Sytner Jaguar");
	}
	
	@Test
	public void JumpPoints_007_LandRover() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Land Rover button");
		homePage.clickToHeaderMenuByLabel(driver, "Land Rover");
		
		log.info("Step 03: Verify the Land Rover | Sytner Land Rover page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Land Rover | Sytner Land Rover");
	}
	
	@Test
	public void JumpPoints_008_Lamborghini() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Lamborghini button");
		homePage.clickToHeaderMenuByLabel(driver, "Lamborghini");
		
		log.info("Step 03: Verify the Lamborghini page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Lamborghini Home | Sytner Lamborghini");
	}
	
	@Test
	public void JumpPoints_009_Maserati() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to Maserati button");
		homePage.clickToHeaderMenuByLabel(driver, "Maserati");
		
		log.info("Step 03: Verify the Maserati page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Maserati Home | Sytner Maserati");
	}
	
	@Test
	public void JumpPoints_010_McLaren() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Click to McLaren button");
		homePage.clickToHeaderMenuByLabel(driver, "McLaren");
		
		log.info("Step 03: Verify the McLaren page displays in the screen");
		verifyEquals(homePage.getPageTitle(driver), "McLaren Manchester | Sytner McLaren");
	}
	
	@AfterTest
	public void afterTest() {
		closeBrowserDriver();
	}
	
	

}
