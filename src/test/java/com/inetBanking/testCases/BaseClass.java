package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	//public String baseURL= "https://tutorialsninja.com/demo/index.php?route=account/account"
	public String baseURL= readconfig.getApplicationURL();
	public String username= readconfig.getUserName();
	public String password= readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ readconfig.chromePath(););
		driver= new ChromeDriver();
		
		Logger logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
		
	}
}
