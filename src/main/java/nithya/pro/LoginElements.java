package POM.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.org.BaseClass1;

public class LoginElements extends BaseClass1{
	public void LoginElements() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	private WebElement user; 
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getuser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}

}
