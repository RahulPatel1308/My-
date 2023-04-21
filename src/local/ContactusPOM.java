package local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPOM {
	

     WebDriver driver ;
     
	@FindBy(id="text-77525447616") WebElement FName;
	
	//reference variable.findelement(By.id("value")).sendkeys();
	
	@FindBy(id="text-95374915097") WebElement Lname;
	@FindBy(id="text-27022866830") WebElement Ename;
 public ContactusPOM (WebDriver driver) {
	  
	 PageFactory.initElements(driver, this);
 }
	
	public ContactusPOM() {
}

	public void typefname(String name) {
		
		FName.sendKeys(name);
	}
	
	
	public void typeLname(String name) {
		
		Lname.sendKeys(name);
}
public void typeEame(String name) {
		
		Ename.sendKeys(name);
}
}
