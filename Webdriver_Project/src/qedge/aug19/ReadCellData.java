package qedge.aug19;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellData {

	public static void main(String[] args) throws Throwable {
		// Read path of the file
		FileInputStream fi = new FileInputStream("D:/Ankita/Sample.xlsx");
        //Get Workbook from file
		XSSFWorkbook wb =  new XSSFWorkbook(fi);
		//Get Sheet from Workbook by specifying Sheet index no.
		XSSFSheet ws = wb.getSheetAt(0);
		//Get no. of rows in Sheet
		int rc = ws.getLastRowNum();
		System.out.println("No.of rows : "+rc);
		//Get specific row from Sheet
		XSSFRow row6 = ws.getRow(6);
		//Read row6 each Cell data and store into String variables
		XSSFCell c1= row6.getCell(0);
		XSSFCell c2= row6.getCell(1);
		XSSFCell c3= row6.getCell(2);
		XSSFCell c4= row6.getCell(3);
		
		String fname = c1.getStringCellValue();
		String mname = c2.getStringCellValue();
		String lname = c3.getStringCellValue();
		int eid = (int)c4.getNumericCellValue();
		System.out.println(fname+"      "+mname+"      "+lname+"       "+eid);
		fi.close();
		wb.close();
	}

}
