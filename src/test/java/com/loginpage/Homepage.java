package com.loginpage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.element.homepage_elements;

public class Homepage extends BaseClass{
  @Test
  public void Enterfields() throws Exception 
  {
	  homepage_elements home_ele=PageFactory.initElements(driver,homepage_elements.class);
	  home_ele.dosearch(excel.getstringdata("Sheet1", 0, 0),excel.getstringdata("Sheet1", 0, 1));
  }
}
