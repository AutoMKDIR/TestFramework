package Pages;

import Basepage.Basepage;

public class OrderHistorypage extends Basepage{
	
	public void GetOrderHistoryDetails() throws Exception{
		
		logger.info("GetOrderHistoryDetails method started");
		String order_reference_number=um.GetElementText("xpath", "//a[@class='color-myaccount']");
		System.out.print("The Order Reference Id:"+order_reference_number);
		
		String order_date=um.GetElementText("class", "history_date bold");
		System.out.print("The Order Date:"+order_date);
		
		String total_price=um.GetElementText("class", "price");
		System.out.print("The Total Price:"+total_price);
		logger.info("GetOrderHistoryDetails method ended");
		
	}
	
	
	
	

}
