/*Program on display all the images present in Flipcart as an O/P */
package interviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebComponentTextDisplay {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.Bigbasket.com");
		List<WebElement> ref=driver.findElements(By.xpath("//a[@qa='signUpLink']"));
         int ref1=ref.size();
         System.out.println(ref1);
         List<WebElement>ref2=(List<WebElement>) driver.findElements(By.xpath("//img[@class='img-responsive'])[2]"));
         int ref3=ref2.size();
        String  str=driver.findElement(By.xpath("//input[@id='input'])"));
         for(WebElement rv:ref4)
 		{
 			System.out.println(str);
 			
 			
	}

}
}

