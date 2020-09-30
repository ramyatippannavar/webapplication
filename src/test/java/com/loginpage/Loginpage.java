package com.loginpage;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import com.element.Webelements;

public class Loginpage extends BaseClass 
{
	
	@Test()
	public void loginapp() throws Exception 
	{   
		Logger logger=Logger.getLogger("config.credentials()");
		  
		PropertyConfigurator.configure("Log4j.properties");
		test=repo.createTest("logintest"); 
		logger.info("initializing");
		Webelements wb = PageFactory.initElements(driver, Webelements.class);
	    test.info("logging");
	  
		wb.setup(excel.getstringdata("Sheet1", 0, 0), excel.getstringdata("Sheet1", 0, 1));
		logger.info("utilized");
		
		Thread.sleep(1000);   
		test.pass("passed");	
	}	
}