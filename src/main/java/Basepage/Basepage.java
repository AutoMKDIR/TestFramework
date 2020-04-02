package Basepage;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.UtilityMethods;
public class Basepage {

	public UtilityMethods um;
	public static WebDriver driver;
	protected static Logger logger;
	
	public Basepage(){
		
		
		um=new UtilityMethods();
		logger = Logger.getLogger(Basepage.class);
		//logger=Logger.getLogger("TestBase");
		PropertyConfigurator.configure("D:\\JAVA_WORKSPACE\\Framework1\\src\\test\\resources\\Properties\\log4j.properties");

	
	}
	
	public static void intialization(){
		
		
		
	  	String browser="chrome";
	  	logger.info("Selected Broswer is:"+browser);
	  	String url="http://automationpractice.com/index.php";
	  	logger.info("URL is:"+url);
	 
	  	if(browser.equals("ff")){
	  		
	  	
	  		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\browserexes\\geckodriver(2).exe");
			driver=new FirefoxDriver();
			logger.info("Firefox intialized");
			
	  	}
	  
	  	
	  	else if(browser.equals("chrome")){
	  		
	  		
	  		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\browserexes\\chromedriver.exe");
			driver=new ChromeDriver();
			logger.info("Chrome intialized");
	  		
	  	}
	  	
	  	driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	
		
	}
	public static void closeBrowser(){
		
		driver.quit();
		logger.info("Browser is Closed");
	}
	
	
}

