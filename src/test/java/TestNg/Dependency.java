package TestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

private static final boolean ture = false;
@Test
  public void startCarr() {
	  System.out.println("Start THE CAR");
	  Assert.fail();
  }
  @Test(dependsOnMethods={"startCarr","parkCar"},alwaysRun=ture)
  public void driverCar() {
	  System.out.println("Drive the cars");
	  Assert.fail();
  }
  @Test
  public void stopCar()
  {
	  System.out.println("Stop the car");
  }
  @Test
  public void parkCar()
  {
	  System.out.println("pARK tHE  CAR");
  }
  
}
