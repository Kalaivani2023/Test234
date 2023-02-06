package adactin.login;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import traning.jan.project.BaseClass;

public class LoginAdactin1 extends BaseClass{
	public LoginAdactin1() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@name='username']")
private WebElement user;

public WebElement getUser() {
	return user;
}
@FindBy(xpath="//input[@id='password']")
private WebElement pwd;

public WebElement getPwd() {
	return pwd;
}
@FindBy(xpath="//input[@id='login']")
private WebElement login;

public WebElement getLogin() {
	return login;
}
}

