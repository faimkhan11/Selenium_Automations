package Session21;

public class Verify_that_user_is_redireted_to_the_subscriptions_page_after_login {

	public static void main(String[] args) 
	
	{
		InitializingClass subspage=new InitializingClass();
		subspage.LaunchWebsite();
		subspage.login();
		subspage.subspage();
	    
		
	}
	
	

}
