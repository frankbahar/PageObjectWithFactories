package com.frankbahar.rough;

import com.frankbahar.base.Page;
import com.frankbahar.pages.actions.SigninPage;

public class CustomerSupportTest {

	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();
		Page.topNav.gotoSupport();
		Thread.sleep(3000);
		Page.quitBrowser();
	}

}
