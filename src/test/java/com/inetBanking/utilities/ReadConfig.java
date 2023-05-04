package com.inetBanking.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	Public ReadConfig()
	{
		File src = new File("./configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream();
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
			
		}
			
		public String getApplicationURL()
		{
			String URL=pro.getProperty("baseURL");
		}
		
		public String getUserName()
		{
			String URL=pro.getProperty("userName");
		}
		public String getPassword()
		{
			String URL=pro.getProperty("password");
		}
	}
}
