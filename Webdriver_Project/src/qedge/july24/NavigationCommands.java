package qedge.july24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws Throwable {
		// Write a script to perform navigation commands on google page.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com/");
		Thread.sleep(5000);
		System.out.println("PageTitle[1]"+driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("PageTitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		//Click Back button in browser
		driver.navigate().back();
		System.out.println("PageTitle[3]"+driver.getTitle());
		Thread.sleep(5000);
		//Click Forward button in browser
		driver.navigate().forward();
		System.out.println("PageTitle[4]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
	}

}
