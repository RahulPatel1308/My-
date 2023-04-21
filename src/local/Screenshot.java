package local;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		//step 1 : open browser
				System.setProperty("webdriver.chrome.","chromdriver.exe");
				
				//step 2 : type URL
				
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.roicians.com/contact-us/");
	
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C://screenshot.jpg"));
		
	}

}
