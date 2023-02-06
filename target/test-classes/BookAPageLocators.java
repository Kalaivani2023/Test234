package com.page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class BookAPageLocators extends BaseClass {
	public BookAPageLocators()
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditcarno;

	public WebElement getCreditcarno() {
		return creditcarno;
	}
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cctype;

	public WebElement getCctype() {
		return cctype;
	}
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expmonth;

	public WebElement getExpmonth() {
		return expmonth;
	}
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expyear;

	public WebElement getExpyear() {
		return expyear;
		}
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement ccvnumber;

	public WebElement getCcvnumber() {
		return ccvnumber;
	}
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
}
