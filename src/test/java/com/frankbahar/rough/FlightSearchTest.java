package com.frankbahar.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.frankbahar.base.Page;
import com.frankbahar.errorcollectors.ErrorCollector;
import com.frankbahar.pages.actions.HomePage;

public class FlightSearchTest {



	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();
		HomePage home = new HomePage();
		//Assert.assertEquals(home.findTabCount(),7);
		//ErrorCollector.verifyEquals(home.findTabCount(), 6);
		//ErrorCollector.verifyEquals(home.findTabCount(), 7);
		//ErrorCollector.verifyEquals(home.findTabCount(), 8);
		home.gotoFlights().bookAFlight("NYC", "Cancun",	"06/10/2019", "06/15/2019", "2", "0");
		Page.quitBrowser();
	
	}

}
