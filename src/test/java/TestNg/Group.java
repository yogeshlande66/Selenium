package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Group {
  private static final String groups = null;
@Test(groups="sanity")
  public void Sanity() {
	  
	  System.out.println("Sanity tesing is there");
	  
  }
@Test(groups="smoke")

  public void Smoke() {
	  System.out.println("Smoke testing is going on");
  }
@Test(groups="integration testing")

  public void Integration() 
{
	  System.out.println("Integration testing is going on");
	  
	  
  }
}
