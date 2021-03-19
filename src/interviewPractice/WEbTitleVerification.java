/*Verification of Google page is displayed or not*/

package interviewPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WEbTitleVerification 
{

	public static void main(String[] args) 
	{
FirefoxDriver rv= new FirefoxDriver();
 rv.get("https://www.google.com");
 String str= rv.getTitle();
 if(str.equals("Google"))
   {
	 System.out.println("Welcome page is displayed. So WebPage title is verified");
	 System.out.println(str);
   }
else
	{
		System.out.println("Welcome page is not displayed.So WebPage title is verified");
	}
    }
}
