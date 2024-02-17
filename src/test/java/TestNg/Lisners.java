package TestNg;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lisners 
{
	@Test(priority=1)
	
	public void get()
	{
		System.out.println("This is the first test case");
		Assert.assertEquals(1,1);
	}
	@Test(priority=2)
	public void show()
	{
Assert.assertEquals("A","B");
}
	@Test(priority=3,dependsOnMethods={"show"})
	public void get1()
	{
    Assert.assertEquals(1,1);		
	}
	
}
