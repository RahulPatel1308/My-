package local;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinksandimages {

	public static void main(String[] args) throws MalformedURLException, IOException {


		System.setProperty("webdriver.chrome.","C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe.");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.get("https://www.larousse.fr/");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of full links and image :"+ linklist.size());
		
		List<WebElement> activelinks =new ArrayList<WebElement>();
		
		for(int i=0; i<linklist.size();i++) {
			if(linklist.get(i).getAttribute("href")!=null && (! linklist.get(i).getAttribute("href").contains("javascript"))){
				activelinks.add(linklist.get(i));
				System.out.println("Size of active links and image"+activelinks.size());
			}}
			
		    for(int j=0; j<activelinks.size();j++) {
		    	
		 HttpURLConnection connection= (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
		 connection.connect();
		 String response= connection.getResponseMessage();
		 connection.disconnect();
		 System.out.println(activelinks.get(j).getAttribute("href")+ response );
		    }
	}}
		
	
