package local;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		
		//step 1 : open browser
		System.setProperty("webdriver.chrome.","chromdriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.roicians.com");
		
	Actions action= new Actions(driver); // for mouse moment we need to use predifine action class
	// always pass reference variable of driver object
		//h reef link text 
	
	action.moveToElement(driver.findElement(By.cssSelector("#menu-item-65 > a"))).build().perform();
	 // build .perform is to implement to finish action
	driver.findElement(By.partialLinkText("SOFTWARE TEST")).click();
	Thread.sleep(3000);
	driver.close();//will close only tab
	driver.quit();//will close whole browser
	
     
}
	
}


   