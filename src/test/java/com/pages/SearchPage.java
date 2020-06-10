package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class SearchPage extends LibGlobal {

	public SearchPage() {
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = "location")
	private WebElement selLocation;
	@FindBy(id = "hotels")
	private WebElement selHotel;
	@FindBy(id = "room_type")
	private WebElement selRoomtype;
	@FindBy(id = "room_nos")
	private WebElement selRooms;
	@FindBy(id = "adult_room")
	private WebElement selAdults;
	@FindBy(id = "child_room")
	private WebElement selChild;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getSelLocation() {
		return selLocation;
	}

	public WebElement getSelHotel() {
		return selHotel;
	}

	public WebElement getSelRoomtype() {
		return selRoomtype;
	}

	public WebElement getSelRooms() {
		return selRooms;
	}

	public WebElement getSelAdults() {
		return selAdults;
	}

	public WebElement getSelChild() {
		return selChild;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

}
