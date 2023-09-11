package qedge.july28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("http://flights.qedgetech.com/");
     Thread.sleep(2000);
     driver.findElement(By.name("email")).sendKeys("pranga82@gmail.com");
     driver.findElement(By.name("password")).sendKeys("ranga123");
     driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).sendKeys(Keys.ENTER);
     //get collection of radio buttons
     List<WebElement> all_Radios = driver.findElements(By.xpath("//div[@class = 'radio_b']"));
     System.out.println("No.of radio buttons: "+all_Radios.size());
     //print each radio button name
     for (WebElement each : all_Radios) {
		System.out.println(each.getText());
		Thread.sleep(2000);
	 }
     driver.quit();
	}

}
