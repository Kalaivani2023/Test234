package com.test.junit;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class AdactinConfirm extends BaseClass{
	@Test
	public void Confirm() throws IOException {
		WebElement submit = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		submit.click();
		WebElement confirm = driver.findElement(By.xpath("//input[@id='continue']"));
		confirm.click();
		takeScreenshot("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\ScreenShot\\Image.png");
	}

}
