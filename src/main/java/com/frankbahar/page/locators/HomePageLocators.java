package com.frankbahar.page.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	// @FindBy(css = "#tab-flight-tab-hp")
	@FindBy(xpath = "//button[starts-with(@id,'tab-flight-tab')]")
	public WebElement flightTab;

	// locators for flight booking
	@FindBy(css = "input[id^='flight-origin']")
	public WebElement fromCity;
	@FindBy(css = "input[id^='flight-destination']")
	public WebElement toCity;
	@FindBy(css = "#flight-departing-hp-flight")
	public WebElement departFlight;
	@FindBy(css = "#flight-returning-hp-flight")
	public WebElement returnFlight;
	@FindBy(css = "#flight-adults")
	public WebElement adultyCount;
	@FindBy(css = "#flight-children")
	public WebElement childCount;
	//@FindBy(css = "#gcw-flights-form-hp-flight > div.cols-nested.ab25184-submit > label > button")		
	@FindAll({
		@FindBy(css = "#gcw-flights-form-hp-flight > div.cols-nested.ab25184-submit > label > button"),
		@FindBy(xpath="//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")
	})
	public WebElement search;
	// @FindBy(css="#flight-age-select-1-hp-flight")
	@FindBys({ @FindBy(css = "#wizard-tabs11"), @FindBy(id = "flight-age-select-1-hp-flight") })
	public WebElement firstAge;
	@FindAll({ @FindBy(css = "#flight-age-select-2-hp-flight222"), @FindBy(id = "flight-age-select-2-hp-flight") })
	public WebElement secondAge;
	@FindBy(css = "li[role='presentation']")
	public List<WebElement> tabCount;
	@FindBy(css="#wizard-tabs")
	public WebElement block;
}
