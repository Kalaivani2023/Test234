package practice.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import traning.jan.project.BaseClass;

public class BrowserLaunch2  extends BaseClass {
	public BrowserLaunch2() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	}
