package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basepage.Basepage;

public class Loginpage extends Basepage{

	public void CreateNewAccount(String eId) throws Exception{
		
		logger.info("CreateNewAccount method started");
		WebElement email_textbox=um.FindAndWait("id", "email_create");
		um.SetTextInputElement(email_textbox, eId);
		WebElement create_button=um.FindAndWait("id", "SubmitCreate");
		um.ClickAction(create_button);
		logger.info("CreateNewAccount method ended");
	}
	
	public void FillUpInfoForm(String salutation,String fname,String lname,String pass,String day,String month,String year) throws Exception{
		
		
		logger.info("FillUpInfoForm method started");
		//Select the Mr or Miss
		WebElement sal=null;
		if(salutation.equals("Mr")){
			
			sal=um.FindAndWait("id", "id_gender1");
			
		}
		else if(salutation.equals("Mrs")){
			
			sal=um.FindAndWait("id", "id_gender2");
			
		}
		um.ClickAction(sal);
	
		//Select FirstName,LastName,Email,Password
		
		WebElement fname_textbox=um.FindAndWait("id", "customer_firstname");
		um.SetTextInputElement(fname_textbox, fname);
		
		WebElement lanme_textbox=um.FindAndWait("id", "customer_lastname");
		um.SetTextInputElement(lanme_textbox, lname);
		
		WebElement pass_textbox=um.FindAndWait("id", "passwd");
		um.SetTextInputElement(pass_textbox, pass);
		
		
		//Select DOB
		WebElement select_day=um.FindAndWait("id", "days");
		Select day_dropdown= new Select(select_day);
		day_dropdown.selectByValue(day);
		
		WebElement select_month=um.FindAndWait("id", "months");
		Select mon_dropdown= new Select(select_month);
		mon_dropdown.selectByValue(month);
		
		WebElement select_year=um.FindAndWait("id", "years");
		Select year_dropdown= new Select(select_year);
		year_dropdown.selectByValue(year);
		logger.info("FillUpInfoForm method ended");
		
		
	}
	
	public void RegisterNewAccount() throws Exception{
		
		logger.info("RegisterNewAccount method started");
		WebElement register_button=um.FindAndWait("id", "submitAccount");
		um.ClickAction(register_button);
		logger.info("RegisterNewAccount method ended");
		
		
	}
		
	
	
	
}
