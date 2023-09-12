package qedge.aug4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable1 {
	public static void main(String[] args) throws Throwable {
		//Get collection of rows in a table and no. of columns in each row
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
        //Store table into WebElement
		WebElement webTable= driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		//Get the collection of rows in webTable
		rows = webTable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No.of Rows: "+row);
		for(int i=1;i<=row;i++)
		{
			//Get cell collection
			cols=rows.get(i).findElements(By.tagName("td"));
			//Thread.sleep(2000);
			System.out.println("Row no."+i+ " Column Size: "+cols.size());
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
