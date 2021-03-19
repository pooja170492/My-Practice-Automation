/* W.P. to perform following action
  1.Enter Invalid UserName.
  2.Clear the text.
  3.Enter valid UserName.
  4.Enter valid password.
  click on Login Button*/

package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeLogin {

	public static void main(String[] args)  throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
        WebElement ref=driver.findElement(By.name("username"));
        ref.sendKeys("admin123");//Invalid UN
          ref.clear();
          Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("admin");//UN
        driver.findElement(By.name("pwd")).sendKeys("manager");//Pwd
        
        driver.findElement(By.id("keepLoggedInCheckBox")).click();//
        
         driver.findElement(By.linkText("Login")).click();//Login
           Thread.sleep(2000);
           driver.close();//
	}

}
