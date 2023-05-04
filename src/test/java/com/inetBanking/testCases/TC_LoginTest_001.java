package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		Logger.info("URL is open");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("Entered username");
		
		lp.setPassword(password);
		Logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("title of page"))
		{
			Assert.assertTrue(true);
			Logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			Logger.info("Login test failed");
		}
		
	}
	

}
