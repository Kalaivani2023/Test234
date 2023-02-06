package traning.jan.project;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinTaskJunit extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Exection Started");
	}
	@Before
	public void launchurlJunit () {
		System.out.println("check");
		
	}
	@Test
	public void validCredentials() throws IOException {
		browserLaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");		
		  WebElement user = driver.findElement(By.id("username"));
		  user.sendKeys(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 1, 0));
		  WebElement pwd = driver.findElement(By.id("password"));
		  pwd.sendKeys(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 1, 1));
		  WebElement login = driver.findElement(By.id("login"));
		  login.click();
		}
	@After
	public void testDone () {
//close();
		System.out.println("After");
	}
@AfterClass
public static void afterClass() {
	System.out.println("Test Completed");
}
}
