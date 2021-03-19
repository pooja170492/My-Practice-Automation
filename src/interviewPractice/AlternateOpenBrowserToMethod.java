/*Open application using to()*/


package interviewPractice;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AlternateOpenBrowserToMethod 
{

	public static void main(String[] args)
	{
		FirefoxDriver rv= new FirefoxDriver();
		Navigation ref=rv.navigate();//use Navigate()& stored in Navigation type 
	   // ref.to("https://www.google.com");	
		//OR
	rv.navigate().to("https://www.google.com");
	System.out.println("Google page is opened");
	}

}
