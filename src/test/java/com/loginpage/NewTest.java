package com.loginpage;

import org.testng.annotations.Test;

import com.element.homepage_fb;

import org.openqa.selenium.support.PageFactory;

public class NewTest extends BaseClass 
{
	@Test(priority=0)
	public void loginapplication() throws Exception 
	 {   
		
		homepage_fb fb =PageFactory.initElements(driver, homepage_fb.class);
		Thread.sleep(1000);
	    fb.verifylink();
	    
     }
	@Test(priority=1)
	public void login() throws Exception 
	 {   
		
		homepage_fb fb =PageFactory.initElements(driver, homepage_fb.class);
	    Thread.sleep(2000);
	    fb.clickonforgotlink("9538624051");
	    
     }
}