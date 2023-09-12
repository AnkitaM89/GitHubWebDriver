package qedge.aug3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartJsDemo {
      public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"#input-firstname\").value='Nikita'");
		js.executeScript("document.getElementById('input-lastname').value='Yadav'");
		js.executeScript("document.querySelector(\"#input-email\").value='NikitaY23@gmail.com'");
		js.executeScript("document.getElementById('input-password').value='Nikita123#'");
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(2000);
		driver.quit();
	}
}
