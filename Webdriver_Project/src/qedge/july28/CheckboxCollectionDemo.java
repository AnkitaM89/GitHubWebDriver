package qedge.july28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxCollectionDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/Ankita/RangaReddyDocs/Selenium/28July/checkbox_1_lyst6944.html");
		Thread.sleep(2000);
        //get collection of all checkboxes
		List<WebElement> all_checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No.of checkboxes: "+all_checkboxes.size());
		//check which checkbox is selected
		for (WebElement each : all_checkboxes) {
			boolean isSelected = each.isSelected();
			String checkboxName =each.getAttribute("value");
			System.out.println(checkboxName+" "+isSelected);
			Thread.sleep(1000);
			//Check the checkboxes those are not selected and uncheck those checkboxes which are selected
			each.click();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
