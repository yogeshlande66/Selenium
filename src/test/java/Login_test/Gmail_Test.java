package Login_test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import N_Base.Gmail_Base;
import Pages.Gmail_Login_Page;

public class Gmail_Test extends Gmail_Base{

	@Test
	public void ini(){
		Gmail_Login_Page page=PageFactory.initElements(driver,Gmail_Login_Page.class);
		/*loginpage.setEmail("abc@gmail.com");
        loginpage.clickOnNextButton();
        loginpage.setPassword("23456@qwe");
        loginpage.clickOnNextButton();*/
		page.setEmail("gffg");
		page.clickOnNextButton();
		
		page.setPassword("fsgsfgsfg");
		
		
		

		
	}
	
}
