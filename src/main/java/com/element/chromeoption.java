package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeoption {

	public static void main(String[] args) 
	{
			System.out.println("sdsdd");
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "F://ramya_selenium//maven_proj//drivers//chromedriver.exe");
	        WebDriver driver=new ChromeDriver(option);
	        driver.get("www.facebook.com");
	        driver.findElement(By.id("email")).sendKeys("tippannnavar.ramya08@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Ramya@34");

	}

}
