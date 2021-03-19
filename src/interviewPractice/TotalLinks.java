/*Program on to display total Links  present in GoogleWbpage as an O/P */
package interviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TotalLinks
{
	public static void main(String[] args) 
	{
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	List<WebElement>ref=driver.findElements(By.xpath("//span")); //AllLinks
	int ref1=ref.size();
	System.out.println("ref1");
	}

}
