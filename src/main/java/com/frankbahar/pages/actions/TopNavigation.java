package com.frankbahar.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.frankbahar.base.Page;
import com.frankbahar.page.locators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver) {
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.topNavigation);
	}
	
	public SigninPage gotoSignIn() {
		Page.click(topNavigation.account);
		Page.click(topNavigation.signinBtn);
		return new SigninPage(); 
		
	}
	
	public CreateAccountPage gotoCreateAccount() {
		Page.click(topNavigation.account);
		Page.click(topNavigation.createAccountBtn);
		return new CreateAccountPage();
		
	}
	
	public void gotoList() {
		Page.click(topNavigation.account);
		Page.click(topNavigation.signinBtn);
		Page.click(topNavigation.myLists);
		
	}
	
	public void gotoSupport() {
		Page.click(topNavigation.support);
		Page.click(topNavigation.customerSupport);
	}
	
	public void gotoHome() {
		Page.click(topNavigation.home);
	}
	
	
}
