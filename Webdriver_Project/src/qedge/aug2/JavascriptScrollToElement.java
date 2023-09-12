package qedge.aug2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptScrollToElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Launch url using javascript
		js.executeScript("window.location='https://jqueryui.com/droppable/'");
		Thread.sleep(2000);
        WebElement element = driver.findElement(By.linkText("Show"));
        //Scroll to Show element
        js.executeScript("document.scrollIntoView",element);
        element.click();
        driver.close();
	}

}
