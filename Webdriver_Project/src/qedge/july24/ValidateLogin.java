package qedge.july24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws Throwable {
		//write a script to validate login module
		//store username and password into webelement to access multiple webelement methods
		//capture username and passwo textrd values using getattribute
		//capture error message
		//validate url contains dashboard 


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//Store username textbox into webelement
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.clear();
		//userName.sendKeys("test");
		userName.sendKeys("Admin");
		//Capture Username value
		String enterUserName=userName.getAttribute("value");

		//Store Password textbox into webelement
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		//Capture Password value
		String enterPassword=password.getAttribute("value");
		System.out.println(enterUserName + "   " + enterPassword);
		//Click Login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Login Successful::"+expected+"   "+actual);
		}
		else {
			//Capture error message
			String error_Msg=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println("Login Failed::"+error_Msg);
		}
		driver.quit();

	}

}
