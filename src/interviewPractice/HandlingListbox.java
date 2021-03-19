package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement rv=driver.findElement(By.id("day"));
		rv.click();
		//Day
		rv.sendKeys(Keys.ARROW_DOWN);//Listbox handled by using Keystroke
		Thread.sleep(1000);
		rv.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		rv.click();
	 rv.sendKeys(Keys.ENTER);
		//Month
		WebElement rv1=driver.findElement(By.id("month"));
		rv1.sendKeys("A");//Listbox handled by using Keystroke along with Sendkeys
		Thread.sleep(1000);
		rv1.sendKeys(Keys.ENTER);
		//Year
	WebElement rv2	=driver.findElement(By.id("year"));
	Select s=new Select(rv2);
	//s.selectByIndex(1);
	//s.selectByValue("1992");
	 s.selectByVisibleText("1992");
	
		
		
		
		

	}

}
