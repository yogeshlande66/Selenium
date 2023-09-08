package Interview_22_06_2023;

import java.io.FileOutputStream;

public class FileOutput {
	public static void main(String args[])
	{
	 try
	 {
		 FileOutputStream file=new FileOutputStream("D:\\yogesh.txt");
		// file.write(65);
      String s="Yogeshlande welcome to the java class";
      byte b[]=s.getBytes();
     file.write(b);
    System.out.println(b);
    file.close();
		 
	 }
	  catch(Exception e)
	 {
		  System.out.println(e);
	 }
	
	}
}
	
