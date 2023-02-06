package practice.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import traning.jan.project.BaseClass;

public class FacebookLoginone extends BaseClass{
	public FacebookLoginone() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@id='email']")
private WebElement id;
@FindBy (xpath="//input[@id='pass']")
private WebElement pass;
@FindBy(xpath="//button[@name='login']")
private WebElement login;

public WebElement getId() {
	return id;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}
}
