package qedge.aug2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Launch url using javascript
		js.executeScript("window.location='https://www.amazon.in/'");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//print page title and length
        String pageTitle = js.executeScript("return document.title").toString();
        System.out.println("Page Title:"+pageTitle);
        System.out.println("Page Title length:"+pageTitle.length());
        //print url and length
        String url = js.executeScript("return document.URL").toString();
        System.out.println("URL:"+url);
        System.out.println("URL length:"+url.length());
        //print domain and length
        String domain = js.executeScript("return document.domain").toString();
        System.out.println("Domain name:"+domain);
        System.out.println("Domanin name length:"+domain.length());
        driver.quit();
	}

}
