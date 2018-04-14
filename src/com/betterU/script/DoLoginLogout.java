package com.betterU.script;

import org.testng.annotations.Test;

import com.betterU.pages.LoginPage;

import generic.BaseTest;

public class DoLoginLogout extends BaseTest{
	@Test
	public void doLoginLogout() {
		LoginPage l = new LoginPage(driver);
		l.clickLoginSignup();
		
		//Enter Valid UN
		l.setUserName("vinayakemail22@gmail.com");
		//Enter Valid PW
		l.setUserPassword("devkidevi");
		//Do Login
		l.clickLogin();
	}
	
	

}
