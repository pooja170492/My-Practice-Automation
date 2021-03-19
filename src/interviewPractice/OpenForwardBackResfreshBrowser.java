/*Open the first facebook then open google,
 go to back page then go to forward and
  refresh the browser & close the browser*/

package interviewPractice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver.Navigation;
public class OpenForwardBackResfreshBrowser 
{

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver rv = new FirefoxDriver();// open Firefox
		Thread.sleep(2000);
		
		rv.navigate().to("https://www.facebook.com");//open Facebook
		Thread.sleep(2000);
		
		rv.get("https://www.google.com");//open Google
		Thread.sleep(2000);
		
		rv.navigate().back();//open facebook
		Thread.sleep(2000);
		
		 rv.navigate().forward();//open Google
		 Thread.sleep(2000);
		 
		  rv.navigate().refresh();//refresf google page
		  Thread.sleep(2000);
		   rv.close();//close
		   System.out.println("Script executed successfully");
		

	}

}
