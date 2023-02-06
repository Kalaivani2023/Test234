package com.page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class SelectHotelLocator extends BaseClass {
	public SelectHotelLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radiobutton;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	@FindBy(xpath="//input[@name='continue']")
	private WebElement btn;
	public WebElement getBtn() {
		return btn;
	}

}
