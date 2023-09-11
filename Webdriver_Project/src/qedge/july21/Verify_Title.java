package qedge.july21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
        String expected_Title = "google";
        String actual_Title = driver.getTitle();
        if(expected_Title.equalsIgnoreCase(actual_Title))
        	System.out.println("Expected title matches actual title: "+expected_Title +"    "+ actual_Title);
        else
        	System.out.println("Expected title does not match actual title: "+expected_Title +"    "+ actual_Title);
        driver.close();
	}

}
