package local;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frameconcept {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.","C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe.");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");
			
		driver.navigate().to("https://www.amazon.ca/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
	 action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
	 
     driver.findElement(By.xpath("//a[.='Start here.']")).click();
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Rahul");
     driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
     driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@007");
     driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Rahul@007");
     driver.findElement(By.xpath("//input[@id='continue']")).click();
     
     driver.close();
	
	}
}
