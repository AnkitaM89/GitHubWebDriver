package qedge.aug4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable3 {

	public static void main(String[] args) throws Throwable {
		String expected = "UK";
		boolean country_Exist=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Thread.sleep(2000);
        WebElement webTable = driver.findElement(By.id("customers"));
        List<WebElement> rows,cols;
        //Get collection of rows
        rows = webTable.findElements(By.tagName("tr"));
        int row = rows.size()-1;
        System.out.println("No.of rows in table:"+row);
        //iterate every row
        for(int i=1;i<rows.size();i++)
        {
        	//get collection of columns
        	cols = rows.get(i).findElements(By.tagName("td"));
        	if(i==1)
        	System.out.println("No.of columns in each row:"+cols.size());
        	//iterate every column
        	for(int j=0;j<cols.size();j++)
        	{
        		//get each column data
        		String actual=cols.get(j).getText();
        		Thread.sleep(2000);
        		System.out.print("\n"+actual);
        		if(actual.equalsIgnoreCase(expected))
        		{
        			country_Exist=true;
        			System.out.print(" Expected country found at row "+i+"and column "+(j+1));
        		}
        	}
        	System.out.println();
        	System.out.println("============================================================");
        }
        if(country_Exist)
        {
        	System.out.println(expected+" found in table");
        }
        else
        {
        	System.out.println(expected+" not found in table");
        }
        driver.close();
	}

}
