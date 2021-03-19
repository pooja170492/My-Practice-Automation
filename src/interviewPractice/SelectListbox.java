package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectListbox {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.fatcow.com");
		WebElement rv=driver.findElement(By.id("countrySelect"));
	    Select s= new Select(rv);//Object of Select class created
	   // s.selectByIndex(1);//SelectByIndex()
	   // s.selectByValue("UNITED Kingdom");
	  s.selectByVisibleText("United Kingdom");//SelectbyVisibleText()
	
	

	}

}
