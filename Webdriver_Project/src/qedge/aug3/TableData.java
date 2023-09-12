package qedge.aug3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		//Print specific cell data
		String tableText1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[1]")).getText();
		String tableText2=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[2]")).getText();
	    System.out.print(tableText1+"  "+tableText2);
	    driver.quit();
	}

}
