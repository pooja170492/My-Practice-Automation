/*W.A.P to perform following actions?
1.Open firefox browser
2.Open facebook application
3. Open Google application
4.close facebook application*/


package interviewPractice;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String args[]) 
	{
		
FirefoxDriver rv = new FirefoxDriver();// firefox browser opened
rv.get("https://www.facebook.com");// open Facebook application

FirefoxDriver rv1= new FirefoxDriver();//new firefox browser opened
rv1.get("https://www.google.com");// open google application

rv.close();// close first  browser window means->close facebook bowser


	}

}

