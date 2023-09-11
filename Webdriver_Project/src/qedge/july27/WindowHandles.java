package qedge.july27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		//Write a script to handle child windows when multiple windows are opened
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://gmail.com");
	Thread.sleep(5000);
	//Print gmail id
    String parent = driver.getWindowHandle();
    System.out.println(parent);
    //Click 3 links to open in new window
    driver.findElement(By.linkText("Help")).click();
    driver.findElement(By.linkText("Privacy")).click();
    driver.findElement(By.linkText("Terms")).click();
    //Get collection of all window ids
    Set<String> all_Wins = driver.getWindowHandles();
    System.out.println(all_Wins);
    for (String each : all_Wins) {
		//parent id not equal to child id
    	if(!parent.equals(each))
    	{
    		//Switch to each child window and get title and close
    		String page_Title = driver.switchTo().window(each).getTitle();
    		System.out.println(page_Title);
    		Thread.sleep(3000);
    		driver.close();	
    	}
	}
    //Switch to parent
    driver.switchTo().window(parent);
    Thread.sleep(3000);
    driver.findElement(By.name("identifier")).sendKeys("mukherjee.ankita89");
    Thread.sleep(5000);
    driver.quit();
	}

}
