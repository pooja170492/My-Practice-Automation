package interviewPractice;





import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSize {

	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Pooja Varganti\\Downloads\\All drivers & softwares required for selenium Testing");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement rv=driver.findElement(By.id("month"));
		Select s= new Select(rv);
		Boolean s1=s.isMultiple();//ismultiple(),Cheched listbox is multi selectable or not
		if(s1)
		{
			System.out.println("Listbox is multiSelectable");
		}
		else
		{
			System.out.println("Listbox is not  multiSelectable");
		}
			
		List<WebElement> wb=s.getOptions();//get all list
		ArrayList<String>ref1= new ArrayList<String>();//Object of ArrayList
		for(WebElement ele:wb)
			{
			String str=ele.getText();
			ref1.add(str);//added string ref1
			System.out.println(str);
			}
		 System.out.println("Months name in alphabetical format is ");
		Collections.sort(ref1);// to sort text in Alphabetical form
		for(String str1:ref1)
		{
       System.out.println(str1);
		}
		int size= wb.size();//size of text
		System.out.println("TOtal size of months is " +size);
		
		
		
	}	
		

	}

