/*Program on to print Total Number ofLink countsdriver.fin*/
package interviewPractice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLinksCountVisibleNotVisible
{

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");//OpenURL
		List<WebElement>ref=driver.findElements(By.xpath("//a"));//Links finding
		int count=ref.size();//links store in count variable
		System.out.println(" Total " +count+ " number of links are present in Google Webpage");
		int a=0;
		int b=0;
		for(WebElement rv:ref)//iterating data
		{
			if(rv.isDisplayed())//isDisplayed method used
			{
				a++;
			}			
			else
			{
				b++;				
			}
		}
			int p=a;
			int q=b;
			System.out.println("\n Total "  +p+  " number of links are visible in Google Webpage");
			System.out.println("\n Total "  +q+ " number of links are hidden in Google Webpage");
		}
	}
	

			
		

	


