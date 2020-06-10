package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class SelectPage extends LibGlobal {
	public SelectPage() {
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement selHotel;
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getSelHotel() {
		return selHotel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
