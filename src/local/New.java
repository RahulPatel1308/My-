package local;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New {

	 
	WebDriver driver=new ChromeDriver();
	Actions action= new Actions(driver);
	
	
	public static void main(String[] args) throws IOException {
		
		

		System.setProperty("webdriver.chrome","chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.ca");
		boolean result=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	    System.out.println(result);
	    
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
	    
	    Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	    
	    
	    driver.findElement(By.xpath("//a[.='Start here.']")).click();
	    
	    File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("D://screenshot.jpg"));
	    
	    
	    driver.findElement(By.id("ap_customer_name")).sendKeys("Rahul");
	    driver.findElement(By.id("ap_email")).sendKeys("4388121332");
	    driver.findElement(By.id("ap_password")).sendKeys("RAHUL@pATEL");
	    driver.findElement(By.id("ap_password_check")).sendKeys("RAHUL@pATEL");
	    driver.findElement(By.id("continue")).click();
	    driver.close();
	    
	    }
}
