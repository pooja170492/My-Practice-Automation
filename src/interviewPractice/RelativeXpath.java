/*Program on Testing ActiTime Application Using RelativeXpath*/
package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");//URL
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");//Username
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");//pwd
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();//Checkbox
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();//Login Button
		System.out.println("ActiTime application executed Successfully");
	}

}
