package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_Method {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is used to execute the before all test cass");
	}
	
	 
@BeforeMethod
public void beforeMethod()
{
	System.out.println("Thisk is the before method");
}
  @Test(groups= {"SmokeTest"})
  public void demo() 
  {
  
  System.out.println("This is the Smoke tests method");
 }
 @Test(groups= {"SmokeTest"})
 public void get()
 {
	  System.out.println("This is the  smoke test method");
 }
  @AfterMethod
  
 public void afterMethod()
 {
	 System.out.println("Thi is the afte method");
 }
  @AfterClass void afterClass()
  {
	  System.out.println("This is the afterclass");
  }
  
  
  

}

