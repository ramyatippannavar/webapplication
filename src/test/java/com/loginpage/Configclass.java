package com.loginpage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configclass 
{
	Properties prop;
	static WebDriver driver;
     public Configclass() throws Exception
     {
    	 File src=new File("./config/config.properties");
    	 FileInputStream fis=new FileInputStream(src);
    	 prop=new Properties();
    	 prop.load(fis);
  
     }
     
     public String getbrowser()
     {
    	 return prop.getProperty("Browser");
     }
     
     public String getUrl()
     {
    	 return prop.getProperty("qaurl");
     }
     public String Url()
     {
    	 return prop.getProperty("url");
     }
    public String credentials()
    {
    	return prop.getProperty("class1");
    }
    public String user()
    {
    	return prop.getProperty("username");
    	
    }
    public String pass()
    {
    	return prop.getProperty("pass");
    	
    }
}

