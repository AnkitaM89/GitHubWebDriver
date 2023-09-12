package qedge.aug4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args) throws Throwable {
		        //Print each row column data
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://money.rediff.com/mutual-funds");
		        //Store table into WebElement
				WebElement webTable= driver.findElement(By.className("dataTable"));
				List<WebElement> rows,cols;
				//Get the collection of rows in webTable
				rows = webTable.findElements(By.tagName("tr"));
				int row = rows.size()-1;
				System.out.println("No.of rows: "+row);
				//Iterate every row
				for (WebElement eachRow : rows) {
					//Iterate every column
					cols = eachRow.findElements(By.tagName("td"));
					for (WebElement eachCol : cols) {
						//Print each column data
						Thread.sleep(1000);
						System.out.print(eachCol.getText()+"\t");
		           }
					System.out.println();
					System.out.println("==============================================================================================================================================");
				}
				driver.close();

	}

}
