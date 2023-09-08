package Interview_22_06_2023;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class driverinstance {
	

		public static void main(String args[]) throws FileNotFoundException,java.lang.NullPointerException

		{
			try
			{
		   

		FileInputStream input=new FileInputStream("F:\\yogsh.xlsx");
		
			XSSFWorkbook work=new XSSFWorkbook();
			XSSFSheet sheet=work.getSheet("sheet");
		 int totalNum=sheet.getLastRowNum();
		 int totalCell=sheet.getRow(1).getLastCellNum();
		 for(int r=0;r<totalNum;r++ )
		 {
			 
	  XSSFRow r1=sheet.getRow(r);
	
		 
		
			 for(int c=0;c<totalCell;c++)
			 {
				  String s=r1.getCell(c).toString();			 
				  System.out.print(s);
		
			 }
			  System.out.println();
			 
		 }
		 
		 work.close();
		 input.close();
			}
			

		 
		 
	
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		

		}
}
