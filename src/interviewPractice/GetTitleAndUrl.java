/*W.A.P to print Google application Welcome page Title & URL as an O/p*/

package interviewPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleAndUrl {

	public static void main(String[] args)
	{
		FirefoxDriver rv= new FirefoxDriver();
		rv.get("https://www.google.com");
	    String str=rv.getTitle();//title stored in str
		System.out.println("Welcome Page  Displayed");//o/p
		System.out.println("WebpageTitle-"+str);//title displayed
		
        String str1= rv.getCurrentUrl();//CurrentUrl stored in str1
        System.out.println("CurrentURL-"+str1);//URL displayed
		
		
	}

}

