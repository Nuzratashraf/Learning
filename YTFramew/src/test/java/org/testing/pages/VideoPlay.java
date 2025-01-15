package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	
	ChromeDriver driver;
	Properties pr;
	
	
	
	public VideoPlay(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	public void video_Like() throws InterruptedException {
	
		driver.get("https://www.youtube.com/watch?v=7RWDKXQgU6Q");
		Thread.sleep(5000);
	    
	    WebElement videoLike=driver.findElement(By.xpath(pr.getProperty("videoLike")));
	    videoLike.click();

}
	public void channel_Subscription() throws InterruptedException
	{
		driver.get("https://www.youtube.com/watch?v=7RWDKXQgU6Q");
		Thread.sleep(5000);
	     WebElement channelSub=driver.findElement(By.xpath(pr.getProperty("channelSub")));
	     channelSub.click();
	}
	public void video_Comment() throws InterruptedException
	{driver.get("https://www.youtube.com/watch?v=7RWDKXQgU6Q");
	
	Thread.sleep(5000);
	
    		
   WebElement activecommentbox = driver.findElement(By.xpath("activecommentbox"));
    activecommentbox.sendKeys("good song");
    
    WebElement postbutton = driver.findElement(By.xpath(pr.getProperty("postbutton")));
	   
	   postbutton.click();
	}
}