package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		//1. get methode
		
		driver.get("https://stage.trafikalarm.dk/");
		
		//2. getTitle()
		
		System.out.println(driver.getTitle());
	
		//3. getCurrentURL()
		
		//	 System.out.println(driver.getCurrentUrl());
		
		String url=driver.getCurrentUrl();
		if(url.equals("https://stage.trafikalarm.dk/"))
		{
			System.out.println("User is landed to correct page"+" "+url);
		}

		else {
			
		     }
		
		//4. getWindowHandle()
		//System.out.println(driver.getWindowHandle());
		
		//5. getWindowHandles()
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"shopkeeper-menu-item-2270\"]")).click();
		System.out.println(driver.getWindowHandles());
		
		//6. Close()
	//	driver.close();
		
		//7. Quit();
		driver.quit();
		
		
		
		
	}

}
