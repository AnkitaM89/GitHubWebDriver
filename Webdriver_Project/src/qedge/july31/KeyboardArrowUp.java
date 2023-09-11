package qedge.july31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardArrowUp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Create account']")).click();
		Thread.sleep(4000);
		//Select option For My Personal use
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		driver.quit();
	}

}
