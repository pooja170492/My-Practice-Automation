package interviewPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUpNaukriDotcomApp {

	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome","C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing ");
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.naukri.com");
Set <String> s1	=driver.getWindowHandles();//getting all browser's Reference ID
String parent= driver.getWindowHandle();
int s=s1.size();//Total browsers
for(String s2: s1)//for each loop used forgetting text of Reference ID's
{

	System.out.println(s2);

}
Iterator<String> itr= s1.iterator();
while(itr.hasNext())
{
	String str= itr.next();
	if(!str.equals(parent))
	{
		driver.switchTo().window(str);
		driver.close();
	}
	
}

}

}
