package traning.jan.project;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitAmazon extends BaseClass{

	@BeforeClass
	public static void step1() {
		System.out.println("Start Execution");
	}
	@Before
	public void amazonLaunch() {
		browserLaunch("chrome");
		launchUrl("https://www.amazon.in/");
	}
@Test
public void amazonSearch () {
	WebElement onePlus = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	onePlus.sendKeys("OnePlus");
	WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	search.click();
	List<WebElement> onePlusCount = driver.findElements(By.xpath("//span[contains(text(), 'OnePlus')]"));
	System.out.println("Count :" +onePlusCount.size());
	//for (int i = 0; i<onePlusCount.size(); i++) {
	//String countOfPlus =  onePlusCount.get(i);
}
}

