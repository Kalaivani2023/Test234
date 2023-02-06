package com.page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class SearchHotelPageLocator extends BaseClass {
	public SearchHotelPageLocator()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
    @FindBy(id="hotels")
    private WebElement hotel;
	public WebElement getHotel() {
		return hotel;
	}
    @FindBy(xpath="//select[@id='room_type']")
    private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noOfRooms;
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	@FindBy(name="datepick_in")
	private WebElement CheckInDate;
	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	@FindBy(name="datepick_out")
	private WebElement CheckOutDate;
	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}
	@FindBy(name="adult_room")
	private WebElement adultRoom;
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childroom;
	public WebElement getChildroom() {
		return childroom;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
}
