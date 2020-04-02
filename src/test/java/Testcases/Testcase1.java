package Testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Basepage.Basepage;
import Pages.Accountpage;
import Pages.Homepage;
import Pages.Loginpage;
import Pages.OrderHistorypage;
import Pages.Orderpage;
import Pages.WomenStorepage;
public class Testcase1 extends Basepage{
	
	Homepage hp=new Homepage();
	Loginpage lp=new Loginpage();
	Accountpage ap=new Accountpage();
	WomenStorepage wp= new WomenStorepage();
	Orderpage op=new Orderpage();
	OrderHistorypage ohp=new OrderHistorypage();
	
	
	@BeforeTest
	public void Setup(){
		Basepage.intialization();
		
	}
	
	
	@Test
	public void test() throws Exception{
		
		
		//Click on SignIn Button
		hp.ClickSignInButton();
		//Create account and complete the sign up form and resigter
		lp.CreateNewAccount("xyz@gmail.com");
		lp.FillUpInfoForm("Mrs", "Monica", "Shailesh", "Mar2020xx!", "24", "12", "1993");
		lp.RegisterNewAccount();
		//click women category on account page
		ap.SelectWomenCategory();
		//Click on any product(quick view) and add 2 products in the cart
		wp.QuickviewAnyProduct();
		wp.CloseQuickView();
		wp.Add2Products();
		wp.GotoCart();
		//Complete the order with payment
		op.CompleteTheOrder();
		op.GoToCustomerProfile();
		//Get the order details
		ohp.GetOrderHistoryDetails();
		
		
		
	}
	
	@AfterTest
	public void TearDown(){
		
		Basepage.closeBrowser();
		
	}
	
	
	
	
}
