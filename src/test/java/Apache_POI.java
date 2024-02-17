import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Apache_POI {
	
	public static void main(String args[]) throws IOException
	{
	
	FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\config\\Book1.xlsx");
	XSSFWorkbook work=new XSSFWorkbook(file);
	XSSFSheet sheet=work.getSheetAt(0);
	Row row=sheet.getRow(0);
	org.apache.poi.ss.usermodel.Cell c=row.getCell(0);
	System.out.println(sheet.getRow(0).getCell(0));
	//String s=(String) c.getValue();
	//System.out.println(s);
		
	}
	
}
