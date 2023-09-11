package qedge.july31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"))).perform();
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).perform();
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.linkText("Puzzles"))).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
