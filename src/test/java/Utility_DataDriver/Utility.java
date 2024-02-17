package Utility_DataDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public static Object fetchPropertyValue(String key) throws IOException
	{
		//   Reading the data
		Properties pro=new Properties(); // Creating the Properties file
		
		FileInputStream  file=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\config\\config.properties");
		//Lods file into proppertys
		  pro.load(file);
		  //Passing the value of the key
		  return  pro.get(key);
	
	}
	

	
	
}
