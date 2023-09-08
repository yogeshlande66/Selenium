package Interview_22_06_2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelWriteData {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("F:\\yogsh.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//XSSFSheet sheet = workbook.getSheetAt(0);
		Row row=sheet.createRow(0);
         XSSFCell cell=(XSSFCell) row.createCell(0);
         cell.setCellValue("SoftwareTestingMaterial.com");
 		FileOutputStream fos = new FileOutputStream("D:\\yogsh.xlsx"); 
 		workbook.write(fos);
 		fos.close();
 		System.out.println("Writing the data into the excel file");
 		}

}