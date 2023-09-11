package qedge.july19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("http://google.com");
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.close();

	}

}
