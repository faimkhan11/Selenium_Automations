package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_user_is_able_to_open_register_page {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();                   //Chrome Brower is open
		
		driver.manage().window().maximize();
		
		driver.get("https://stage.trafikalarm.dk/");              //Open website URL
		
		driver.findElement(By.className("btn-primary")).click();  //Click on Create Account button
		
		String act_title=driver.getTitle();                       //Verify the landing page
		
		if(act_title.equals("Min konto - Trafik Alarm - Stage"))
		{
			System.out.println("User is successfully landed to the Create Account page");
		}
		else
		{
			System.out.println("Landed page is not correct");
		}
		
		driver.quit();
		

	}

}
