package TestNG_POM_Project;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(simple_1.class)


public class Simple {
  @Test
  public void sum() {
	  
	  int sum=0;
	  int a=4;
	  int b=2;
	  
	  sum=a+b;
	  
	 System.out.println("The sum of two no: "+sum);
	 }
  @Test
  public void fail() {
	  System.out.println("The test case is failed");
	  Assert.assertTrue(false);  
  }
  
}
