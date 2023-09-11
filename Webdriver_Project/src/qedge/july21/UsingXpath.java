package qedge.july21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Regist")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Anamika");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("9921234567");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anamikaGhosh@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Hyderabad Charminar");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Female");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("20-Dec-1978");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
