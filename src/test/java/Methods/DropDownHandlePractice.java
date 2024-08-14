package Methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class DropDownHandlePractice {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        //WebElement selectDOByear=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"ui-datepicker-year\"]")));

        
//driver.get() Methode:
        
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/"); //Open Website
        
//driver.getTitle Method:
        
        String landingPage=driver.getTitle();
        if(landingPage.equals("Dummy ticket for applying visa - Verifiable flight reservation for embassy"))
        {
           System.out.println("User is successfully landed to:"+" "+landingPage);
        }
        else
        {
        	System.out.println("User is not landed to"+" "+landingPage);
        }
        
//driver.isDisplayed Method
        
        boolean logo=driver.findElement(By.xpath("//*[@class=\"navbar-logo-img navbar-logo-img-normal\"]")).isDisplayed();
        System.out.println("Status of logo is:"+" "+logo);
 

//driver.getText Method
        String headerText = driver.findElement(By.xpath("//*[@class=\"fg-text-dark ffb-h2-1\"]//p[2]")).getText();
        System.out.println("Header Text of the page is:"+" "+headerText);
        

//findElement by linkText Method
        driver.findElement(By.linkText("Click here to enter your code")).click();
        
 
//driver.sendKeys Method
        driver.findElement(By.xpath("//*[@name=\"coupon_code\"]")).sendKeys("Diwali Bumber 100");
        
  
//driver.click Method
        driver.findElement(By.xpath("//*[@value=\"Apply coupon\"]")).click();
        
        
//Radio Button        
        driver.findElement(By.xpath("//*[@id=\"product_551\"]")).click(); 
       
      
//Success Message  
        Thread.sleep(3000);
        String couponSuccessMsg = driver.findElement(By.xpath("//*[@id=\"opc-messages\"]")).getText();
        System.out.println("Success Booking Msg:"+" "+couponSuccessMsg);
        

//Input Fields  
        driver.findElement(By.xpath("//*[@id=\"travname\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"travlastname\"]")).sendKeys("User");
        driver.findElement(By.xpath("//*[@id=\"order_comments\"]")).sendKeys("Test Order");
        

//DOB Calender Methode (Direct Method)
        driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
        driver.findElement(By.xpath("//*[@data-date=\"9\"]")).click();
        
 
        
//DOB Calender Methode (DropDown Method)
        
        //Select Month
       
        driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
        Thread.sleep(2000);
        WebElement selectDOBMonth = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]"));
        Select DOBmonth = new Select(selectDOBMonth);
        DOBmonth.selectByValue("2");
        
        
        //Select Year
        
        Thread.sleep(2000);
        WebElement selectDOBYear = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]"));
        Select DOByear = new Select(selectDOBYear);
        DOByear.selectByValue("1997");
        driver.findElement(By.xpath("//*[@data-date=\"30\"]")).click();
        
        
//Radio Buttons
        driver.findElement(By.xpath("//*[@name=\"sex\"][1]")).click();
        
   
        
//Checkbox (Visibility and Click)    
        Boolean addMore = driver.findElement(By.xpath("//*[@id=\"addmorepax\"]")).isSelected();
        System.out.println("Verify add More checkbox is selected:"+" "+addMore);
        driver.findElement(By.xpath("//*[@id=\"addmorepax\"]")).click();
        
        
   
//Radio Button (Visibility and Clik)   
        Boolean oneWay = driver.findElement(By.xpath("//*[@id=\"traveltype_1\"]")).isSelected();
        System.out.println("Verify OneWay radio button is selected:"+" "+oneWay);
        String oneWayStatus=String.valueOf(oneWay);
        Thread.sleep(2000);
        Boolean roundTrip = driver.findElement(By.xpath("//input[@id='traveltype_2']")).isSelected();
        System.out.println("Verify RoundTrip radio button is selected:"+" "+roundTrip);
        String roundTripStatus=String.valueOf(roundTrip);
        
        if(oneWayStatus.equals("False"))
        {
        	driver.findElement(By.xpath("//*[@id=\"traveltype_1\"]")).click();
        	System.out.println("OneWay radio button is selected");
        	
        }
        else
        {
        	driver.findElement(By.xpath("//*[@id=\"traveltype_2\"]")).click();
        	System.out.println("Round trip radio button is selected");
        }
        
    
//SendKeys Method
        driver.findElement(By.xpath("//*[@id=\"fromcity\"]")).sendKeys("Chandigarh");
        driver.findElement(By.xpath("//*[@id=\"tocity\"]")).sendKeys("Delhi");
        
        
        
//Calender Having two dropdowns
        
      //  Select Month
        driver.findElement(By.xpath("//*[@id=\"departon\"]")).click();
        WebElement monthdepartdrp = driver.findElement(By.xpath("//*[@data-handler=\"selectMonth\"]"));
        Select departMonth = new Select(monthdepartdrp);
        departMonth.selectByValue("7");
        Thread.sleep(3000);
        
     // Select Year
        WebElement yeardepartdrp = driver.findElement(By.xpath("//*[@data-handler=\"selectYear\"]"));
        Select departYear = new Select(yeardepartdrp);
        departYear.selectByValue("2024");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@data-date=\"15\"]")).click();
       
        
        
//sendKeys Method
        driver.findElement(By.xpath("//*[@id=\"notes\"]")).sendKeys("Test Information");
  
        
        
