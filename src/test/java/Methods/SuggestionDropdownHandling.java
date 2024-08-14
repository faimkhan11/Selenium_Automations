package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionDropdownHandling {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("Selenium");
	   List<WebElement> searchoptions=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@class=\"pcTkSc\"]"));
	   System.out.println(searchoptions.size());
	   
	   for(int i=0;i<searchoptions.size();i++)
	   {
		   System.out.println(searchoptions.get(i).getText()); 
		   
		   if(searchoptions.get(i).getText().equals("selenium interview questions"))
		   {
			   searchoptions.get(i).click();
			   break;
		   }
	   }
	}

}
