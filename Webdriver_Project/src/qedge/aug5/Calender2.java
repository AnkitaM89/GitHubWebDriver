package qedge.aug5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String dob = "12/April/2024";
		String temp[]=dob.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		//Switch to frame
		driver.switchTo().frame(0);
		//Click textbox to open calender
		driver.findElement(By.className("hasDatepicker")).click();
		Thread.sleep(2000);
		//Capture calender year
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			Thread.sleep(1000);
			if(Integer.parseInt(calYear)<Integer.parseInt(year))
			{
				//Click next button
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			else
			{
				//Click prev button
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			Thread.sleep(1000);
			//get year text
			calYear=(driver.findElement(By.className("ui-datepicker-year")).getText());
			System.out.println(calYear);
		}
		//Capture calender month
		String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			if(Integer.parseInt(calYear)<=Integer.parseInt(year))
			{
				//Click next button
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			else
			{
				//Click prev button
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
				
		  
		Thread.sleep(1000);
		//get month text
		calMonth=(driver.findElement(By.className("ui-datepicker-month")).getText());
		System.out.println(calMonth);
		}
		//get date table into WebElement
				WebElement dateTable = driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement> rows,cols;
				//get rows collection
				rows=dateTable.findElements(By.tagName("tr"));
				//iterate every row
				for (WebElement eachRow : rows) {
					//get columns collection
					cols = eachRow.findElements(By.tagName("td"));
					//iterate every column
					for (WebElement eachCol : cols) {
						//get column data and check if it equals the chosen date
						if(eachCol.getText().equals(date))
						{
							Thread.sleep(5000);
							eachCol.click();
							break;
						}
							
					}
				}
				Thread.sleep(3000);
				driver.close();
	}

}
