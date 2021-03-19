package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ErrorMessageOutpt 
{

	public static void main(String[] args)
	{
		
      WebDriver driver= new FirefoxDriver();
      driver.get("http://localhost/login.do");
      driver.findElement(By.id("headerContainer")).sendKeys("admin");//UN
      driver.findElement(By.name("pwd")).sendKeys("manager");//Pwd
      driver.findElement(By.id("keepLoggedInCheckBox")).click();//Checkbox
      driver.findElement(By.id("loginButton")).click();;//Loginbutton
     String ref= driver.findElement(By.className("errormsg")).getText();//Error msg
     
     System.out.println(ref);
	}

}
