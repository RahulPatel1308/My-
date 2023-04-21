package local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.","chromdriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");

	}

}
