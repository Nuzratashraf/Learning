package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.LoginPage;
import org.testing.pages.VideoPlay;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 extends Base{
	
	
	
	
	@Test
	public void tc5() throws InterruptedException, IOException
	{
		
		Properties pr=PropertiesLoad.loadPropertyFile("../YTFramew/Object.properties");
		LoginPage login=new LoginPage(driver, pr);
		login.Signin("nusrathautomation@gmail.com", "applebag@111");
		VideoPlay play=new VideoPlay(driver, pr);
	    play.channel_Subscription();
		login.Signout();
		
		System.out.println("tc5 finished");
        
    }



}
