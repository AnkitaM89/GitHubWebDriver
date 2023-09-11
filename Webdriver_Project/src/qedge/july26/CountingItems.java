package qedge.july26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingItems {

	public static void main(String[] args) throws Throwable {
		// Write a script to select 0 to 6 items and get collection of selected items and print each item name
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/Ankita/RangaReddyDocs/Selenium/MultiListboxHtmlpage_lyst1549.html");
		Thread.sleep(2000);
        Select multiListBox = new Select(driver.findElement(By.name("multiSelection")));
        //Select each item upto index 6
        for(int i=0;i<=6;i++)
        {
        	Thread.sleep(1000);
        	multiListBox.selectByIndex(i);      	
        }
        //Get collection of selected items
        List<WebElement> items_Selected = multiListBox.getAllSelectedOptions();
        System.out.println("No.of selected items: "+items_Selected.size());
        //Print each selected item
        for (WebElement each : items_Selected) {
			System.out.println(each.getText());
		}
        Thread.sleep(1000);
        driver.close();
	}

}
