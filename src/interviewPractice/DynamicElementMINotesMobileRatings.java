package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class DynamicElementMINotesMobileRatings

{
	public static void main(String[] args)
		
	
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	
		
     //  driver.findElement(By.className("_2zrpKA _1dBPDZ")).sendKeys("abc@gmail.com");//UN
		//driver.findElement(By.className("_2zrpKA _3v41xv _1dBPDZ")).sendKeys("abc@123");//PWD
	//driver.findElement(By.className("_2AkmmA _1LctnI _7UHT_c")).click();
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();//
				driver.findElement(By.className("LM6RPg")).sendKeys("Redmi note 5 Pro");//search
				driver.findElement(By.className("vh79eN")).submit();//click
	   // String str	="//div[contains text(),'2,50,954 Ratings']/..//span [contains text(),('_31qSD5')]";//
		 String str1=driver.findElement(By.xpath("//div[@class='niH0FQ']")).getText();
	System.out.println(str1);
	//String str2	="//div [contains text(),'2,50,954 Ratings']/..//span [contains text(),('_1vC4OE _2rQ-NK')]";
//	System.out.println(str2);
	
	}	
		
	}


