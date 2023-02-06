package POM.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.org.BaseClass1;

public class HotelSearch extends BaseClass1{
	public void HotelSearch() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement room;
	
	@FindBy(name="room_nos")
	private WebElement nor;
	
	@FindBy(name="datepick_in")
	private WebElement checkIn;
	
	@FindBy(name="datepick_out")
	private WebElement checkOut;
	
	@FindBy(name="adult_room")
	private WebElement adult;
	
	@FindBy(name="child_room")
	private WebElement child;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
	public WebElement getLoca() {
		return location;
	}
	public WebElement gethotel() {
		return hotel;	
	}
	public WebElement getType() {
		return room;
	}
	public WebElement getrooms() {
		return nor;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getadult() {
		return adult;
	}
	public WebElement getchild() {
		return child;
	}
	public WebElement getsubmit() {
		return submit;
	}
}
