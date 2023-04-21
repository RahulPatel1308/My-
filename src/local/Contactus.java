package local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {

	//step 1 : open browser
	System.setProperty("webdriver.chrome.","chromdriver.exe");
	
	//step 2 : type URL
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.roicians.com/contact-us/");
	
	ContactusPOM abc= new ContactusPOM(driver);
	abc.typefname("Rahul");
	abc.typeLname("patel");
	abc.typeEame("erajul@gmail.com");
	}}
		
		

