package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	ChromeDriver driver;
	Properties pr;
	
	
	
	public LoginPage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}

	
	public void Signin(String userName,String passWord) throws InterruptedException
	{
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
		signin.click();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath(pr.getProperty("username")));
		username.sendKeys(userName);
		Thread.sleep(3000);
		WebElement button1=driver.findElement(By.xpath(pr.getProperty("button1")));
		button1.click();
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
		
		password.sendKeys(passWord);
		Thread.sleep(3000);
		WebElement button2=driver.findElement(By.xpath(pr.getProperty("button2")));
		button2.click();
		 Thread.sleep(3000);
		
	}
	
	public void Signout() throws InterruptedException
	{
		 WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
	        signout.click();
	        Thread.sleep(3000);
	        WebElement signout1=driver.findElement(By.xpath(pr.getProperty("signout1")));
	        signout1.click();
	        Thread.sleep(3000);
	}
}
