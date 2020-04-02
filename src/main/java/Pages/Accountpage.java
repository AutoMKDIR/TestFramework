package Pages;

import org.openqa.selenium.WebElement;

import Basepage.Basepage;

public class Accountpage extends Basepage{

	
	public void SelectWomenCategory() throws Exception{
		
		logger.info("SelectWomenCategory method started");
		WebElement women_button=um.FindAndWait("xpath", "//a[@title='Women']");
		um.ClickAction(women_button);
		logger.info("SelectWomenCategory method ended");
		
	}
	
	public void GoToOrderHistory()throws Exception{
		
		logger.info("GoToOrderHistory method started");
		WebElement women_button=um.FindAndWait("xpath", "//a[@title='Orders']");
		um.ClickAction(women_button);
		logger.info("GoToOrderHistory method ended");
		//a[@title='Orders']
	}
}
