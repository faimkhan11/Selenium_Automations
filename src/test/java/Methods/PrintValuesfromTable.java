package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuesfromTable {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int rows=driver.findElements(By.xpath("//*[@name=\"BookTable\"]//tr")).size();
		System.out.println(rows);
		int colomns=driver.findElements(By.xpath("//*[@name=\"BookTable\"]//th")).size();
		System.out.println(colomns);
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=colomns;c++)
			{
				String show=driver.findElement(By.xpath("//*[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(show);		
			}
			
		}

	}

}
