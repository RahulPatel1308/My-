package local;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestseleniumNG {
	
	SoftAssert obj=new SoftAssert(); 
	/* we assigned global varible for softassert and softassert is predefine so we need to
	create object as you can see in test1 */
	
	WebDriver driver=new ChromeDriver(); //we need o assign globally so we can use every method
 
	@BeforeSuite //will Executed once 
	public void driversetup() {
		System.setProperty("webdriver.chrome.","chromdriver.exe");
	}
	//@BeforeTest 
	//public void IntialSetup() {
		//driver=new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
	
	@BeforeMethod //here we always write URl which we want to open before every test case
	
	public void before() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		obj=new SoftAssert();
		}
	
	@Test (priority=1, groups = "title")// enabled=false FOR SKIPPING TEST	
	
	//we can group our test cases by giving them groups
	
	public void gettitle () {
		String Title= driver.getTitle(); // assign with variable so we can display it
		System.out.println(Title);
		obj.assertEquals(Title, "yahoo");
		obj.assertAll();
		//Assert.assertEquals(Title,"yahoo");
		
		// Assert to check actual result is same as expected result
		//Title is my name of reference variable
		//where as Yahoo is example if we have some client requirement for expected result
		
		driver.close();
	}
    @Test (priority=2, groups="verification",dependsOnMethods="gettitle")
    
    /*dependsOnMethods="method name of that case on which its depended" // this will help us if dependent method is failed it wont
    execute another test cases */
    
    public void titledisplay() {
    	boolean a= driver.findElement(By.linkText("Gmail")).isDisplayed();
    	
    	// is display is to check variable on site
    	// BCZ it will gives result in true or false thats why we store in boolean
    	
    	System.out.println(a);
    }
    
    @AfterMethod
    public void Afterethod() {
    	driver.quit();
    }
}


