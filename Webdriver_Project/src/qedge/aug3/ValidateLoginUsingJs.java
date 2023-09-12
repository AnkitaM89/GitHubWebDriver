package qedge.aug3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLoginUsingJs {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin1'");
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		String expected = "dashboard";
		String actual = js.executeScript("return document.URL").toString();
		if(actual.contains(expected))
		{
			System.out.println("Login successful: "+expected+"  "+actual);
		}
		else
		{
			String err_Msg = js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println("Login failed: "+err_Msg+"  "+expected+"  "+actual);
		}
	}
}
