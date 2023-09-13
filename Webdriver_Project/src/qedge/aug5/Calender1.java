package qedge.aug5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com/");
		//Click Register link
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        //Click dob textbox
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).click();
		String dob = "13-Nov-1990";
		String temp[]=dob.split("-");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		//Select year from listbox
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).selectByVisibleText(year);
	   //Select month from listbox
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).selectByVisibleText(month);
		Thread.sleep(2000);
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
					Thread.sleep(1000);
					eachCol.click();
					break;
				}
					
			}
		}
		Thread.sleep(3000);
		driver.close();
	}

}
