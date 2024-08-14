package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
   
	 
	ChromeDriver driver;
	
      @BeforeClass
      public void drivers()
      {
    	  driver = new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  
      }
		
      @Test(dataProvider = "dp")
      public void register(String fName,String lName,String email,String phone,String Pass,String cPass) throws InterruptedException
      {
    	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    	  System.out.println(driver.getTitle());
    	  
    	  driver.findElement(By.linkText("Continue")).click();
    	  Thread.sleep(3000);
    	  driver.findElement(By.id("input-firstname")).sendKeys(fName);
    	  driver.findElement(By.id("input-lastname")).sendKeys(lName);
    	  driver.findElement(By.id("input-email")).sendKeys(email);
    	  driver.findElement(By.id("input-telephone")).sendKeys(phone);
    	  driver.findElement(By.id("input-password")).sendKeys(Pass);
    	  driver.findElement(By.id("input-confirm")).sendKeys(cPass);
    	  
    	  driver.findElement(By.name("agree")).click();
    	  driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
    	  Thread.sleep(3000);
    	  
    	  
    	  
      }
      
      
      @AfterClass
      public void teardown()
      {
    	 //driver.quit();
      }
      
      @DataProvider(name="dp")
     Object[][] getData()
      {
    	 
    	  Object data [][]= {
    			                       {"faim", "", "","9999999999", "1234567" ,"1234567"},
    			                       {"faim", "", "faimkhan@gmail.com","", "1234567" ,""},
    			                       {"faim", "Sohail", "faimkhan@gmail.com","9999999999", "1234567" ,"1234567"},
    			                       
    			                       
    	                             };
		return data;
    	  }
      }



