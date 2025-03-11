package org.testing.base;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class Base {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void browserInit() throws InterruptedException, MalformedURLException
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
			
		driver.manage().window().maximize();

		
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.close();
	}
	

}
