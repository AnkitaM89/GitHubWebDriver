package qedge.aug2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptScrolling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Launch url using javascript
		js.executeScript("window.location='https://www.amazon.in/'");
		Thread.sleep(2000);
		//Scroll vertically top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//Scroll vertically bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		//Scroll vertically to certain pixel
		js.executeScript("window.scrollBy(0,600)");
		//driver.quit();
	}

}
