package interviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElements;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutosuggestionTextPrint
{

	public static void main(String[] args)throws InterruptedException
	{
	  WebDriver driver= new FirefoxDriver();
	  driver.get("http://www.Google.com");
	  driver.findElement(By.id("fakebox-input")).click();
	  List<WebElement> ref= driver.findElements(By.xpath("//div[contains(text(),'selenium')]"));
	  for(WebElement ele:ref)
	  {
		  String str=ref.getText();
		  System.out.println(str);
		  
	  }

	}

}
