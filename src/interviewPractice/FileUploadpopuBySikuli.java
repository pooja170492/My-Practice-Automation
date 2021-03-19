package interviewPractice;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class FileUploadpopuBySikuli {

	public static void main(String[] args) throws InterruptedException , SikuliException ,TimeoutException
	{
		System.setProperty("WebDriver.chrome","C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing ");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.Seleniumhq.org");
		Thread.sleep(1000);
		Screen s= new Screen();
		Thread.sleep(1000);
		Pattern p1= new Pattern("E:\\Saved Pattern Images");
		Thread.sleep(1000);
		Pattern p2= new Pattern("E:\\Saved Pattern Images");
		Thread.sleep(1000);
		s.click(p1);
		Thread.sleep(1000);
		s.click(p2);

	}

}
