package TestNg;

import org.testng.annotations.Test;

public class Groups_B
{
	@Test(groups= {"smoke_Testing"})
	public void get()
	{
		System.out.println("This is my Class_B smoke testing");
	}
	@Test(groups= {"sanity"})
	public void show()
	{
		System.out.println("This is class B sanity");
	}
}
