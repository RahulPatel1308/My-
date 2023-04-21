package local;

import java.util.concurrent.TimeUnit;

import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiteventjava {

	public static void main(String[] args) throws InterruptedException {
	
		//step 1 : open browser
		System.setProperty("webdriver.chrome.","chromdriver.exe");
		
		//step 2 : type URL
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.roicians.com/contact-us/");
		
		//step 3 
		driver.findElement(By.id("text-77525447616")).sendKeys("Rocians");
		
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-77525447616")));
		
		 
		// hard wait or static wait
		Thread.sleep(100);
		
		//for checking language
		
		//System.out.println("Driver language: " + ((JavascriptExecutor)
	
		//driver).executeScript("return window.navigator.language"));
	
	}
	

}
