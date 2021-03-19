package interviewPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownSelectInYatraApp {

	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		Actions a= new Actions(driver);
		
		WebElement rv=driver.findElement(By.xpath("//a[text()='Support']"));
				a.moveToElement(rv).perform();
		driver.findElement(By.xpath("//a[text()=''Make a payment][3]")).click();
		
	}

}
