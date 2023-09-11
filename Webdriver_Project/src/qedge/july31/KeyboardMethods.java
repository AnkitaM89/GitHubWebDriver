package qedge.july31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMethods {

	public static void main(String[] args) throws Throwable {
		// Write a script to perform arrow down in keyboard for google page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Selenium Openings");
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform(); 
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform(); 
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform(); 
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		driver.quit();
	}

}
