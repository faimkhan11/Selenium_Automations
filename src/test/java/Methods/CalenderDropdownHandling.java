package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDropdownHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://dev-sg.airshells.com/");
		driver.manage().window().maximize();
        	
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"waves-effect waves-light\"]")).click();
		
		List <WebElement> booknow=driver.findElements(By.xpath("//*[@class=\"btn mb1 btn-block waves-effect waves-light btn-info\"]"));
	    for(int i=0;i<1;i++)
	    {
	    	booknow.get(i).click();
	    }
	    
	    //Calendar
	    
	    driver.findElement(By.xpath("//*[@id=\"date-out\"]")).click();
	    driver.findElement(By.xpath("//*[@class=\"select-dropdown dropdown-trigger\"]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    List <WebElement> monthlist=driver.findElements(By.xpath("//ul[@id='select-options-b243044a-efca-def2-9a71-ab2fb2ed7471']//li//span"));
	    System.out.println(monthlist.size());
	    for(int i=0;i<monthlist.size();i++)
		   {
			   System.out.println(monthlist.get(i).getText()); 
			   
			   if(monthlist.get(i).getText().equals("September"))
			   {
				   monthlist.get(i).click();
				   break;
			   }
		   }
	   
	    
	}
}
	      
	    
	    