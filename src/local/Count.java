package local;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Count {

	
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://www.amazon.ca/");
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   Thread.sleep(5000);      
		   Actions action= new Actions (driver);
		   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
	    
		   driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
		    driver.findElement(By.xpath(" //input[@id='continue']")).click();
		    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
		    driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
		    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		   
		   
			
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
            List<WebElement> linklist = driver.findElements(By.tagName("span"));
            
			
			System.out.println("Size of full product :"+ linklist.size());
			
			
			Thread.sleep(5000);
		    boolean output=	driver.findElement(By.partialLinkText("Apple iPhone XR, 64GB, Black - Fully Unlocked (Renewed)")).isDisplayed();
			Assert.assertEquals(true, output);
			System.out.println(output);
			
			//for next page 2 
			
         driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")).click();		
			
         boolean result=   driver.findElement(By.partialLinkText("Apple iPhone XR, 64GB, Black - Fully Unlocked (Renewed)")).isDisplayed();
         Assert.assertEquals(true, result);
         System.out.println(result);
         
	//WebElement Element = driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));
	//js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	

}
