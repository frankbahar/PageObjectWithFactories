package com.frankbahar.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
public class TopNavigationLocators {

	@FindBy(css="#header-account-menu")
	public WebElement account;
	
	@FindAll({
		@FindBy(css="#account-signin"),
		@FindBy(xpath="//*[contains(text(),'Sign In')]")
	})
	public WebElement signinBtn;
	
	@FindBy(css="#account-register")
	public WebElement createAccountBtn;

	@FindBy(css="#header-itineraries")
	public WebElement myLists;
	
	@FindBy(css="#header-support-menu")
	public WebElement support;
	
	@FindBy(css="#support-cs")
	public WebElement customerSupport;
	
	@FindBy(css="#header-logo")
	public WebElement home;
	
}
