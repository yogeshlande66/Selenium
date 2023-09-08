package Interview_22_06_2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.interfaces.RSAKey;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		
		
	FileInputStream  file=new FileInputStream("F:\\yogsh.xlsx");
		//FileOutputStream file=new FileOutputStream("");
		
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	 XSSFSheet sheet=workbook.getSheet("Sheet1");
	// Row r1=sheet.getRow(0);
	// org.apache.poi.ss.usermodel.Cell c=r1.getCell(0);
	 int RowNum=sheet.getLastRowNum();
	 int Cell=sheet.getRow(1).getLastCellNum();
	
	 //org.apache.poi.ss.usermodel.Cell c=r.getCell(0);
	// System.out.println(RowNum+"\n"+Cell);
	 
	 for(int r=0;r<RowNum;r++)
	 {
		
	XSSFRow s=sheet.getRow(r);
	
	for(int c1=0;c1<Cell;c1++)
	{
		String val=s.getCell(c1).toString();
		
		  System.out.print(val);
		 
	}
	System.out.println();

	 }
	}

	}
