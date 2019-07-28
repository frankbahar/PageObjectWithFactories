package com.frankbahar.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageLocators {
	
	@FindBy(css="#gss-signup-first-name")
	public WebElement firstName;
	@FindBy(css="#gss-signup-last-name")
	public WebElement lastName;
	@FindBy(css="#gss-signup-email")
	public WebElement email;
	@FindBy(css="#gss-signup-password")
	public WebElement password;
	@FindBy(css="#gss-signup-submit")
	public WebElement signUp;
	@FindBy(css="#gss-modal-main-container")
	public WebElement block;

}
