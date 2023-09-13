package qedge.aug8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplicit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//Create object for WebDriverWait class
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Wait for link to be clickable
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		driver.findElement(By.linkText("Create new account")).click();
		//Wait for element to be visible
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.close();

	}

}
