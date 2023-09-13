package qedge.aug7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteTextFromWeb {

	public static void main(String[] args) throws Throwable {
		//write a  script form webpage to notepad
		//create new File
				File f = new File("D:/Ankita/WebSample.txt");
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://primusbank.qedgetech.com/");
				Thread.sleep(5000);
				String para1 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
				String para2 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[2]")).getText();
				bw.write(para1);
				bw.newLine();
				bw.newLine();
				bw.write(para2);
				bw.flush();
				bw.close();
				driver.quit();
	}

}
