package Utility;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Basepage.Basepage;

public class UtilityMethods extends Basepage {

	 Actions act=new Actions(driver);
	 public WebElement FindAndWait(String locator,String specifier) throws Exception{
		 
		 logger.info("Inside FindAndWait method :"+locator+","+specifier);
		 WebElement webelem = null;	
		 if(locator.equals("xpath")){
			 
			 webelem=driver.findElement(By.xpath(specifier));
			 
		 }
		 else if(locator.equals("css")){
			 
			 webelem=driver.findElement(By.cssSelector(specifier));
		 }
		 
		 else if(locator.equals("id")){
			 
			 webelem=driver.findElement(By.id(specifier));
		 }
		 
		 else if(locator.equals("class")){
			 
			 webelem=driver.findElement(By.className(specifier));
		 }
		 
		 Thread.sleep(2000);
		 return webelem;
	 }
	 
	 public void MouseActions(String action,WebElement element) throws Exception{
		 
		 logger.info("Inside MouseActions method :"+action+","+element);
		 if(action.equals("Mouse Over")){
			 
			 act.moveToElement(element).perform();
			 
		 }
		 else if(action.equals("Double Click")){
			 
			 act.moveToElement(element).doubleClick().build().perform();
		 }
		 
	 }
	 
	 public void ClickAction(WebElement element) throws Exception{
		 
		 
		  logger.info("Inside ClickAction method :"+element);
		  act.moveToElement(element).click().build().perform();
		  Thread.sleep(2000);
		 
		 
		 
		 
	 }
	 
	 public void SetTextInputElement(WebElement element,String text)throws Exception{
		 
		 logger.info("Inside SetTextInputElement method :"+element+","+text);
		 element.clear();
		 element.sendKeys(text);
		 Thread.sleep(2000);
		 
		 
	 }
	 
	 public List<WebElement> GetList(String specifier) throws Exception{
		 
		 logger.info("Inside GetList method :"+specifier);
		 List<WebElement> list=driver.findElements(By.xpath(specifier));
		 return list;
	 }
	 
	 public String GetElementText(String locator,String specifier) throws Exception{
		 
		 logger.info("Inside GetElementText method :"+locator+","+specifier);
		 WebElement element=FindAndWait(locator, specifier);
		 logger.info("Actual Text:"+element.getText());
		 return element.getText();
		 
		 
	 }
}
