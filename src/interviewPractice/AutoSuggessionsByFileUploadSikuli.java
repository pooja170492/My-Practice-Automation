package interviewPractice;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class AutoSuggessionsByFileUploadSikuli {

	public static void main(String[] args)throws InterruptedException, SikuliException
	
	
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		//Pattern
		Pattern p1= new Pattern("E:\\Saved Pattern Images");
		Pattern p2= new Pattern("Desktop");
		//Screen
		Screen s= new Screen();
		Thread.sleep(1000);
		s.click(p1);
		Thread.sleep(1000);
		s.type(p1,"Selenium");
		Thread.sleep(1000);
		s.click(p2);
				

	}

}
