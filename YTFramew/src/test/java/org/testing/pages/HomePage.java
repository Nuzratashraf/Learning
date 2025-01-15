package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.response.Response;

public class HomePage {
	ChromeDriver driver;
	Properties pr;
	
	
	public HomePage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void click_Trending() throws InterruptedException
	{
		WebElement menu =driver.findElement(By.xpath(pr.getProperty("menu")));
	       menu.click();
	        Thread.sleep(3000);
	        
	        
	      WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
	        
	        trending.click();
	        Thread.sleep(3000);
		
	        
		
	}
	public void click_History() throws InterruptedException
	{
		WebElement menu =driver.findElement(By.xpath(pr.getProperty("menu")));
	       menu.click();
	        Thread.sleep(3000);

		      
			
			 WebElement history = driver.findElement(By.xpath(pr.getProperty("history")));
		     history.click();
		
	}
	public void click_Subscriptions() throws InterruptedException
	{
		WebElement menu =driver.findElement(By.xpath(pr.getProperty("menu")));
	       menu.click();
	        Thread.sleep(3000);
	        
	        WebElement subscription = driver.findElement(By.xpath(pr.getProperty("subscription")));
		     subscription.click();  

	}
	public void click_Library() throws InterruptedException
	{
		WebElement menu =driver.findElement(By.xpath(pr.getProperty("menu")));
	       menu.click();
	        Thread.sleep(3000);
	        
	        
	      WebElement library=driver.findElement(By.xpath(pr.getProperty("library")));
	        
	     library.click();
	        Thread.sleep(3000); 
	}
	public void click_WatchLater() throws InterruptedException
	{
		WebElement menu =driver.findElement(By.xpath(pr.getProperty("menu")));
	       menu.click();
	        Thread.sleep(3000);
	        
	       WebElement watchLater=driver.findElement(By.linkText("Watch later")) ;
	       watchLater.click();
	}
	

}
