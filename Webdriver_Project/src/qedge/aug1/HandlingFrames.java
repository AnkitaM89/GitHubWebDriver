package qedge.aug1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		//get collection of frames
		List<WebElement> all_Frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No. of frames within the html page: "+all_Frames.size());
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		Thread.sleep(2000);
		//switch back to main html page
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//click buttons link
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
