package Methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FocusonNewOpenedWindow {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://stage.trafikalarm.dk/");
		driver.findElement(By.xpath("//*[@id=\"shopkeeper-menu-item-2270\"]")).click();
		Set <String> windowIDs=driver.getWindowHandles();
		System.out.println(windowIDs);
		List <String>getWindowIDs=new ArrayList(windowIDs);
		String Parent=getWindowIDs.get(0);
		String Child=getWindowIDs.get(1);
		
        driver.switchTo().window(Child);		
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("Hello");
		driver.findElement(By.linkText("Generelt")).click();
		
		

	}

}
