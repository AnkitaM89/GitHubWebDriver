package qedge.aug18;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountRowCells {

	public static void main(String[] args) throws Throwable {
		//Read path of excel file
		FileInputStream fi = new FileInputStream("D:/Ankita/Sample.xlsx");
		//Get Workbook from File
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//Get Sheet from Workbook
		XSSFSheet ws = wb.getSheet("Emp");
		//Count number of rows in Sheet
		int rowCount = ws.getLastRowNum();
		//Get first Row from Sheet
		XSSFRow row = ws.getRow(0);
		//Get number of cells from First row
		int cellCount = row.getLastCellNum();
		System.out.println("No.of rows: "+rowCount+"   No.of columns: "+cellCount);
        fi.close();
        wb.close();
	}

}
