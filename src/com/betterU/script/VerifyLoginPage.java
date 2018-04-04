package com.betterU.script;

import org.testng.annotations.Test;

import com.betterU.pages.LoginPage;

import generic.BaseTest;

public class VerifyLoginPage extends BaseTest{
	@Test
	public void testVerifyLoginPage() {
		LoginPage l = new LoginPage(driver); 
		l.verifyTitle("Online Education, Job Opportunities, Corporate Training | BetterU");
		
	}
	
	
		
				
	
	

}
