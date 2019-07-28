package com.frankbahar.rough;

import com.frankbahar.base.Page;
import com.frankbahar.pages.actions.CreateAccountPage;
import com.frankbahar.pages.actions.SigninPage;

public class CreateAccountTest {

	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();
		CreateAccountPage createAccount = Page.topNav.gotoCreateAccount();
		createAccount.createAccount("Enes", "Kanter", "frankbahar07@gmail.com", "Selenium@123");
		Thread.sleep(3000);
		Page.quitBrowser();

	}

}
