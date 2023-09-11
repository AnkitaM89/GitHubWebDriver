package qedge.july26;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection1 {

	public static void main(String[] args) throws Throwable {
		// Write a script to select 0 to 8 items and deselect the items from the listbox
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/Ankita/RangaReddyDocs/Selenium/MultiListboxHtmlpage_lyst1549.html");
		Thread.sleep(2000);
        Select multiListBox = new Select(driver.findElement(By.name("multiSelection")));
        
        //Verify if ListBox is multiselect or not
        boolean value = multiListBox.isMultiple();
        System.out.println(value);
        
        for(int i=0;i<=8;i++)
        {
        	Thread.sleep(1000);
        	multiListBox.selectByIndex(i);      	
        }
        
        //Deselect from listbox
        multiListBox.deselectByVisibleText("White");
        Thread.sleep(1000);
        multiListBox.deselectByIndex(0);
        Thread.sleep(1000);
        multiListBox.deselectByValue("yellow");
        Thread.sleep(1000);
        multiListBox.deselectByVisibleText("Red");
        Thread.sleep(1000);
        multiListBox.deselectAll();
        driver.close();
        
	}

}
