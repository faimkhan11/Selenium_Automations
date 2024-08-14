package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://dev-sg.boxstation.dk/");
		driver.manage().window().maximize();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"ow-button-base ow-button-align-center\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-item-37723\"]")).click(); 
        driver.findElement(By.xpath("//*[@class=\"ow-icon-placement-left ow-button-hover\"]")).click();
        
        //1. Handle Dropdown from Select tag
        
        WebElement boxdropdwn=driver.findElement(By.xpath("//*[@id=\"pa_boxnummer\"]"));
        Select box=new Select(boxdropdwn);
        box.selectByIndex(1);
       
        //2.Handle Calender
        
        String month="August";
        String year="2024";
        String date="11";
        driver.findElement(By.xpath("//input[@id='booking_calender']")).click();
        
        while(true)
        {
        	String showmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	String showyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	
        	if(showmonth.equals(month) && showyear.equals(year))
        	{
        		break;
        	}
        	driver.findElement(By.xpath("//a[@title='Næste&#x3E;']")).click();
        }
        
       List <WebElement> totaldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
        
       for(WebElement dt:totaldates)
       {	   
    	   if(dt.getText().equals(date))
    	   {
    		   dt.click();
    		   break;
    	   }
       }
       Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='basic']")).click();
       WebElement insurancetype=driver.findElement(By.xpath("//*[@name=\"insurance[mode]\"]"));
       Select type=new Select(insurancetype);
       type.selectByIndex(1);
       
       driver.findElement(By.xpath("//button[normalize-space()='BOOK']")).click();
       driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("Test");
       driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("User");
        
       driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Copenhagen");
       driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("1620");
       driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Copenhagen");
       driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("8699235075");
       driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("autouser01@cropsly.com");
       driver.findElement(By.xpath("//input[@id='account_password']")).sendKeys("qwerty12345");
       
        
        
        
        
        
        
        
        

        
        

	}

}
