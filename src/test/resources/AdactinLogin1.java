package com.test.junit;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class AdactinLogin extends BaseClass{
	@Test
	public void login() throws IOException {
		browserOpen("chrome");
		geturl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 1, 0));
	    WebElement password = driver.findElement(By.xpath("//input[@name ='password']"));
	    password.sendKeys(readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 1, 1));
	    WebElement login = driver.findElement(By.xpath("//input[@name ='login']"));
	    login.click();
	}

}
