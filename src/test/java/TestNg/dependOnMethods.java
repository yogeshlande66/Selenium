package TestNg;

import org.testng.annotations.Test;

public class dependOnMethods {
	@Test
	public void A()
	{
		System.out.println("This is the A test cases");
		
		
	}
	@Test(dependsOnMethods= {"A"})
	public void B()
	{
		System.out.println("This is depend on A");
	}
}



