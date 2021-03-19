package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopUpHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");//UN
		driver.findElement(By.name("pwd")).sendKeys("manager");//PWD
		driver.findElement(By.id("keepLoggedInCheckBox")).click();//Checkbox
		driver.findElement(By.id("loginButton")).click();//Login
		driver.findElement(By.xpath("//img contains[@class,'sizer']")).click();//task
		
		driver.findElement(By.xpath("//input[@type='button'][last()]")).click();//delete task
		driver.findElement(By.xpath("//input[@id='deleteButton']")).click();//Hidden Division Pop up
	

	}

}
