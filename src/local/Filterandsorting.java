package local;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Filterandsorting {

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
		   
		    driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
		    driver.findElement(By.partialLinkText("Price: Low to High")).click();
		    
		    Thread.sleep(3000);
		
		  action.moveToElement(driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"))).build().perform();
          driver.findElement(By.partialLinkText("Apple")).click();
		  Thread.sleep(5000);
		  
        /*  List<WebElement> linklist = driver.findElements(By.partialLinkText(""));
          System.out.println("Size of full product :"+ linklist.size()); */
		  
          //driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")).click();	
	}

}
