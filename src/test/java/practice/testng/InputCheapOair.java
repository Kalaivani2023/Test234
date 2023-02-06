package practice.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import traning.jan.project.BaseClass;

public class InputCheapOair extends BaseClass{
	public static void InuputForCheapAir() {
		try {
			browserLaunch("chrome");
			launchUrl("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement from = driver.findElement(By.xpath("//input[@name='field-keywords']"));
			from.sendKeys(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\TestNg reports.xlsx", 0,4,0));
			System.out.println(from);
			WebElement search =driver.findElement(By.xpath("//input[@value='Go']"));
			search.click();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

	private static void senddata(BrowserLaunch2 browserLaunch2, String data) {
		// TODO Auto-generated method stub
		
	}
}
