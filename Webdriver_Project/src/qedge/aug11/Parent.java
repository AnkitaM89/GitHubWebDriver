package qedge.aug11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
 
	public static WebDriver driver;
	public static void primusLogin(String userName,String password)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtuId")).sendKeys(userName);
		driver.findElement(By.name("txtPword")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	public static void closeBrowser()
	{
		driver.close();
	}
}
