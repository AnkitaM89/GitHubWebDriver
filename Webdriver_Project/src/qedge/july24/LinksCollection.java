package qedge.july24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCollection {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		//Get collection of hyperlinks in a webpage
		List<WebElement> All_Links = driver.findElements(By.tagName("a"));
		System.out.println("No. of links ::"+All_Links.size());
		
		for (WebElement each : All_Links) {
		System.out.println(each.getText());
		System.out.println(each.getAttribute("href"));
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
