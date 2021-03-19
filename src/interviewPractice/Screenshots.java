package interviewPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshots
{

	public static void main(String[] args) throws IOException 
	{
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement( By.xpath("//input[@id='email']")).sendKeys("Learn Automation"); 
        TakesScreenshot ts= (TakesScreenshot)driver;//typecast
       File src =ts.getScreenshotAs(OutputType.FILE);
       
FileUtils.copyFile(src, new File("./Screenshot/facebook.png"));//saved copy in buffer
System.out.println("Screenshot Taken");	
driver.close();
}
	

}
