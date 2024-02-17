package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramet {
	@Test
	@Parameters({"a","b"})
	public void get(int c,int d)
	{
		
		int sum=c+d;
		System.out.print(sum);
		
	}
	

}		
