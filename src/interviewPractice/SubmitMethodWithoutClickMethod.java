/*Program on to search for Mobiles in flipkart without using click()*/
package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitMethodWithoutClickMethod {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipfkart.com");
		 WebElement rv=driver.findElement(By.className("LM6RPg"));
		rv.sendKeys("Mobile");//Searchfield
		driver.findElement(By.className("vh79eN")).submit();//click
		

	}

}
