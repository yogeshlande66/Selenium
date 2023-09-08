package RestAssured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.impl.common.IOUtil;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;


public class SOUAP_UI {
	@Test
	
	public void validateSoap() throws IOException
	{
		
	 int a=200;
	//String baseURI="h	ttps://ecs.syr.edu/faculty/fawcett/handouts/cse686/code/calcWebService";
	
		
	File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\src\\test\\java\\RestAssured\\add.xml");
	
if(f.exists())
{
	System.out.println("File is exits");
}
	
	FileInputStream file=new FileInputStream(f);
	String s=IOUtils.toString(file);
		
	     RestAssured.given()
	      .when()
	      .contentType("Text/XML").accept(ContentType.XML)
	      .body(s)
	      .when().post("https://ecs.syr.edu/faculty/fawcett/handouts/cse686/code/calcWebService/Calc.asmx").then().statusCode(200).log().all();
	     
	  
	    
	 
	}

}
