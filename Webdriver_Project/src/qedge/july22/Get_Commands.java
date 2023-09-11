package qedge.july22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commands {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//capture gmail text in google page
		String link_Text =driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(link_Text);
		//capture gmail url 
		String gmail_Url = driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(gmail_Url);
		driver.quit();
	}

}
