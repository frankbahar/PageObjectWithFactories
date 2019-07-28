package com.frankbahar.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.frankbahar.base.Page;
import com.frankbahar.page.locators.CreateAccountPageLocators;
import com.frankbahar.page.locators.SigninPageLocators;

public class CreateAccountPage extends Page {
	public CreateAccountPageLocators createAccountPage;

	public CreateAccountPage() {
		this.createAccountPage = new CreateAccountPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.createAccountPage);
	}

	public void createAccount(String firstName, String lastName, String email, String password)
			throws InterruptedException {

		Actions action = new Actions(driver);
		//action.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(3000);
	//	action.moveToElement(createAccountPage.firstName).sendKeys("firstName");
		//createAccountPage.block.click();
		Thread.sleep(3000);
		createAccountPage.firstName.sendKeys(firstName);
		Thread.sleep(3000);
		createAccountPage.lastName.sendKeys(lastName);
		Thread.sleep(3000);
		createAccountPage.email.sendKeys(email);
		Thread.sleep(3000);
		createAccountPage.password.sendKeys(password);
		Thread.sleep(3000);
		createAccountPage.signUp.click();
		Thread.sleep(5000);
	}

}
