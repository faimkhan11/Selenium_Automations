package Session21;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Verify_User_is_Able_to_Purchase_subs {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		
		InitializingClass buysubs=new InitializingClass();
		buysubs.LaunchWebsite();
		buysubs.login();
		buysubs.upgradebtn();
		buysubs.buySubs();
		

	}

}
