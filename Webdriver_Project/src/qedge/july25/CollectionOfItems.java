package qedge.july25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollectionOfItems {

	public static void main(String[] args) throws Throwable {
		//Write a script to get collection of items in a listbox and print each item name
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));

		//Get collection of items in dropdown
		List<WebElement> all_Items = dropdown.getOptions();
		System.out.println("No.of items in the dropdown :: "+ all_Items.size());
		for (WebElement each : all_Items) {
			Thread.sleep(2000);
			System.out.println(each.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
