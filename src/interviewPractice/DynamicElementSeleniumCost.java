package interviewPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicElementSeleniumCost
{

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.tagName("//input(text()='selenium book cost'")).sendKeys("Selenium Book Cost");
		driver.findElement(By.className("LC20lb")).click();
		String ref=driver.findElement(By.xpath("//div[text()='₹2,271']")).getText();
		System.out.println(ref);
	
	}

} 
