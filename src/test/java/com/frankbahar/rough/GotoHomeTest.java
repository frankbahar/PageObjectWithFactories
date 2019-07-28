package com.frankbahar.rough;

import com.frankbahar.base.Page;
import com.frankbahar.pages.actions.HomePage;
import com.frankbahar.pages.actions.SigninPage;

public class GotoHomeTest {

	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();
		HomePage home = new HomePage();
		//home.gotoFlights().bookAFlight("New York, United States of America (NYC-All Airpo rts)", " Cancun (and vicinity), Quintana Roo, Mexico",
		home.gotoFlights().bookAFlight("NYC", "Cancun",	"06/10/2019", "06/15/2019", "2", "0");
		Thread.sleep(5000);
		Page.topNav.gotoHome();
		Thread.sleep(3000);
		
		Page.quitBrowser();

	}

}
