package com.betterU.script;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.betterU.pages.LoginPage;
import com.betterU.pages.LogoutPage;

import generic.BaseTest;

public class DoLogin extends BaseTest{
	@Test
	public void doLogin() throws InterruptedException {
		LoginPage l = new LoginPage(driver);
		l.clickLoginSignup();
		
		//Enter Valid UN
		l.setUserName("vinayakemail22@gmail.com");
		//Enter Valid PW
		l.setUserPassword("devkidevi");
		//Do Login
		l.clickLogin();
		
		
		//Logout in Login
		//Thread.sleep(5000);
	//	LogoutPage l1= new LogoutPage(driver);
	//	l1.clickProfile();
	//	l1.clickLogout();
		
		
		
	
		
		
		
		
		SoftAssert s= new  SoftAssert();
		l.verifyErrIsPresent(s);
		
		
		
	}
	
	

}
