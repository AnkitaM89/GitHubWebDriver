package qedge.aug19;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertIntToString {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Ankita/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		String eid="";
		for(int i=1;i<=rc;i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			if(ws.getRow(i).getCell(3).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
			int cellData = (int)ws.getRow(i).getCell(3).getNumericCellValue();//type case double to int
			eid = String.valueOf(cellData);
			}
			
			System.out.println(fname+"\t"+mname+"\t"+lname+"\t"+("EMP"+eid));
			
		}
		fi.close();
		wb.close();
	}

}
