package qedge.july21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Url {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://google.com");
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		String expected ="https://";
		String actual = driver.getCurrentUrl();
		if(actual.startsWith(expected))
			System.out.println("URL is secured : "+expected + "   "+ actual);
		else
		{
			System.out.println("URL is not secured : "+expected + "   "+ actual);
		}
		driver.close();
	}

}
