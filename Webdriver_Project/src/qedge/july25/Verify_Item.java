package qedge.july25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {

	public static void main(String[] args) throws Throwable {
		//Write a script to search if a particular item exist in collection
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		String expected_Item = "Baby";
		boolean item_Exist = false;
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));

		//Get collection of items in dropdown
		List<WebElement> all_Items = dropdown.getOptions();
		System.out.println("No.of items in the dropdown :: "+ all_Items.size());
		for (WebElement each : all_Items) {
			Thread.sleep(2000);
			String actual_Items = each.getText();
			System.out.println(actual_Items);
			if(actual_Items.equalsIgnoreCase(expected_Item))
			{
				item_Exist = true;
				break;
			}
		}
		if(item_Exist)
		{
			System.out.println(expected_Item + " found in Listbox");
		}
		else
		{
			System.out.println(expected_Item + " not found in Listbox");
		}
		driver.quit();

	}

}
