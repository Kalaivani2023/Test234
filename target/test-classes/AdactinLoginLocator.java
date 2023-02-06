package com.page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class AdactinLoginLocator extends BaseClass {
	public AdactinLoginLocator()
	{
		PageFactory.initElements(driver, this);
		}
		
	@FindBy(id="username")
	private WebElement usernam;

	public WebElement getUsernam() {
		return usernam;
	}
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwor;

	public WebElement getPasswor() {
		return passwor;
	}

	@FindBy(xpath="//input[@name='login']")
	private WebElement btn;

	public WebElement getBtn() {
		return btn;
	}


}
