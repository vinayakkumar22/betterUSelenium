package com.betterU.script;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.betterU.pages.LoginPage;
import com.betterU.pages.LogoutPage;

import generic.BaseTest;

public class DoLogout extends BaseTest{
	@Test
	public void doLogout() throws InterruptedException {
		LoginPage l = new LoginPage(driver);
		l.clickLoginSignup();
		
		//Enter Valid UN
		l.setUserName("vinayakemail22@gmail.com");
		//Enter Valid PW
		l.setUserPassword("devkidevi");
		//Do Login
		l.clickLogin();
		
		SoftAssert s =new SoftAssert();
		l.verifyErrIsPresent(s);
		
		
		
		LogoutPage l1= new LogoutPage(driver);
		l1.clickProfile();
		l1.clickLogout();
		
			}
	
	

}
