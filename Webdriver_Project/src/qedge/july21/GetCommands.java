package qedge.july21;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tatacliq.com/");
		//getTitle()
		String page_Tiltle = driver.getTitle();
		System.out.println("Page Title : "+page_Tiltle);
		System.out.println("Title length : "+page_Tiltle.length());
		//getCurrentUrl()
		String str_url = driver.getCurrentUrl();
		System.out.println("Current URL : "+str_url);
		System.out.println("URL length : "+str_url.length());
		
		driver.quit();
	}

}
