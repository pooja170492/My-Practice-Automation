package interviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeTask
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");;//UN
		driver.findElement(By.name("pwd")).sendKeys("manager");;//PWD
		driver.findElement(By.id("keepLoggedInCheckBox")).click();//Checkbox
		driver.findElement(By.partialLinkText("Login")).click();//Login Link
		driver.findElement(By.tagName("img")).click();//Task
	
		List<WebElement> ref=driver.findElements(By.xpath("//input[@type='checkbox']"));//AllCheckbox
		for(WebElement ref1:ref)//AllSelectCheckbox
		{
			ref1.click();
		}
		for(int i=ref.size()-1;i>=0;i--)//AllDeselectCheckbox
		{
			WebElement ref1=ref.get(i);
			ref1.click();
		}
		ref.get(0).click();//SelectFirstCheckbox
		Thread.sleep(1000);
		ref.get(ref.size()-1).click();//SelectLastCheckBox
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();//firstCheckboxSelect
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox'][Last()]")).click();//LastCheckboxSelect
		Thread.sleep(1000);	
}
}