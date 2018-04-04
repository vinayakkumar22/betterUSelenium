package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconst {
	
	public WebDriver driver;
	public WebDriver driver1;
	@BeforeMethod 
	
	public void preCondition() {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.betteru.in/");
	}
	
	//before method 3
	@BeforeMethod	
	public void preCondition1() {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver1.get("https://www.betteru.in/");
		
	}

   @AfterMethod
   public void postCondition() {
	   driver.quit();
   }
}

