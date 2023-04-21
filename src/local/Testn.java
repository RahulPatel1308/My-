package local;

import org.testng.annotations.Test;

public class Testn {
	
	@Test(priority=1)
	public void writetestcase() {
		System.out.println("First test cases is supposed to be written");
	}

	@Test (priority=2)
	public void executetest() {
		System.out.println("Secondly test case is supposed to be executed");
  }

	@Test (priority=3)
	public void defectlog() {
		System.out.println("mark a defect");
  }


}





