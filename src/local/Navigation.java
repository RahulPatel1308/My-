package local;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		
		//step 1 : open browser
		System.setProperty("webdriver.chrome.","chromdriver.exe");
		
		//step 2 : type URL
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.roicians.com/contact-us/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();  //to close current tab
		driver.quit();  // It will close whole browser
		

	}

}
