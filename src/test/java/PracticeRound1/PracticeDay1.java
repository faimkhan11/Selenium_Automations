package PracticeRound1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeDay1 {

	public static void main(String[] args) throws InterruptedException 
	{
/*
 
   
   
   1.Get Method:
     driver.get("URL")
   
   2.Title Method:
     driver.getTitle()
   
   3.isDisplayed Method:
     boolean ver = driver.findElement().isDisplayed;
     syso(ver)
  
   4.Get Text Method:
     WebElement ver = driver.findElement().getText()
     syso(ver)
     
   5.driver.findElement(By.linkText());
   
   6.SendKeys Method:
     driver.sendKeys()
     
   7.Drop Down Method
     WebElement ver = findElement();
     Select dropdown = new Select(ver);
     dropdown.selectByValue/name/index()
     
   8.Switch to new Window
     driver.switchTo().newWindow(WindowType.Tab);
     
     
   9.Key Up and Down Action
     Actions ver = new Actions(driver);
     ver.keyDown(keys.CONTROL).sendKeys("A").keyUp(keys.CONTROL).perform();
     
     
  10.Open link in new tab
     Actions ver = new Actions(driver);
     ver.keyDown(keys.CONTROL).click().perform();
     
    
  11.Get Window Handles
     WebElement ver = driver.getWIndowHandles();
     syso(ver);
    
  12.List <String> getIDs = new ArrayList (driver.getWindowHandles());
	 String Parent = getIDs.get(0);
	 String Child = getIDs.get(1); 
	 
	 
  13. Mouse action Move to Element 
      WebElement ver = driver.findElement();
      Actions ver = new Actions(driver);
      ver.moveToElement(ver).click().perform();
	
  
  14.Context Click (Double Click)
  
     ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
       
	 WebElement ver = driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));
	 System.out.println(ver.getText());
	 Actions ver1 = new Actions(driver);	
	 ver1.contextClick(ver).perform();
		
		
  15.Alerts Method:
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	 driver.findElement(By.xpath("//*[@onclick=\"jsAlert()\"]")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 driver.switchTo().alert().dismiss();
	 Alert ver = driver.switchTo().alert();
	 ver.sendKeys("Welcome");
	 ver.accept();
	 
	 
  16.Implicit Wait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     
  17.Explicit Wait
     WebDriverWait wait = new WebDriverWait(driver,30);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
     

  18.Scroll
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView();", scroll);
     
	 
*/		
			    

	}
	

}
