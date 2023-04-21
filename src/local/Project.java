package local;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Project {
	
	WebDriver driver=new ChromeDriver();
	Actions action=new Actions(driver);
	
			
	@BeforeSuite
	public void first() {
		System.setProperty("webdriver.chrome","chrome.exe");
	}
    
	@BeforeMethod
	
	public void second () throws IOException {
		driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://www.amazon.ca");
	}
		
	/*	@Test (priority=2)
		public void firststep () {
			boolean result=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		    System.out.println(result);*/
		
		
		@Test(priority=1)
		public void secondstep() throws IOException, InterruptedException {
			
			//driver.navigate().refresh();
			
			//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			
			Thread.sleep(3000);
			
			action.moveToElement(driver.findElement(By.className("nav-icon nav-arrow"))).build().perform();
			
			driver.findElement(By.xpath("//a[.='Start here.']")).click();
		    
			
		 try {
				driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			}
			catch(StaleElementReferenceException b )
			{
				System.out.println("handled");
			}
			
		    driver.findElement(By.xpath("//a[.='Start here.']")).click();
		    
			try {
				driver.findElement(By.xpath("//a[.='Start here.']")).click();
			}
			catch(StaleElementReferenceException e)
			{
				System.out.println("handled");
			}
				
			//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
			
			driver.findElement(By.id("ap_customer_name")).sendKeys("Rahul");
		    driver.findElement(By.id("ap_email")).sendKeys("4388121332");
		    driver.findElement(By.id("ap_password")).sendKeys("RAHUL@pATEL");
		    driver.findElement(By.id("ap_password_check")).sendKeys("RAHUL@pATEL");
		    driver.findElement(By.id("continue")).click();
		
		
	    }
          @AfterMethod
          public void laststep() {
        	  driver.quit();
          }
}
 


