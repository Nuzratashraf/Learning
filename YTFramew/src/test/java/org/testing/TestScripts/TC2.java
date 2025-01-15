package org.testing.TestScripts;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.testing.base.*;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC2 extends Base{

	
	
	@Test
	public void tc2() throws InterruptedException, IOException
	{
	
		Properties pr=PropertiesLoad.loadPropertyFile("../YTFramew/Object.properties");
		LoginPage login=new LoginPage(driver, pr);
		login.Signin("nusrathautomation@gmail.com", "applebag@111");
	    HomePage home=new HomePage(driver, pr);
		home.click_History();
		login.Signout();
		System.out.println("tc2 finished");
        
        
    }
}
     
        
      
   


