package com.betterU.pages;
import generic.BasePage;

import java.util.concurrent.TimeoutException;

import org.apache.xalan.xsltc.compiler.util.ErrorMessages;
import org.apache.xalan.xsltc.compiler.util.ErrorMsg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class LogoutPage extends BasePage {
 		// TODO Auto-generated constructor stub
	

    @FindBy(xpath=("/html/body/div[3]/div[1]/header/div[1]/div/div/div[1]/div[2]/div[1]/div/a/span[1]"))
    private WebElement Profile;
    @FindBy(xpath=("//a[text()='Logout']"))
    private WebElement Logout;
   
    
    
    public LogoutPage(WebDriver driver) {
		super(driver);
    }
    
    public void clickProfile() {
    	WebDriverWait wait= new WebDriverWait(driver,5);
    	Profile.click();
    }
    public void clickLogout() {
    	WebDriverWait wait= new WebDriverWait(driver,5);
    	Logout.click();
    	
    }
    
    
   
    }
    

  
  

