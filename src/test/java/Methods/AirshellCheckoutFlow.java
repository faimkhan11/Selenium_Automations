package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AirshellCheckoutFlow {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://dev-sg.airshells.com/");
		driver.manage().window().maximize();
        	
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"waves-effect waves-light\"]")).click();
		System.out.println("List of Airports available");
		WebElement AirportDropDown=driver.findElement(By.xpath("//*[@name=\"airport_id\"]"));
		Select Airport=new Select (AirportDropDown);
		//Airport.selectByVisibleText("Billund (BLL)");
		List<WebElement>show=Airport.getOptions();
		for(int i=0;i<show.size();i++)
		{
		    
			System.out.println(show.get(i).getText());  
			
		}
		
		List <WebElement> booknow=driver.findElements(By.xpath("//*[@class=\"btn mb1 btn-block waves-effect waves-light btn-info\"]"));
	    for(int i=0;i<1;i++)
	    {
	    	booknow.get(i).click();
	    }
	      
	    driver.findElement(By.xpath("//*[@name=\"date_out\"]")).click();
	    driver.findElement(By.xpath("//*[@data-day=\"30\"]")).click();
	    driver.findElement(By.xpath("//*[@class=\"btn-flat datepicker-done waves-effect btn-confirm\"]")).click();
	    
	    System.out.println("Number of hours available for booking");
	    WebElement hrdropdown=driver.findElement(By.xpath("//*[@id=\"hour-out\"]"));
	    Select slcthr=new Select(hrdropdown);
	    slcthr.selectByValue("14");
	    List <WebElement>show1  =  slcthr.getOptions();
	    for(int i=0;i<show1.size();i++)
	  {
		  
		  System.out.println(show1.get(i).getText());
	  }
	  
	  System.out.println("Number of Minutes available for booking");
	  WebElement mntdropdown=driver.findElement(By.xpath("//*[@id=\"minute-out\"]"));
	  Select mnt=new Select(mntdropdown);
	  mnt.selectByValue("30");
	  List <WebElement>show2  =  mnt.getOptions();
	  for(int i=0;i<show2.size();i++)
	  {
		  
		  System.out.println(show2.get(i).getText());
	  }
	  
	  
	  //driver.findElement(By.xpath("//*[@id=\"date-return\"]")).click();
	  
	  System.out.println("Number of hours available for booking");
	    WebElement hrdropdown2=driver.findElement(By.xpath("//*[@id=\"hour-in\"]"));
	    Select slcthr2=new Select(hrdropdown2);
	    slcthr2.selectByValue("05");  
	  
	  System.out.println("Number of Minutes available for booking");
	  WebElement mntdropdown2=driver.findElement(By.xpath("//*[@id=\"minute-in\"]"));
	  Select mnt2=new Select(mntdropdown2);
	  mnt2.selectByValue("30");
	  
	  WebElement AirportDropDown1=driver.findElement(By.xpath("//*[@id=\"airport-id-departure\"]"));
		Select Airport1=new Select (AirportDropDown1);
		Airport1.selectByVisibleText("Billund (BLL)");
	  
	  
	  
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"date-return\"]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='31'])[2]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Select'])[2]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"button-booking\"]")).click();
		
	    driver.findElement(By.xpath("//*[@id=\"input-payment-firstname\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"input-payment-lastname\"]")).sendKeys("User");
		driver.findElement(By.xpath("//*[@id=\"input-payment-email\"]")).sendKeys("testt_user013@cropsly.com");
		
		System.out.println("List of all countries under codes dropdown");
		WebElement code=driver.findElement(By.xpath("//*[@id=\"country_code_picker\"]"));
		Select countrycode=new Select(code);
		countrycode.selectByIndex(5);
		
		List <WebElement> printcountrycode=countrycode.getOptions();
		for(int i=0;i<printcountrycode.size();i++)
		{
            System.out.println(printcountrycode.get(i).getText());
            
		}
				
		driver.findElement(By.xpath("//*[@id=\"input-payment-telephone\"]")).sendKeys("8699235075");
		driver.findElement(By.xpath("//*[@id=\"input-payment-address-1\"]")).sendKeys("copenhagen");
		driver.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]")).sendKeys("1620");
		driver.findElement(By.xpath("//*[@id=\"input-payment-city\"]")).sendKeys("copenhagen");
		driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]")).sendKeys("Denmark");
		driver.findElement(By.xpath("//*[@value=\"Continue\"]")).click();
		
		
		
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		boolean cleanstatus=driver.findElement(By.xpath("//*[@name=\"cleaning\"]")).isSelected();
		System.out.println("Cleaning bag checkbox statu"+" "+cleanstatus);
		driver.findElement(By.xpath("//*[@name=\"cleaning\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"modal-close waves-effect waves-green btn-flat\"]")).click();
		
		boolean cancelstatus=driver.findElement(By.xpath("//*[@name=\"refundable\"]")).isSelected();
		System.out.println("Cancel Insurance checkbox statu"+" "+cancelstatus);
		driver.findElement(By.xpath("//*[@name=\"refundable\"]")).click();
		driver.findElement(By.xpath("(//a[@onclick=\"javascript:$('#modal-refundable').modal('close').remove();return false;\"])[1]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[2]/label[1]/span[1]")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@class=\"btn waves-effect btn-confirm waves-light btn-large right button-addons-continue\"]")).click();
		
        String act_title=driver.getTitle();           
		
		if(act_title.equals("Checkout"))
		{
			System.out.println("User is successfully landed to the"+" "+act_title+" "+"page");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"agreement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
		
		driver.findElement(By.xpath("//*[@name=\"cardnumber\"]")).sendKeys("1000 0000 0000 0008");
		driver.findElement(By.xpath("//*[@id=\"expiration-month\"]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"expiration-year\"]")).sendKeys("25");
		driver.findElement(By.xpath("//*[@id=\"cvd\"]")).sendKeys("808");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
       
		
		
		
		
	}

}
