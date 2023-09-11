package qedge.aug1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		//Right click gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(2000);
		//Robot class is used to perform any action in window related GUI
		Robot r = new Robot();
		//Press down arrow key 2 times
		r.keyPress(KeyEvent.VK_DOWN);
		//Need to release key otherwise robot class assumes key is pressed
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		//Get all the windows and store in ArrayList class
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//Switch to required window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("(//a[@data-label='header'])[3]"))).click().perform();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(brw.get(0));
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
