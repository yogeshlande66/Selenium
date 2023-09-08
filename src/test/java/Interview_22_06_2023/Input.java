package Interview_22_06_2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Input {

public static void main(String args[])
{
	try
	{
	
	FileInputStream input=new FileInputStream("D:\\yogesh.txt");
 //int i1=input.read();
//  System.out.println((char)i);
	int  i=0;
	
	while((i=input.read())!=-1)
	{
		System.out.print((char)i);
	}
//	System.out.println();
  
 
	}
	catch(Exception e)
	{
		
		
	}
	
  }
}
