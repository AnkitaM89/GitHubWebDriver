package qedge.july27;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Throwable {
	//Write a script to handle specific window when multiple windows are opened
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		
	    //Click 3 links to open in new window
	    
	    driver.findElement(By.linkText("Privacy")).click();
	    driver.findElement(By.linkText("Help")).click();
	    driver.findElement(By.linkText("Terms")).click();
	    
	    //Store all windows into ArrayList
	    ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(brw);
	    Thread.sleep(5000);
	    //Switch to google window account
	    driver.switchTo().window(brw.get(1));
	    Thread.sleep(5000);
		
		  driver.findElement(By.linkText("Community")).click(); 
		  Thread.sleep(5000);
		  driver.close(); 
		  //Switch to privacy window
		  driver.switchTo().window(brw.get(2)); 
		  String expected = "Privacy Policy";
		  String actual = driver.getTitle(); 
		  if(actual.contains(expected)) {
		  System.out.println("Title is matching : "+expected+"   "+actual); 
		  } 
		  else
		  {
		  System.out.println("Title is not matching : "+expected+"   "+actual); 
		  }
		  Thread.sleep(5000); 
		  driver.close();
		 
	}

}
