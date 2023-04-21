package local;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicwebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.","C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe.");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Thread.sleep(2000);
		
	    //*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		// instead of using hardcoded value we can use this so in future if we have hundred row we dnt have come and change the value for i
		
    	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	    int rowCount = rows.size();
	    System.out.println("Total rows in web table :"+ rowCount);
		
		
		
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for (int i=2; i<=rowCount; i++) {
			String actualxpath= beforeXpath+i+afterXpath;
			WebElement element= driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Island Trading")) {
			System.out.println("company name: "  + element.getText()+ "is found" + "at position : "+ (i-1) );
			break;
			}
		}
		
		System.out.println("******");
		
		////*[@id="customers"]/tbody/tr[2]/td[2]
		
		String BeforeXpath="//*[@id='customers']/tbody/tr[";
        String afterconatactXpath="]/td[2]";
	     
        for (int i=2; i<=rowCount; i++) {
			String actualxpath= BeforeXpath+i+afterconatactXpath;
			WebElement element= driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
	         }
	
        System.out.println("*****");
      //*[@id="customers"]/tbody/tr[2]/td[3]
	
        String beforeXpathCountry ="//*[@id='customers']/tbody/tr[";
        String aftercountryXpath ="]/td[3]";
        for (int i=2; i<=rowCount; i++) {
			String actualxpath= beforeXpathCountry+i+aftercountryXpath;
			WebElement element= driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
	}
        //how to hanlde columns in webtable
        //firts we will try to find pattern just like we did it for rows
        
      //*[@id="customers"]/tbody/tr[1]/th[1]
      //*[@id="customers"]/tbody/tr[1]/th[2]
      //*[@id="customers"]/tbody/tr[1]/th[3]
        
        String ColXpathbefore = "//*[@id='customers']/tbody/tr[1]/th[";
        String ColXpathafter = "]";
     List<WebElement> cols= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
     int colcount =cols.size();
     System.out.println ("total number of column :"+ colcount);
     
     System.out.println("Columns values are");
     
     for (int i=1; i<=colcount; i++) {
			String actualxpath= ColXpathbefore+i+ColXpathafter;
			WebElement element= driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
	}
	}
	 
	}
