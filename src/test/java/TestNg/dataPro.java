package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataPro {
	
	
	
@Test(dataProvider="getData",dataProviderClass=CustomerDataProvide.class)


public void data1(String u,String k) 
{
		System.out.println(u+""+k);
		
}
}

	
	
	
	//@Test(dataProvider="getData")
	/*public void loin(String username,String pass)
	{
	 System.out.println(username+""+pass);
		
	}

 
  @DataProvider
  public Object[][] getData()
	  {
		  Object[][] data = {{"yoges@gmail.com","fsfgsgg"},{"test@gmail.com","fdfafa"},{"Test@gmail.com","fdsdfsd"}};
		  
		return data;
	  
  
	  
  }*/
	
	

