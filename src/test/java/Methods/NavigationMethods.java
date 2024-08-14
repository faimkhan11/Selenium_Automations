package Methods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1.Navigate to Method
		
    	//Approach1. Direct	
    	//driver.navigate().to("https://stage.trafikalarm.dk/");
		
	    //Aproach2. By creating Object
		URL open = new URL ("https://dev-sg.boxstation.dk/");
        driver.navigate().to(open);
        
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"menu-item-36710\"]")).click();
   
       //2. Navigate back Methode
        driver.navigate().back();
        
      //3. Navigate forward Method     
        driver.navigate().forward();
        
      //4.Navigate refresh Method
        driver.navigate().refresh();
        
        
        
	}

}
