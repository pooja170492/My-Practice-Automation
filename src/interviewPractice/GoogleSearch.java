package /*Program on to enter Selenium text in Google search field*/
interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch
{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
		Thread.sleep(2000);
         WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://www.Google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("fakebox-input")).sendKeys("Selenium");

	}

}
