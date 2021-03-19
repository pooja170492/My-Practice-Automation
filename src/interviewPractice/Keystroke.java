/*Write a test Script to click on Login button in Actitime application without using click()*/
	package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keystroke {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");//UN
        driver.findElement(By.name("pwd")).sendKeys("manager");//Pwd
		WebElement ref=driver.findElement(By.id("keepLoggedInCheckBox"));
		Keys key=Keys.ENTER;
		ref.sendKeys(key);
		

	}

}
