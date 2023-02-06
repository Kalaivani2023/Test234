package com.sample.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class AdactinLogin extends BaseClass{
	@BeforeClass
	public static void browser() {
		System.out.println("Execution Started");
	}
	@Before
	public void url() {
	//Launch Browser
	    browserOpen("chrome");
	 //pass Url
	   loadUrl("https://adactinhotelapp.com/");
	}
	@Test
	public void validCredentials() throws InterruptedException {
	//Valid Credentials
	  WebElement user = driver.findElement(By.id("username"));
	  WebElement pwd = driver.findElement(By.id("password"));
	  WebElement login = driver.findElement(By.id("login"));
	  Thread.sleep(5000);
	  user.sendKeys("Muthulakshmi07");
	  pwd.sendKeys("Viji@1703");
	  login.click();
	}
	@Test
	public void invalidCredentials() throws InterruptedException {
	 //Invalid Credentials
		WebElement user = driver.findElement(By.id("username"));
	    WebElement pwd = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		Thread.sleep(5000);
		  user.sendKeys("Muthulaks");
		  pwd.sendKeys("Viji@1703");
		  login.click();
	}
	@After
	public void testDone() {
		//close method
		browserClose();
	}
	@AfterClass
	public static void browserClose() {
	   System.out.println("Execution Completed");
	}
}
