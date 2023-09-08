import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {
	public static void main(String args[])
	
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
  
	 //Xpath -Address of an element_Dom- Document object module- Generated dynamically,Its traversed through the every node
	 //Absolute Path-Full path_
	 //Relative path- Partial Path_//*[@Id='logo]/a/iMG	
	 //Is there is not any attribute available then, Function should be used to addressed the element
	 //1_- //Tagname[normalize-space()](1);
	 //_//a[text()='value']
	 
//* Locating an Element with known attribute
	 //Syntax:- //*[@attributename='value']	
     String s=driver.findElement(By.xpath("//*[@class='_396cs4']")).getText();
     
      System.out.println(s);
	 
//*How does selenium works when there are multiple elements (Candiates) for an xpath?
	 //Eg. To select the third input element:- //form/input[3], //form/input[last()]
	 //     
      
      
	 
	 	//* Locating the static element (Static Inner text)_No any attribute there 
      //Eg:- //*[text()='Value']
      //Locating element when part of the visible text is static (Parial path)
      // Eg:- //*[contains(text(),'Inner text')]
      
	 
	 
      //Locating the element when prefix of inner text is static
      //Syntax:- //Tagname[starts-with(text,'prefix of the inner text')];
      //<a href="GFEFGGHHDHH">Pragmatic test labs</a>
      
	 //Locating the element with visible text in input elements
     //E.g:- <input type='text' name='FirstName' value='Janesh'>
      //input[@value='Janesh']
      
      
     //Locating element with multiple attribute 
      //E.G:-//*[@attribute='Value'][@attribute='Value']...[@AttributeN='Value'];
      //e.g:- //*[@attribute='value' and @attribute='value']
      //e.g//*[@attribute='avalue'];
      // starts-with(),text(),contains(),and,or
      
     
      //Locating elements relative to known element 
      //Locating the parent element:
      //E.g:- //input[@id='value']/parent::parent_tagname or * or /..
      
      
      //Locating the child element:
     //E.G:- //div[@id='value']/child::childn_tagname or / child_Tag_Name
      
      //Locating the grand children
      //E.g:- //form/*/input or //form/div[1]/input 
      
      
      //Locating the ancestor element 
      //e.g: //input[@id'Value']/ancestor::parent_of_parent name or ::*
      
      
      //following element-Indentify following element writing self_node xpath 
      // e.g:- //input[@id='Value']/following::input  or /*
      
      
      
      
      
	}
	
} 
