/*Program on to signUp in Zoho CRM*/
package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUpInZohoCRM {

	public static void main(String[] args)
	{
	    WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.ZohoCRM.com");
	    driver.findElement(By.id("namefield")).sendKeys("abc");//fullname
	    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");//Email
	    driver.findElement(By.name("password")).sendKeys("manager@123");//PWD
	   driver.findElement(By.id("mobile")).sendKeys("1234567891");//Mobile No.
	    driver.findElement(By.className("unchecked")).click();//Checkbox
	    driver.findElement(By.id("signupbtn")).click();//GET STRARTED button
	   
	}

}
