package local;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		// how to handle alerts 
		//we are doing on https://demoqa.com/automation-practice-form
		
		//step 1 : open browser
		System.setProperty("webdriver.chrome.","chromdriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		
		// we need to switch to alert because its not on same page so we need switch
		//accept: means we need to click on and dismiss
		
		//we created reference variable so we can give value to variable accept/dismiss
		
	Alert al = driver.switchTo().alert();
    	al.accept();
	
    	Thread.sleep(4000); //hard time 

	}
}
