package TestNg;

import org.testng.annotations.Test;

public class Group_A {
	
	@Test(groups= {"smoke_Testing"})
	public void  smoke()
	{
		System.out.println("This is smoke testing case");
		
	}
	
	@Test(groups= {"sanity"})
	public void groups()
	{
	System.out.println("Thi is sanity testing");	
	}
	
	{
		
	}

}
