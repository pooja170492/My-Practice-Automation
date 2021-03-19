/*Program on to Search on  MI mobile in Flipkart*/
package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipcartMobileSearch {

	public static void main(String[] args)  throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.className("LM6RPg")).sendKeys("MI Mobile");
		Thread.sleep(2000);//
		driver.findElement(By.className("vh79eN")).click();
		driver.close();

	}

}
