/*Program to display all link Text  of Google iff component is containing text*/
package interviewPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElements;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinkTextPrint {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		List<WebElement>ref=driver.findElements(By.xpath("//a"));
		for(WebElement rv:ref)
		{
			String str= rv.getText();
			if(str.isEmpty())
			{
				
			}
			else {
				System.out.println(str);
				
			}
		}

	}

	
}
