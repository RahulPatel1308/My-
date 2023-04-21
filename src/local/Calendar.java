package local;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

         driver.get("https://demoqa.com/date-picker");
         
         String date= "13-August-2022";
         String dateArr[]= date.split("-");  // 13-08-1994
         String day= dateArr[0];
         String month =dateArr[1];
         String year =dateArr[2];
         
         driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
         Select select =new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
         select.selectByVisibleText(month);
         
         Select select1=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
         select1.selectByVisibleText(year);
      
       //div[@class='react-datepicker__day react-datepicker__day--001 react-datepicker__day--weekend']
	   //div[@class='react-datepicker__day react-datepicker__day--002']
       //div[@class='react-datepicker__day react-datepicker__day--003']
       //div[@class='react-datepicker__day react-datepicker__day--007 react-datepicker__day--weekend']
         
         String beforexpath = "//div[@class='react-datepicker__day react-datepicker__day--";
         String afterxpath = "]";
         
        final  int totalWeekdays =7;
        
        for(int rowNum=2; rowNum<=7; rowNum++) {
        	for(int colnum=1; colnum<=totalWeekdays; colnum++) {
        		
        	String dayvalue = driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colnum+"]")).getText();
        }
         
	}
         
         
	}}
         
         
         
         
	
