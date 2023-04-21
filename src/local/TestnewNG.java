package local;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestnewNG {

	//STEP 1 SYSTEM.SETPROPERTY(LOCATION OF DRIVER)
	//STEP 2 GET URL
	//STEP 3 PERFORM ACTION ON PARTICULAR ELEMENTS
	//STEP 4 CLOSE BROWSER
	
	//STLC WRITE TEST CASES
	//EXECUTE TEST CASES
	//WE LOG DEFECT
	
	@BeforeSuite // executed once so we give driver location System.setproperty
	public void beforesuite() {
		System.out.println("Before suits");
	}
	
	@BeforeTest //WebDriver driver=new ChromeDriver,implicit,page timeout
	public void Beforetest() {
		System.out.println("before test");
	}
	@BeforeClass //log in
	public void Beforeclass() {
		System.out.println("before class");
	}
	@BeforeMethod // we put here url bcz this method get executed before every test cases
	public void Beforemethod() {
		System.out.println("before method");
	}
	
	@Test(priority=1)
	public void Writetestcase() {
		
		System.out.println("first write test case");
	}
    @Test(priority=2)
    public void Executetestcases() {
    	System.out.println("execute test cases");
    }

    @Test(priority=3)
    public void Defect() {
    	System.out.println("log defect");
    }
    @AfterMethod //close browser after every test case
    public void aftremethod() {
    	System.out.println("after test");
    }
    @AfterClass //only once after all test cases are executed logout
    public void afterclass() {
    System.out.println("after class");
}
    @AfterTest // this will also be executed but after class condition 
    public void aftertest() {
    	System.out.println("after class");
    }
    @AfterSuite //At last when all other annotation have been executed according to sequence
    public void aftersuit() {
    	System.out.println("after suit");
    
    }
    }

