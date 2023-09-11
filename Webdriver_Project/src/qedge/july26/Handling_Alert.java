package qedge.july26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {

	public static void main(String[] args) throws Throwable {
		// Write a script to handle alert in a webpage
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click login button without username and password
		driver.findElement(By.name("proceed")).click();
		//capture alert text
		String alert_message = driver.switchTo().alert().getText();
		System.out.println(alert_message);
		Thread.sleep(5000);
		//click ok in alert window
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();


	}

}
