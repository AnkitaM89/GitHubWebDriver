package qedge.aug19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteCellData {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Ankita/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		for(int i=1;i<=rc;i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			int eid = (int)ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+"\t"+mname+"\t"+lname+"\t"+eid);
			
			//Write as Pass into Status column
			ws.getRow(i).createCell(4).setCellValue("Pass");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/Ankita/SampleResult.xlsx");
		wb.write(fo);
		wb.close();

	}

}
