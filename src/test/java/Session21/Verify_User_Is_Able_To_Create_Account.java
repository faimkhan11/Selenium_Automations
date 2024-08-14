package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_User_Is_Able_To_Create_Account {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		InitializingClass CreateAccount = new InitializingClass();
		CreateAccount.LaunchWebsite();
		CreateAccount.register();
		
		
		
		
	
	}

}
