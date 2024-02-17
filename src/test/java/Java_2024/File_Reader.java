package Java_2024;

import java.io.FileReader;
import java.io.FileWriter;

public class File_Reader 
{
	public static void main(String args[])
	{
		 String s="Yogkjbjb";
	
		try
		{
		//FileReader file=new FileReader("F:\\yogesh123.txt");
	FileWriter fw=new FileWriter("F:\\yogesh128765.txt");

   fw.write(s);
	   fw.close();
   }
      catch(Exception e)
       {
			System.out.println(e);
		} 
    
	
	

	}
	
	}
	


