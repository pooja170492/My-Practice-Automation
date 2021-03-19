/*Program on to verify errormsg font color is red or not*/
package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class ErrorMsgFontColor {

	public static void main(String[] args)
	{
		
WebDriver driver=new FirefoxDriver();
driver.get("http://localhost/login.do");
driver.findElement(By.id("inProgressText")).click();
WebElement rv=driver.findElement(By.className("class"));
 String str=rv.getCssValue("color");
 System.out.println(str);
String ref= Color.fromString(str).asHex();
System.out.println(ref);
if(ref.equals("#ce0100"))
{
	System.out.println("Text msg color is Red");
}
else
{
	System.out.println("Text msg color is  not Red");
}
	}

}
