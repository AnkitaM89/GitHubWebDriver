package qedge.july25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItems {

	public static void main(String[] args) throws Throwable {
		//Write a script to select items in day,month and year Listbox in fb.Verify List is single /multiselection.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create new accou")).click();
        Thread.sleep(1000);
        //Store day,month and year listbox into Select Class
        
        Select dayList = new Select(driver.findElement(By.name("birthday_day")));
        Select monthList = new Select(driver.findElement(By.name("birthday_month")));
        Select yearList = new Select(driver.findElement(By.name("birthday_year")));
        
        //Verify year Listbox is Single/multi selection
        
        boolean value = yearList.isMultiple();
        System.out.println(value);
        
        //Select items in three listboxes
        
        dayList.selectByIndex(26);
        Thread.sleep(1000);
        monthList.selectByVisibleText("Apr");
        Thread.sleep(1000);
        yearList.selectByVisibleText("1989");
        Thread.sleep(1000);
        driver.close();
	}

}
