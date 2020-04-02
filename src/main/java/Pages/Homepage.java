package Pages;

import org.openqa.selenium.WebElement;

import Basepage.Basepage;
import Utility.UtilityMethods;

public class Homepage extends Basepage{
	
	
	
	public void ClickSignInButton() throws Exception{
		
		
		logger.info("ClickSignInButton method started");
		WebElement ele=um.FindAndWait("class", "login");
		um.ClickAction(ele);
		logger.info("ClickSignInButton method ended");
	}
	
	
	

}
