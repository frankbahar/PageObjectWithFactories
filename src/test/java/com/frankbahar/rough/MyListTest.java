package com.frankbahar.rough;

import com.frankbahar.base.Page;
import com.frankbahar.pages.actions.CreateAccountPage;
import com.frankbahar.pages.actions.SigninPage;

public class MyListTest {

	public static void main(String[] args) {
		Page.initConfiguration();
		SigninPage signin = Page.topNav.gotoSignIn();
		signin.doLogin("frankbahar07@gmail.com", "Selenium@123");
		Page.topNav.gotoList();
		Page.quitBrowser();
		
	}

}
