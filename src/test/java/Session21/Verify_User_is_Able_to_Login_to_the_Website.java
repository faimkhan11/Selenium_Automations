package Session21;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_User_is_Able_to_Login_to_the_Website {

	public static void main(String[] args) throws InterruptedException
	{
		InitializingClass OpenWebsite = new InitializingClass();
		OpenWebsite.LaunchWebsite();
		OpenWebsite.login();
		OpenWebsite.logout();
				
    }
	
}