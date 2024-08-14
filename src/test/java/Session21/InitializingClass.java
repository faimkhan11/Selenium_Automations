package Session21;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.api.trace.Span;

public class InitializingClass

{
   
	ChromeDriver driver = new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
	Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);
	
	void LaunchWebsite()
	{
		driver.get("https://stage.trafikalarm.dk/");
		driver.manage().window().maximize();
		String pageTitle=driver.getTitle();
		if(pageTitle.equals("Trafik Alarm | Undgå fartbøder og kør sikkert"))
		{
			System.out.println("Website is successfully open");
		}
		else
		{
			System.out.println("Website is not successfully open");
		}
	    
	}
	
	 
	void register()
	{
		driver.findElement(By.className("btn-primary")).click();
        String act_title=driver.getTitle();                      
		
		if(act_title.equals("Min konto - Trafik Alarm - Stage"))
		{
			System.out.println("User is successfully landed to the Create Account page");
		}
		else
		{
			System.out.println("Landed page is not correct");
		}
		boolean buttonstatus = driver.findElement(By.name("register")).isDisplayed();
		System.out.println("Create Account button is appearing"+ buttonstatus);
		driver.findElement(By.id("reg_email")).sendKeys("firstaccount01@cropsly.com");
		driver.findElement(By.id("reg_password")).sendKeys("faim@cropsly.com");
		driver.findElement(By.id("termsAccepted")).click();
	//	WebElement iframe=driver.findElement(By.xpath("//*[@src=\"https://www.google.com/recaptcha/api2/anchor?ar=1&k=6LeRiuQpAAAAABLoINlzcnaL3U4YpWFaaVjHdSHY&co=aHR0cHM6Ly9zdGFnZS50cmFmaWthbGFybS5kazo0NDM.&hl=da&v=rKbTvxTxwcw5VqzrtN-ICwWt&size=normal&cb=fivswhv230af\"]"));
		driver.switchTo().frame("a-lh93y5jpk8ej");
	//	driver.findElement(By.xpath("//*[@class=\"recaptcha-checkbox-border\"]")).click();
		
		WebElement clickbtn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"recaptcha-checkbox-border\"]")));
		clickbtn.click();
	//	driver.findElement(By.xpath("//*[@id='recaptcha-anchor']")).click();
		
		
		
	}
	
	void login()
	{
		driver.findElement(By.cssSelector("Span.label")).click();
		driver.findElement(By.cssSelector("input#username")).sendKeys("firstaccount@cropsly.com");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("faim@cropsly.com");
		driver.findElement(By.cssSelector("input[name=login]")).click();
		String actTitle=driver.getTitle();
		if(actTitle.equals("Min konto - Trafik Alarm - Stage"))
		{
		  System.out.println("User is successfully login to the website");	
		}
		else
		{
			System.out.println("User is not successfully login to the website ");
		}
		
	}
	
	void subspage()
	{
		String actTitle=driver.getTitle();
		if(actTitle.equals("Min konto - Trafik Alarm - Stage"))
		{
		  System.out.println("User is successfully redirected to the subscription page");	
		}
		else
		{
			System.out.println("User is not successfully redirected to the subscription page");
		}
		driver.quit();
	}
	
	void buySubs() throws InterruptedException
	{
		String substext = driver.findElement(By.xpath("//h2[text()=\"Trafik Alarm Plus\"]")).getText();
		System.out.println(substext);
		driver.findElement(By.id("billing_first_name")).sendKeys("test");
		driver.findElement(By.id("billing_last_name")).sendKeys("User");
		driver.findElement(By.id("billing_company")).sendKeys("Test Company");
		driver.findElement(By.id("billing_address_1")).sendKeys("Test Address");
		driver.findElement(By.id("billing_address_2")).sendKeys("Test Address2");
		driver.findElement(By.id("billing_postcode")).sendKeys("1620");
		driver.findElement(By.id("billing_city")).sendKeys("Test Billing city");
		driver.findElement(By.id("billing_phone")).sendKeys("8699235075");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		Thread.sleep(5000);
	 //   WebElement scrollup = driver.findElement(By.id("billing_postcode"));
	//	js.executeScript("arguments[0].scrollIntoView();", scrollup);
	//	driver.findElement(By.xpath("//input[@id=\"newsletterCheck\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"braintree-hosted-field-number\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"credit-card-number\"]")).sendKeys("4111 1111 1111 1111");
		driver.findElement(By.xpath("//*[@id=\"braintree-hosted-field-expirationDate\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"braintree-hosted-field-expirationDate\"]")).sendKeys("1225");
		driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
		
       
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//span[text()=\"Faktureret månedligt\"]"));
	//	driver.findElement(By.xpath("//*[@id=\"variation_0\"]")).click();
		
	}
	
	
	  public void logout() throws InterruptedException
	  {
	     driver.findElement(By.linkText("LOG UD")).click();
	     
	     
	      // Thread.sleep(3000);
	       mywait.until(ExpectedConditions.alertIsPresent()).accept();
	   //  driver.switchTo().alert().accept();    
	     driver.findElement(By.xpath("//*[class=\"notice_text\"]")).click();
	  //   driver.quit();
	     
	  }
	  
	  public void newscheckbox()
	  {
		  driver.findElement(By.xpath("//*[@id=\"newsletterCheck\"]")).click();
		  System.out.println("User is successfully clicked on newsletter checkbox");
		  driver.quit();
	  }
	  
	  void upgradebtn()
	  {
		 boolean upgradebtn=driver.findElement(By.xpath("//*[@class='woocommerce-Button button']")).isDisplayed();
		 System.out.println("Upgrade button is Available on the subscription page"+upgradebtn);
		 driver.findElement(By.xpath("//*[@class='woocommerce-Button button']")).click();
		 System.out.println("User is successfully clicked on the Upgrade Now button");
		// driver.quit();
	  }
	  
	  void buysubspage()
	  {
		  String buySubsPage= driver.getTitle();
		  if(buySubsPage.equals("Plus medlemskab - Trafik Alarm - Stage"))
		  {
			System.out.println(buySubsPage);  
		  }
		  else
		  {
		    System.out.println("User is not successfully redirected to buy subscription page");  

		  }
		//  driver.quit();
	  }
	  
	  void infobtnstatus()
	  {
		 boolean infobtn=driver.findElement(By.linkText("OPLYSNINGER")).isDisplayed();
		 System.out.println("Info button is available on the page"+" "+infobtn);
		  driver.quit();
	  }
	  
	  void clickInfobtn()
	  {
		 driver.findElement(By.linkText("OPLYSNINGER")).click();
		 System.out.println("User is successfully clicked on Information button");
		 	 
	  }

	

}
