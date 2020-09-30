package com.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage_elements 
{
	String month="Oct 2020";
	String Day="2";
	WebDriver driver;
   public homepage_elements(WebDriver driver)
   {
	   this.driver=driver;
   }
   
   @FindBy(id="src")
   WebElement source;
   
   @FindBy(id="dest")
   WebElement destination;
   
   @FindBy(xpath="//input[@class='db']/parent::div//label[contains(text(),'Date')]")
   WebElement label;
   
   @FindBy(xpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")
   WebElement Month;

   
   @FindBy(xpath="//tr[@class='rb-monthHeader']//child::td[3]")
   WebElement nextbutton;
   
   @FindBy(xpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[5]")
   WebElement day;
   
   public void dosearch(String from,String To) throws Exception
   {
	  
	Thread.sleep(1000);
	source.sendKeys(from);
	Thread.sleep(1000);
	destination.sendKeys(To);
	Thread.sleep(1000);
	 label.click();
	 while(true)
	   {
		 String expectedmonth =Month.getText();
		
		 if(month.equals(expectedmonth))
		   {
			    break;
		   }
		 else
		 {
			 nextbutton.click();
		 }
	   }
	 day.click();
	
	   
   }
}
