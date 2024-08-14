package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://airshells.com/?lang=2");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		Thread.sleep(2000);
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"subscribeButton\"]"));
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		driver.findElement(By.xpath("//*[@id=\"newsletter_email\"]")).sendKeys("testuser002@cropsly.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"subscribeButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"newsletter_checkbox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"subscribeButton\"]")).click();
		String Text=driver.findElement(By.xpath("//*[@class=\"material-icons left\"]")).getText();
		System.out.println(Text);

		
		// WebElement scrollup = driver.findElement(By.id("billing_postcode"));
			//	js.executeScript("arguments[0].scrollIntoView();", scrollup);
	}

}
