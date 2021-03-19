package interviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAutosuggestions
{

	public static void main(String[] args)
	{
     WebDriver driver= new FirefoxDriver();
     driver.get("www.google.com");
     driver.findElement(By.xpath("//input[@id='fakebox-input']")).sendKeys("Selenium");
     List<WebElement>ref= driver.findElements(By.xpath("//div[contains(text(),'selenium')]"));
     int r=ref.size();
     System.out.println(r);
     
     

	}

}
