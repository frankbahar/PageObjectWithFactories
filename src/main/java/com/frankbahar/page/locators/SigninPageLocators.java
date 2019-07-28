package com.frankbahar.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SigninPageLocators {
	
	@FindBy(css="#gss-signin-email")
	public WebElement email;
	@FindBy(css="#gss-signin-password")
	public WebElement password;
	@FindBy(css="#gss-signin-submit")
	public WebElement submit;
	
	
}
