package com.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ScriptTwo extends BaseClass{

	@Test
	public void enterJava() {
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java");
	}
}
