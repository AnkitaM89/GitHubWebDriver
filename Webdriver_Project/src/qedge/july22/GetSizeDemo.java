package qedge.july22;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//Store Username textbox into WebElement
		WebElement Username = driver.findElement(By.name("txtUsername"));
		Dimension dim = Username.getSize();
		//Print Username textbox height and width
		System.out.println(dim.height + "  " + dim.width);
		
		//Print login button height and width
		WebElement loginButton = driver.findElement(By.name("Submit"));
		Dimension dim1 = loginButton.getSize();
		System.out.println(dim1.height + "  " + dim1.width);
		driver.close();
	}

}
