package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class BookingPage extends LibGlobal {
	
	public BookingPage() {
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(id = "cc_num")
	private WebElement txtCcNuml;
	@FindBy(id = "cc_type")
	private WebElement selCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement selExpMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement selExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement txtCvvnum;
	@FindBy(id = "book_now")
	private WebElement btnBook;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCcNuml() {
		return txtCcNuml;
	}
	public WebElement getSelCardType() {
		return selCardType;
	}
	public WebElement getSelExpMonth() {
		return selExpMonth;
	}
	public WebElement getSelExpYear() {
		return selExpYear;
	}
	public WebElement getTxtCvvnum() {
		return txtCvvnum;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}

}
