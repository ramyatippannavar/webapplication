package com.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class homepage_fb
{
   
	public String expected="Facebook";
	public WebDriver driver;
	
public homepage_fb(WebDriver driver)
{
	this.driver=driver;
}
	
@FindBy(xpath="//div[@class='_8ice']//child::img[@alt='Facebook']")
WebElement link;

@FindBy(xpath="//form/div/a")
WebElement forgotlink;

@FindBy(xpath="//input[@id=\"identify_email\"]")
WebElement emailORmobilenumber;


public void verifylink()
{
	    String act=link.getAttribute("alt");
	    Assert.assertEquals(act, expected);
		System.out.println("verified link on homepage");
		System.out.println(act);
}

public void clickonforgotlink(String mobilenumber) throws Exception
{
	forgotlink.click();
	Thread.sleep(2000);
	emailORmobilenumber.sendKeys(mobilenumber);
	System.out.println("enetered emai or mobile  number");
	
}
}
