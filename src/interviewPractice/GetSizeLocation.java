/*Program on to find Size and Location of Flipkart Logo*/
package interviewPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSizeLocation {

	public static void main(String[] args)
	{
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
        WebDriver driver= new FirefoxDriver();
		driver.get("https://wwww.flipcart.com");
		WebElement rv=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	    Dimension d=rv.getSize();
		int a=d.getWidth();		
		int b=d.getHeight();
		System.out.println("Size of Flipcart logo is"+a);
		System.out.println("Size of Flipcart logo is"+b);
		Point p=rv.getLocation();
		 int x=p.getX();
		int y=p.getY();
		System.out.println("Location  of Flipcart logo is"+x);
		System.out.println("Location  of Flipcart logo is"+y);
		

	}

}
