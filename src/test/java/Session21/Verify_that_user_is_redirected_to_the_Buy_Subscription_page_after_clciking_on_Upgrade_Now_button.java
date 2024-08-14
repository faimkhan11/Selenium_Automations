package Session21;

public class Verify_that_user_is_redirected_to_the_Buy_Subscription_page_after_clciking_on_Upgrade_Now_button {

	public static void main(String[] args)
	{
	   InitializingClass BuySubsPage=new InitializingClass();
	   BuySubsPage.LaunchWebsite();
	   BuySubsPage.login();
	   BuySubsPage.upgradebtn();
	   BuySubsPage.buysubspage();

	}

}
