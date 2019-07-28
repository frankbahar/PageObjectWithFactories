package com.frankbahar.testcases;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.frankbahar.base.Page;
import com.frankbahar.errorcollectors.ErrorCollector;
import com.frankbahar.pages.actions.HomePage;
import com.frankbahar.utilities.Utilities;

public class FlightSearchTest {
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void flightSearchTest(Hashtable <String, String> data) throws InterruptedException {
		
		if(data.get("runmode").equalsIgnoreCase("N")) {
			throw new SkipException("Skipping the test case as Run Mode is NO");
		}
		Page.initConfiguration();
		HomePage home = new HomePage();
		//Assert.assertEquals(home.findTabCount(),7);
		//ErrorCollector.verifyEquals(home.findTabCount(), 6);
		//ErrorCollector.verifyEquals(home.findTabCount(), 7);
		ErrorCollector.verifyEquals(home.findTabCount(), 8);
		home.gotoFlights().bookAFlight(data.get("from"), data.get("to"),data.get("departing"), data.get("returning"), data.get("noOfAdults"), data.get("noOfChildren"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		if(Page.driver != null) {
			Page.quitBrowser();
		}
	}
}
