package com.frankbahar.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.frankbahar.base.Page;
import com.frankbahar.page.locators.SigninPageLocators;

public class SigninPage extends Page {
	public SigninPageLocators signinPage;

	public SigninPage() {
		this.signinPage = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signinPage);
	}
	
	public void doLogin(String username, String password) {
		type(signinPage.email,username);
		type(signinPage.password, password);
		click(signinPage.submit);
	}

}
