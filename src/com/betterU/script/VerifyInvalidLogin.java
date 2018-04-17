package com.betterU.script;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.betterU.pages.LoginPage;

import generic.BaseTest;

public class VerifyInvalidLogin extends BaseTest{
	
	@Test
	public void testVerifyInvalidLogin() {
		SoftAssert s =new SoftAssert();
		
		LoginPage l = new LoginPage(driver);
		l.clickLoginSignup();
		l.setUserName("vinkumar@betteru.in");
		l.setUserPassword("ASDF");
		l.clickLogin();
		l.verifyErrIsPresent(s);
		s.assertAll();
	}

}
