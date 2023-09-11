package qedge.july20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSignUpDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);

		driver.findElement(By.name("firstname")).sendKeys("Ronita");
        driver.findElement(By.name("lastname")).sendKeys("Saha");
		driver.findElement(By.name("reg_email__")).sendKeys("RonitaSaha123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("RonitaSaha123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ronita345$");
		driver.findElement(By.id("day")).sendKeys("12");
		driver.findElement(By.id("month")).sendKeys("Jul");
		driver.findElement(By.id("year")).sendKeys("1988");
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("websubmit")).click();
		//driver.close();


	}

}
