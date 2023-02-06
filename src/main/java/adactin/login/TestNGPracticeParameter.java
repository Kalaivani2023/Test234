package adactin.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import traning.jan.project.BaseClass;

public class TestNGPracticeParameter extends BaseClass{
	@Parameters("browser")
	@BeforeSuite
	public void browser(String browser) {
		browserLaunch(browser);
		
	}
	@Parameters("url")
	@BeforeClass
	public void loadUrl(String url) {
		launchUrl(url);
	}
	@Parameters("data")
	@Test
	public void searchJava(String data) {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(data, Keys.ENTER);
	}
}