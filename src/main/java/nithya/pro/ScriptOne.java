package com.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ScriptOne extends BaseClass{
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Execution Started");
	}
	@Parameters("browser")
	@Test
	public static void validCredentials(String browser) {
		browserOpen(browser);
		loadUrl("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		dataSend(user, "Muthulakshmi07");
		dataSend(pwd, "Viji@1703");
		click(login);
	}
	@AfterTest
	public void afterTest() {
		pageClose();

	}
}
