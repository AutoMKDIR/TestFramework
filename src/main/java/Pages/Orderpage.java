package Pages;



import java.util.List;

import org.openqa.selenium.WebElement;

import Basepage.Basepage;

public class Orderpage extends Basepage{
	

	public void CompleteTheOrder() throws Exception{
		
		logger.info("CompleteTheOrder method started");
		//a[@title='Proceed to checkout'
		
		while(true){
			
			List<WebElement> checker=um.GetList("//a[@title='Proceed to checkout']");
			if(checker.size()>0){
				
				if(IsTermsNCondPresent()){
					
					WebElement tnc_checkbox=um.FindAndWait("xpath", "//div[@id='uniform-cgv']/span/input[@id]");
					um.ClickAction(tnc_checkbox);
					um.ClickAction(checker.get(0));
					
				}
				else{
					
					um.ClickAction(checker.get(0));
					
				}
				
			}
			else{
				CompleteThePayment();
				logger.info("CompleteTheOrder method started");
				break;
			}
	}
 }
	
	
	
	public boolean IsTermsNCondPresent()throws Exception{
		
		
		logger.info("IsTermsNCondPresent method started");
		
		List<WebElement> checker=um.GetList("//div[@id='uniform-cgv']/span/input[@id]");
		if(checker.size()>0){
			
			logger.info("IsTermsNCondPresent method ended");
			return true;
		
		}
		logger.info("IsTermsNCondPresent method ended");
		return false;

		
	}
	
	public void GetTotalPrice() throws Exception{
		
		
		logger.info("CompleteThePayment method started");
		String price=um.GetElementText("xpath", "");
		System.out.println("The Total Price:"+price);
		logger.info("CompleteThePayment method ended");
		
	}
	
	public void CompleteThePayment()throws Exception{
		
		logger.info("CompleteThePayment method started");
		List<WebElement> pay_button =um.GetList("//a[@title='Pay by bank wire']");
		if(pay_button.size()>0){
			
			um.ClickAction(pay_button.get(0));
			WebElement conf_orfer_button=um.FindAndWait("xpath", "//button[@type='submit']");
			um.ClickAction(conf_orfer_button);
			
		}
		logger.info("CompleteThePayment method ended");
	}
	
	public void GoToCustomerProfile()throws Exception{
		
		logger.info("GoToCustomerProfile method started");
		
		WebElement profile_button=um.FindAndWait("xpath", "//a[@title='View my customer account']/span");
		um.ClickAction(profile_button);
		
		logger.info("GetOrderHistoryDetails method ended");
		//a[@title='View my customer account']/span
		//div[@id="uniform-cgv"]/span/input[@id]
	}
	
	
	
}	
		
		