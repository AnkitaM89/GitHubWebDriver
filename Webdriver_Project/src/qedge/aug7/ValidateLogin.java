package qedge.aug7;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("D:/Ankita/LoginData.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str = br.readLine())!=null)
		{
			//Store login data into array
			String temp[]= str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys(temp[0]);
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys(temp[1]);
			driver.findElement(By.cssSelector("#btnLogin")).click();
			String Expected ="dashboard";
			String Actual = driver.getCurrentUrl();
			if(Actual.contains(Expected))
			{
				System.out.println("Login Success::"+Expected+"     "+Actual);
			}
			else
			{
				System.out.println("Login Fail::"+Expected+"     "+Actual);
			}
			driver.quit();
				
		}
		br.close();

	}

}
