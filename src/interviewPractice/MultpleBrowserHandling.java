package interviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class MultpleBrowserHandling 
{
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver","");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
