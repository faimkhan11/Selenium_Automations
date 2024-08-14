package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopup {

	
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
       
        //Approach1. SelectByValue
       // box.selectByValue("koe0147");
        
        //Approach2. SelectByVisibleText
      //  box.selectByVisibleText("box 147");
        
        //Approach3. SelectByIndex
      //  box.selectByIndex(1);
        
        
        
        
        
        
		}
	}


