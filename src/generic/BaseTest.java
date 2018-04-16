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
	//public WebDriver driver1;
	@BeforeMethod 
	// test again
	public void preCondition() {
		{
	
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.betteru.in/");
	}
		/*{
	
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.betteru.in/");
		}*/
	}

   @AfterMethod 
   public void postCondition() {
	  // driver.quit();
	 //  driver1.quit();
   }
}

