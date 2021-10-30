package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location extends BaseClassMain {
	public Location() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	public WebElement location;
	@FindBy(id="hotels")
	public WebElement hotels;
	@FindBy(id="room_type")
	public WebElement roomType;
	@FindBy(id="room_nos")
	public WebElement noRoom;
	@FindBy(id="datepick_in")
	public WebElement dateCheckin;
	@FindBy(id="datepick_out")
	public WebElement dateCheckout;
	@FindBy(id="adult_room")
	public WebElement adult;
	@FindBy(id="child_room")
	public WebElement child;
	@FindBy(id="Submit")
	public WebElement search;
	
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoRoom() {
		return noRoom;
	}
	public WebElement getDateCheckin() {
		return dateCheckin;
	}
	public WebElement getDateCheckout() {
		return dateCheckout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
	

}
