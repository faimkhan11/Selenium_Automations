package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerMethod {
	
	     
	
	
	 void dateselector(WebDriver driver, String month, String year, String date)
	   {
		   while(true)
	        {
	        	String showmonth=driver.findElement(By.xpath("//div[@class='select-wrapper select-month']//input[@type='text']")).getText();
	        	String showyear=driver.findElement(By.xpath("//div[@class='select-wrapper select-year']//input[@type='text']")).getText();
	        	
	        	if(showmonth==month && showyear==year)
	        	{
	        		break;
	        	}
	        	driver.findElement(By.xpath("//button[@class='month-next']//*[name()='svg']")).click();
	        }
	        
	       List <WebElement> totaldates= driver.findElements(By.xpath("//div[@class=\"datepicker-table-wrapper\"]//tbody//tr"));
	        
	       for(WebElement dt:totaldates)
	       {	   
	    	   if(dt.getText()==date)
	    	   {
	    		   dt.click();
	    		   break;
	    	   }
	       }
	       
	       
		
	   }
	 void slctclndr(WebDriver driver)
	 { 
		 
		 driver.findElement(By.xpath("data-day=\"25\"")).click();
		 driver.findElement(By.xpath("//*[@class=\"btn-flat datepicker-done waves-effect btn-confirm\"]")).click();
		 //driver.findElement(By.xpath("")).click();
	 

	 }

}
