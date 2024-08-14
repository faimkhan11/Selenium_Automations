package Session21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/* Test Case:
  1.Open Chrome browser
  2.Open URL
  3. Validate text
  4.Close
 */

public class Verify_User_is_able_to_Open_TA_Website {

	public static void main(String[] args) 
	{
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();          //Launch Chrome Browser
		
		driver.get("https://stage.trafikalarm.dk/");    //Open URL
		
		String act_title=driver.getTitle();            //Verify the landing page is correct or not
		
		if(act_title.equals("Trafik Alarm | Undgå fartbøder og kør sikkert"))
		{
			System.out.println("User is successfully landed to the Traffik Alarm Website");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		driver.close();		        //Close
        
	}

}
