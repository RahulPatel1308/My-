package local;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificationcommand {

	public static void main(String[] args) {
		
		//step 1 : open browser
		System.setProperty("webdriver.chrome.","chromdriver.exe");
		
		//step 2 : type URL
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	boolean result=	driver.findElement(By.cssSelector(".gb_d")).isEnabled();
		System.out.println(result);
		
		// how to create cssselector
		//when we get classname we can make cssselector by putting . classname
		//when we get id we can make cssselector by putting # classname 

	}

}