//Dropdown Handling  
        
        WebElement VAdropdown = driver.findElement(By.xpath("//*[@id=\"reasondummy\"]"));
        Select VAvalue = new Select (VAdropdown);
        VAvalue.selectByValue("1");
        
        
//Calender Having two dropdowns
   
        //  Select Month
        driver.findElement(By.xpath("//*[@id=\"appoinmentdate\"]")).click();
        WebElement appmonthdrp = driver.findElement(By.xpath("//*[@data-handler=\"selectMonth\"]"));
        Select appMonth = new Select(appmonthdrp);
        appMonth.selectByValue("7");
        Thread.sleep(3000);
        
     // Select Year
        WebElement appyeardrp = driver.findElement(By.xpath("//*[@data-handler=\"selectYear\"]"));
        Select appYear = new Select(appyeardrp);
        appYear.selectByValue("2024");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@data-date=\"30\"]")).click();
        
     
        
//Radio Button
        boolean emailradiobutton = driver.findElement(By.xpath("//*[@id=\"deliverymethod_1\"]")).isSelected();
        System.out.println("Email radio button is by default selected:"+" "+emailradiobutton);
        driver.findElement(By.xpath("//*[@id=\"deliverymethod_1\"]")).click();
       
        
        
//sendKeys Method
        driver.findElement(By.xpath("//*[@id=\"billname\"]")).sendKeys("Test Data");
        driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("9999999999");
        driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("Test Data");
        driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("Test Data");
        driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Test Data");
        driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("1620");
  
        
        
//Handling Dropdown
        Thread.sleep(2000);
        WebElement countrydropdown = driver.findElement(By.xpath("//*[@id=\"billing_country\"]"));
        Select country = new Select(countrydropdown);
        country.selectByVisibleText("Denmark");
        
       
// Print Order Details
        WebElement ordertable1 = driver.findElement(By.xpath("//tr[@class='cart_item opc_cart_item']"));
        System.out.println("Verify Product and Total Amount:"+" "+ordertable1.getText());
        WebElement ordertable = driver.findElement(By.xpath("//table[@class='shop_table woocommerce-checkout-review-order-table']//tfoot"));
        System.out.println("Verify SubTotal and Total Amount to pay:"+" "+ordertable.getText());
 
        
           
//Switch to new Window tab
        driver.switchTo().newWindow(WindowType.TAB);

        
//Slider Handling using Mouse Drag and Drop action 
        
        //Min to Max (Horizontal Action) 
        
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        Thread.sleep(3000);
        
        Actions slideraction=new Actions(driver);
        WebElement minSliderValue=driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"][1]"));
        System.out.println("Values before sliding"+" "+minSliderValue.getLocation() );
        slideraction.dragAndDropBy(minSliderValue, 100, 250).perform();
        System.out.println("Values after sliding"+" "+minSliderValue.getLocation());

        
        
       //Max to Min
        
        Thread.sleep(3000);
        WebElement maxSliderValue=driver.findElement(By.xpath("//span[2]"));
        System.out.println("Values before sliding"+" "+maxSliderValue.getLocation());
        slideraction.dragAndDropBy(maxSliderValue, -100, 250).perform();
        System.out.println("Values after sliding"+" "+maxSliderValue.getLocation());


//Switch to new Window Tab
        driver.switchTo().newWindow(WindowType.TAB);

        
        
//Keyboard actions Handling 
        
        
        //Key Up and Key Down Method
        driver.get("https://text-compare.com/");
        driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Welcome");
        Thread.sleep(3000);
        
        Actions keyboardActions=new Actions(driver);
        
        keyboardActions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        keyboardActions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        keyboardActions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        keyboardActions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
              
        
        //Open link in new tab using keaboard actions
        driver.get("https://text-compare.com/");
        WebElement newTab = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
        Actions openNewTab = new Actions(driver);
        openNewTab.keyDown(Keys.CONTROL).click(newTab).perform();
       
      
//driver.getWindowHandles
       
        List<String> getIDs = new ArrayList(driver.getWindowHandles());
        System.out.println(getIDs);
        String parent=getIDs.get(0);
        String child1=getIDs.get(1);
        String child2=getIDs.get(2);
        String child3=getIDs.get(3);
        
        

//Switch to new Window Tab
        driver.switchTo().newWindow(WindowType.TAB);

        
        
//Mouse Actions 
        
        //moveToElement Action
        driver.get("https://demo.opencart.com/");
        Thread.sleep(5000);
        WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        
        Actions act0 = new Actions(driver);
        act0.moveToElement(desktop).moveToElement(mac).click().perform();

        
        		
//Switch to new Window Tab
        driver.switchTo().newWindow(WindowType.TAB);        
        
     
        //Context Click action
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClick = driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));
        Actions act1 = new Actions(driver);
        act1.contextClick(rightClick).perform();
        WebElement editClick = driver.findElement(By.xpath("//span[normalize-space()='Edit']"));
        act1.click(editClick).perform();
        driver.switchTo().alert().dismiss();
        
        
//Switch to new Window Tab
        driver.switchTo().newWindow(WindowType.TAB);   
             
       
        //Double Click action
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.switchTo().frame("iframeResult");
        WebElement input0 = driver.findElement(By.xpath("//input[@id='field1']"));
        input0.clear();
        input0.sendKeys("Hello");
        WebElement copyTextbtn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        Actions act2 = new Actions(driver);
        act2.doubleClick(copyTextbtn).perform();
       
        
        
        
        
        
     
        
        
        
        
        
        
        
        
        
        
      
       
       
       
	}

}
