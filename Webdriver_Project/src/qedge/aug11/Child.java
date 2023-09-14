package qedge.aug11;

import org.openqa.selenium.By;

public class Child extends Parent{

	public static void clickLinks()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		driver.findElement(By.xpath("(//img)[6]")).click();
		driver.findElement(By.xpath("(//img)[8]")).click();
	}
	public static void main(String[] args) {
		Parent.primusLogin("Admin", "Admin");
		clickLinks();
		Parent.closeBrowser();

	}

}
