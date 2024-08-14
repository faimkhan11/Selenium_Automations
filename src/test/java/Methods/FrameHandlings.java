package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandlings {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
  //Frame1:
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("//*[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("Hellow");
		
//Revert Back to Default state before switching to new frame
		
		driver.switchTo().defaultContent();

 //Frame2:
		WebElement frame2=driver.findElement(By.xpath("//*[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name=\"mytext2\"]")).sendKeys("World");
		
		
//Revert Back to Default state before switching to new frame
		
		driver.switchTo().defaultContent();
		
//Frame3:
	//	WebElement frame3=driver.findElement(By.xpath("//*[@src=\"https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]"));
		WebElement frame3=driver.findElement(By.xpath("//*[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"i8\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"i19\"]")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@role=\"listbox\"]")).click();
		
		WebElement clck=driver.findElement(By.xpath("//*[@role=\"listbox\"]"));
		Select yes=new Select(clck);
		yes.selectByIndex(0);
		
 		
	}

}
