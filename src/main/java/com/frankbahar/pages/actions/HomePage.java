package com.frankbahar.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.frankbahar.base.Page;
import com.frankbahar.page.locators.HomePageLocators;

public class HomePage  extends Page {
	public HomePageLocators home;

	public HomePage() {
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
	}
	
	public HomePage gotoFlights() {
		click(home.flightTab);
		return this;
	}
	
	public void gotoHotels() {
		
	}
	
	public void gotoFlightAndHotels() {
		
	}
	
	public int findTabCount() {
		return home.tabCount.size();
	}
	
	public void bookAFlight(String from, String to, String departing, String returning, String noOfAdults, String noOfChildren) throws InterruptedException {
		Thread.sleep(5000);
		type(home.fromCity, from);
		Thread.sleep(2000);
		type(home.toCity,to);
		Thread.sleep(5000);
		type(home.departFlight,departing);
		Thread.sleep(5000);
		home.returnFlight.clear();
		type(home.returnFlight, returning);
	//	home.adultyCount.sendKeys(noOfAdults);
	//	home.childCount.sendKeys(noOfChildren);
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		home.block.click();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		click(home.search);
		//home.search.click();
	}
}
