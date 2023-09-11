package qedge.july28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws Throwable {
		/* Write a script to verify the elements in facebook.
		 * First Name textbox is enabled/disabled
		 * Re-enter Email id textbox is displayed/hidden
           Male radio button is selected/not */
		//Checking Git Push
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
        //Verify First Name textbox is enabled/disabled
		WebElement firstName = driver.findElement(By.name("firstname"));
		boolean first_IsEnabled = firstName.isEnabled();
		System.out.println("First Name textbox is enabled: "+first_IsEnabled);
		//Verify Re-enter Email id textbox is displayed/hidden
		WebElement reenterEmail = driver.findElement(By.name("reg_email_confirmation__"));
		boolean reenter_IsDisplayed = reenterEmail.isDisplayed();
		System.out.println("Re-enter Email textbox is displayed: "+reenter_IsDisplayed);
		//Verify Male radio button is selected/not
		WebElement maleRadio = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		boolean male_IsSelected = maleRadio.isSelected();
		System.out.println("Male radio button is selected: "+male_IsSelected);
		driver.close();
	}

}
