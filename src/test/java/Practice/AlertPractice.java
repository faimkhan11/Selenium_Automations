package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException 
	{
	   ChromeDriver driver=new ChromeDriver();
	//   driver.get("https://the-internet.herokuapp.com/javascript_alerts");  
	     driver.manage().window().maximize();
	   
	  
	   
	   //Approach 1: Accept
	/*   driver.findElement(By.xpath("//*[@onclick=\"jsAlert()\"]")).click();
	   Thread.sleep(3000);
	   driver.switchTo().alert().accept();
	 */
	   
	   //Aproach 2: Dismiss
	   
	 /*  driver.findElement(By.xpath("//*[@onclick=\"jsConfirm()\"]")).click();
	   Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
	 */  
	/*   //Approach 3: When you have to enter something on the alert popup
	   
	   driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]")).click();
	   Thread.sleep(5000);
	   Alert enter=driver.switchTo().alert();
	  System.out.println(enter.getText()); 
	   enter.sendKeys("Hello");
	   enter.accept();
	 */
	   
	   //Approach 4: When you to login on secure website 
	   
	     driver.get("https://admin:31L*&1%3E124q(@dev-sg.trafikalarm.dk/");
	     
  
	   
	}

}
