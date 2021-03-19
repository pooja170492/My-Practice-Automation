/*Program on to display flipcart search field text size as an output*/package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFileldTextSize {

	public static void main(String[] args) 
	{

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
         WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipcart.com");
		WebElement rv=driver.findElement(By.className("LM6RPg")); //Search
		rv.sendKeys("mobiles");
		String str=rv.getCssValue("font-size");
		System.out.println(str);

	}

}
