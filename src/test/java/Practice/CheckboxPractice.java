package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//	Approach 1: Simple click on 1 Checkbox:
	//	driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
		
		
	/*  Approach 2: When we need to select all checkboxes available on the page
		
		List <WebElement> checkbox=driver.findElements(By.xpath("//*[@class=\"form-check form-check-inline\"]"));
		
		for(int i=0; i<checkbox.size();i++)
		{
		   checkbox.get(i).click();
	     }
	*/     
	
	/* Approach 3: When we need to click on first few checkboxes
		
		List <WebElement>checkbox=driver.findElements(By.xpath("//*[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		for(int i=0;i<5;i++)
		{
			checkbox.get(i).click();
		}
		
	*/
	// Approach 4: Wehn we need to select last few checkboxes
		
        List <WebElement>checkbox=driver.findElements(By.xpath("//*[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		for(int i=6;i>4;i--)
		{
		
			checkbox.get(i).click();
		}
		

	}

}
	
