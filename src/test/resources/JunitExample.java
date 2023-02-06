package org.erp.echain;

import com.base.utils.*;
import java.net.SocketException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitExample extends BaseClass{
	@BeforeClass
	public static void browser() {
		System.out.println("Execution Started");
	}
	@Before
	public void url() {
		browserOpen("chrome");
		geturl("https://www.amazon.in/");	
	}
	@Test
	public void onePlus() {
		
		WebElement onePlus = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		onePlus.sendKeys("OnePlus");
		onePlus.submit();
		List<WebElement> count = driver.findElements(By.xpath("//*[contains (text(), 'OnePlus')]"));
		for(WebElement text:count)
			System.out.println(text.getText());
		System.out.println("Text Count of OnePlus = " +count.size());
	}
	@Test
	public void Shirt() {
		WebElement onePlus = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		onePlus.sendKeys("Shirt");
		onePlus.submit();
		List<WebElement> count1 = driver.findElements(By.xpath("//*[contains(text(), 'Shirt')]"));
		for(WebElement text:count1)
			System.out.println(text.getText());
		System.out.println("Text Count of Shirt = " +count1.size());
	}
	@After
	public void Close() {
		close();
		}
	@AfterClass
	public static void last() {
		System.out.println("Execution Completed");
	}
}
