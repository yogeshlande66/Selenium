package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgFirstProgram {
	
	@Test(groups= {"SmokeTest"})
	
public void get()
{ 
		System.out.print("This is the first test case");
	
}
	@Test(dependsOnMethods= {"get","get1"})
	public void show()
	{
		System.out.println("This is the 2nd test case");
	}
	 @Test(description="This is the very important method")
	 public void get1()
	 {
		  System.out.println("This is the third case");
	 }
	
	

}
