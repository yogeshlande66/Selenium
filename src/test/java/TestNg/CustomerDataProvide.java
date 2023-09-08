package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CustomerDataProvide {
	  /*  @Test(dataProvider = "dp")
	   * 
public void f(Integer n, String s) {
	  
	  System.out.println(n+""+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}*/
      @DataProvider
	public Object[][] getData()
	  {
		  Object[][] data = {{"yoges@gmail.com","fsfgsgg"},{"test@gmail.com","fdfafa"},{"Test@gmail.com","fdsdfsd"}};
		  
		return data;
	  

	  
}
  
}
