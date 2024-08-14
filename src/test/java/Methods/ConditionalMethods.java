package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://stage.trafikalarm.dk/");
	//	Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//1. isDisplayed Method
		boolean logoStatus=driver.findElement(By.xpath("//*[@class=\"site-logo-img\"]")).isDisplayed();
		System.out.println("Logo is Displayed:"+" "+logoStatus);
		
		//2. isEnabled Method
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"newsletter_checkbox\"]"));
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		boolean checkE2enable=driver.findElement(By.xpath("//*[@id=\"newsletter_email\"]")).isEnabled();
		System.out.println("CheckBox is Enables"+" "+checkE2enable);
		
		//3. isSelected Method
		boolean checkSelect=driver.findElement(By.xpath("//*[@id=\"newsletter_checkbox\"]")).isSelected();
		System.out.println("Checkbox is selected"+" "+checkSelect);
		
	//	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"newsletter_checkbox\" or @class=\"filled-in\"]")).click();
		boolean checkSelect1=driver.findElement(By.xpath("//*[@id=\"newsletter_checkbox\"]")).isSelected();
		System.out.println("Checkbox is selected"+" "+checkSelect1);
		
		
		
		

	}

}
