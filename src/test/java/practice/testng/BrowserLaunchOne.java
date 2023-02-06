package practice.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import traning.jan.project.BaseClass;

public class BrowserLaunchOne extends BaseClass {
	
	public BrowserLaunchOne() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='from0']")
	WebElement from;
	public WebElement getFrom() {
		return from;
	}
	@FindBy(xpath = "//input[@id='to0']")
	WebElement to;
	public WebElement getTo() {
		return to;
	}
	@FindBy(xpath="//input[@id='cal0']")
		WebElement date;
	public WebElement getDate() {
		return date;
	}
	@FindBy(xpath="//*[contains(text(), 'Traveler')][1]")
	private WebElement traveler;
	public WebElement getTraveler() {
		return traveler;
	}
	@FindBy(xpath="//input[@id='searchNow']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
}
