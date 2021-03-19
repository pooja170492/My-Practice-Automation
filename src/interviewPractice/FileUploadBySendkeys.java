package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadBySendkeys {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///E:/FileUpload.html");
		driver.findElement(By.name("upload")).sendKeys("file:///E:/FileUpload.html");
		System.out.println("Uploaded file is successfully opened by sendKeys()");

	}

}
