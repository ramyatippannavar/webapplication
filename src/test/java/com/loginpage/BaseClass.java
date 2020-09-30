package com.loginpage;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass 
{
	WebDriver driver;
	public Excelprovider excel;
	public Configclass config;
	public ExtentReports repo;
	public ExtentTest test;
	
	@BeforeClass
	public void setup() throws Exception 
	{
		excel = new Excelprovider();
		config=new Configclass();
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/FB_"+ Helerclass.screenshotdatetime()+".html"));		
		repo=new ExtentReports();
		repo.attachReporter(extent);
	}
		
	@BeforeMethod
	public void beforetest()
	{
	  driver = Pageclass.startapplicaction(driver, config.getbrowser(),config.Url());
	}
	
	@AfterMethod
	public void teardownmethod(ITestResult res) throws Exception
	{
		if(res.getStatus()==ITestResult.FAILURE)
		{
			Helerclass.screenshot(driver);
			test.fail("failed due to error",MediaEntityBuilder.createScreenCaptureFromPath(Helerclass.screenshot(driver)).build());
			repo.flush();
			Pageclass.Stopapplication(driver);
			
		}	
		else
		{   Thread.sleep(1000);
			System.out.println("stopping appp");
			Pageclass.Stopapplication(driver);
		}
	}
}