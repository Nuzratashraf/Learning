package org.testing.TestScripts;




import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.*;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TC1 extends Base{

	
 
	
	
	@Test
	
	public void tc1() throws InterruptedException, IOException
	{
	
		Properties pr=PropertiesLoad.loadPropertyFile("../YTFramew/Object.properties");
		LoginPage login=new LoginPage(driver, pr);
		login.Signin("nusrathautomation@gmail.com","applebag@111");
	    HomePage home=new HomePage(driver, pr);
	    home.click_Trending();
		login.Signout();
		
		
	      
	        
	    System.out.println("tc1 finished");
        
        
    }

	
	
		
	

		
	}
	

