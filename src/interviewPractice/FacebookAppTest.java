 
 package interviewPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.firefoxDriver;
public class FacebookAppTest 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver dr= new FirefoxDriver();
		dr.get("https://wwww.facebook.com");
		dr.findElement(By.id("email")).sendKeys("abc@gmail.com");//Email
        dr.findElement(By.id("pass")).sendKeys("abc@gmail.com");//Pwd
	//dr.findElement(By.partialLinkText("https://www.facebook.com")).click();//Forgotton Pwd
		dr.findElement(By.id("u_0_b")).click();//Login
		dr.findElement(By.id("u_0_q")).sendKeys("ABC");//First Name
		dr.findElement(By.id("u_0_s")).sendKeys("XYZ");//Last name
		dr.findElement(By.id("u_0_v")).sendKeys("7888158288");//Mobile No.
		dr.findElement(By.id("u_0_10")).sendKeys("abc@123");//New Pwd
		//Date of Birh Listbox
		dr.findElement(By.id("day")).click();//Day
		Thread.sleep(1000);	
		dr.findElement(By.id("day")).sendKeys("keys.ARROW_DOWN");
		Thread.sleep(1000);
		dr.findElement(By.id("day")).sendKeys("keys.ARROW_DOWN");
		Thread.sleep(1000);	
		dr.findElement(By.id("day")).sendKeys("keys.ENTER");
		Thread.sleep(1000);
		dr.findElement(By.id("month")).click();
		dr.findElement(By.id("month")).sendKeys("keys.ARROW_DOWN");//month
		Thread.sleep(1000);
		dr.findElement(By.id("year")).sendKeys("keys.ARROW_DOWN");//year
		Thread.sleep(1000);

		dr.findElement(By.id("u_0_6")).sendKeys("abc@gmail.com");//Gendor

		dr.findElement(By.id("u_017")).click();//Sign Up;
		System.out.println("Facebook Application Automation Script executed successfully");
		dr.close();
		

	}

}
