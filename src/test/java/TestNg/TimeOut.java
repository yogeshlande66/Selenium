package TestNg;

import org.testng.annotations.Test;

public class TimeOut {

	@Test(timeOut=200)
	public void ICIC() throws InterruptedException
	{
		Thread.sleep(200);
		System.out.println("This is ICIC bank");
		
		
	}
	@Test
	public void SBI()
	{
		System.out.println("This is SBI bank");
		
	}
	
	@Test
	public void MH()
	{
		System.out.println("This is MH bank");
		
	}
	
}
