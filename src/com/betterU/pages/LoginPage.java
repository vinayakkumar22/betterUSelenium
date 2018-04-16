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

public class LoginPage extends BasePage {
 		// TODO Auto-generated constructor stub
	

    @FindBy(className= "callLogin")
    private WebElement LoginsignupButton;
    @FindBy(id="userEmail")
    private WebElement email;
    @FindBy(id="userPassword")
    private WebElement password;
    @FindBy(xpath=("/html/body/div[3]/div[1]/header/div[1]/div/div/div[2]/div/div/div[1]/div/div[2]/form/button[1]"))
    private WebElement signin;
    @FindBy (className = "logerror")
    private WebElement ErrMsg;
    
    
    public LoginPage(WebDriver driver) {
		super(driver);
    }
    
    public void clickLoginSignup()  {
    	LoginsignupButton.click();
    	WebDriverWait wait= new WebDriverWait(driver,5);
    }
    public void setUserName(String un) {
    	email.sendKeys(un);
    	
    }
    public void setUserPassword(String pw) {
    	password.sendKeys(pw);
    }
    public void clickLogin() {
    	signin.click();
    	
    }
        
    public void verifyErrIsPresent(SoftAssert s) {
    	WebDriverWait wait= new WebDriverWait(driver,10);
    	
    	try {
    		wait.until(ExpectedConditions.visibilityOf(ErrMsg));
    		Reporter.log("Err Msg is displayed",true);
    		{
    			s.assertAll();
    		}
    	}
    	catch (Exception e) {
    		Reporter.log("Err msg is not displayed",true);
			// TODO: handle exception
    		s.fail();
    		
		}
    }
    

  
  
}
