package com.frankbahar.rough;

import org.testng.annotations.Test;

import com.frankbahar.base.Page;
import com.frankbahar.pages.actions.SigninPage;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();
		SigninPage signin = Page.topNav.gotoSignIn();
		signin.doLogin("frankbahar07@gmail.com", "Selenium@123");
		Page.quitBrowser();

	}

}
