package local;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Elements {

	public static void main(String[] args) {
		
		//step 1 : open browser
				System.setProperty("webdriver.chrome.","chromdriver.exe");
				
				//step 2 : type URL
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.roicians.com/career/");
				
			Select obj=	new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));
			//obj.selectByVisibleText("Automation Testing Trainer");
           // obj.selectByValue("Automation Testing Trainer");
			obj.selectByIndex(3);
	}

}
