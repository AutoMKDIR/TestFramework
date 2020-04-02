package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import Basepage.Basepage;

public class WomenStorepage extends Basepage{

	
	public void QuickviewAnyProduct() throws Exception{
		
		
		logger.info("QuickviewAnyProduct method started");
		List<WebElement> product_list=um.GetList("//ul[starts-with(@class,'product_list')]/li/div/div/div/a/img");
		//Select first Product for QuickView		
		WebElement product_one = product_list.get(1);
		um.MouseActions("Mouse Over", product_one);
		//Click on quick View
		WebElement qview=um.FindAndWait("xpath", "//span[text()='Quick view']");
		um.ClickAction(qview);
		logger.info("QuickviewAnyProduct method ended");
		}
	
	public void CloseQuickView() throws Exception{
		
		
		logger.info("CloseQuickView method started");
		WebElement close_button=um.FindAndWait("xpath", "//a[@title='Close']");
		um.ClickAction(close_button);
		logger.info("CloseQuickView method ended");
		
	}
	
	public void Add2Products() throws Exception{
		
		logger.info("Add2Products method started");
		List<WebElement> product_list=um.GetList("//ul[starts-with(@class,'product_list')]/li/div/div/div/a/img");
		for(int i=1;i<3;i++){
			
			
			WebElement product_to_be_selected = product_list.get(i);
			um.MouseActions("Mouse Over", product_to_be_selected);
			//Click on Add to cart
			WebElement add_to_cart=um.FindAndWait("xpath", "//span[text()='Add to cart']");
			um.ClickAction(add_to_cart);
		}
		logger.info("Add2Products method ended");
		
		
	}
	public void GotoCart()throws Exception{
		
		
		logger.info("GotoCart method started");
		WebElement cart_button=um.FindAndWait("xpath", "//a[@title='View my shopping cart']");
		um.ClickAction(cart_button);
		logger.info("GotoCart method ended");
	}
	
	//span[text()="Add to cart"]
	
	//span[text()="Quick view"]
	
	
}
