package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxIsSelected 
{

	public static void main(String[] args) throws InterruptedException
{
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares requi");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("admin");//UN
        driver.findElement(By.name("pwd")).sendKeys("manager");//Pwd
        WebElement rv=driver.findElement(By.id("keepLoggedInCheckBox"));
    rv.click();
    boolean b1=rv.isDisplayed();
  	if (b1)
  	{
  	System.out.println("Checkbox is Visible/Displayed");
  	}
  	else
  	{
  	System.out.println("Checkbox is hidden/not displayed");
  	}
  	boolean b2=rv.isEnabled();
  	if(b2)
  	{
  		System.out.println("Checkbox is enabled");
  	}
  	else
  	{
  		System.out.println("Checkbox is disabled");
  	}

	 boolean b3= rv.isSelected();
	  if(b3)
		{
			System.out.println("Checkbox is Selected");
			driver.findElement(By.linkText("Login")).click();
	        Thread.sleep(2000);
	     }
		else
		{
			System.out.println("Checkbox is not Selected");
		}
		 
		}
	}


